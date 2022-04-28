package com.infosupport.jpawithhibernate.testcontainers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;

import static org.assertj.core.api.Assertions.assertThat;

class PostRepositoryIntegrationTest extends BaseIntegrationTest {
    @Autowired
    PostRepository postRepository;

    @Test
    @Sql("classpath:test-data.sql")
    void shouldBeAbleToRetrievePosts() {
        // Act
        assertThat(postRepository.findAll()).hasSize(1);
    }
}
