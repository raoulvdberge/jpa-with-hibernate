package com.infosupport.jpawithhibernate.loadingassociations;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class PostControllerIntegrationTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    @Sql(scripts = "classpath:test-data.sql")
    void shouldBeAbleToRetrieveSummaryOfPost() throws Exception {
        // TODO: Retrieve summary of post to test Open Session In View through Web Layer
    }
}
