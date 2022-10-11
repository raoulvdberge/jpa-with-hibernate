package com.infosupport.jpawithhibernate.loadingassociations;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class PostRepositoryIntegrationTest {
    @Autowired
    PostRepository postRepository;

    @Test
    @Sql("classpath:test-data.sql")
    void shouldBeAbleToRetrievePostProjection() {
        // TODO
    }
}
