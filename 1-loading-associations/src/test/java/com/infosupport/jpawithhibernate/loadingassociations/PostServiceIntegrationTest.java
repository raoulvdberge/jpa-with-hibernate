package com.infosupport.jpawithhibernate.loadingassociations;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class PostServiceIntegrationTest {
    @Autowired
    PostService sut;

    @Test
    @Sql(scripts = "classpath:test-data.sql")
    void shouldBeAbleToRetrieveSummaryOfPost() {
        // Act
        String summary = sut.getSummary(1);

        // Assert
        assertThat(summary).isEqualTo("""
            #1 - My cat
            Comment #1 - I love your cat!
            Comment #2 - I hate cats.
            """);
    }
}
