package com.infosupport.jpawithhibernate.loadingassociations;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Transactional
    public String getSummary(int postId) {
        StringBuilder builder = new StringBuilder();

        PostJpaEntity post = postRepository.findById(postId).orElseThrow();

        addHeading(builder, post);
        addComments(builder, post);

        return builder.toString();
    }

    private void addHeading(StringBuilder builder, PostJpaEntity post) {
        builder.append(String.format("#%d - %s\n", post.getId(), post.getTitle()));
    }

    private void addComments(StringBuilder builder, PostJpaEntity post) {
        post.getComments().forEach(comment -> addComment(builder, comment));
    }

    private void addComment(StringBuilder builder, CommentJpaEntity comment) {
        builder.append(String.format("Comment #%d - %s\n", comment.getId(), comment.getContent()));
    }
}
