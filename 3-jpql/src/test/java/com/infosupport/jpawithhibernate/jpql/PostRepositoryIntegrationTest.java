package com.infosupport.jpawithhibernate.jpql;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class PostRepositoryIntegrationTest {
    @Autowired
    PostRepository postRepository;

    @Autowired
    CommentRepository commentRepository;

    @Test
    @Sql("classpath:test-data.sql")
    @DisplayName("Demoes the N+1 query problem with lazy loading.")
    void demoN1QueryProblemWithLazyLoading() {
        var posts = postRepository.findAll();

        for (PostJpaEntity post : posts) {
            System.out.printf(
                "Post %s has %d comments%n",
                post.getTitle(),
                post.getLazyComments().size()
            );
        }
    }

    @Test
    @Sql("classpath:test-data.sql")
    @DisplayName("Demoes the N+1 query problem with eager loading.")
    void demoN1QueryProblemWithEagerLoading() {
        var comments = commentRepository.findAll();

        for (CommentJpaEntity comment : comments) {
            System.out.printf(
                "Comment '%s' on post %s%n",
                comment.getContent(),
                comment.getPost().getTitle()
            );
        }
    }

    @Test
    @Sql("classpath:test-data.sql")
    @DisplayName("Demo for fetch directive, as a solution for the N+1 query problem.")
    void demoFetchDirective() {
        var posts = postRepository.findAllPostsWithTheirComments();

        assertThat(posts).hasSize(2);

        for (PostJpaEntity post : posts) {
            int amountOfComments = post.getLazyComments().size();

            assertThat(amountOfComments).isEqualTo(2);

            System.out.printf(
                "Post %s has %d comments%n",
                post.getTitle(),
                amountOfComments
            );
        }
    }
}
