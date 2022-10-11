package com.infosupport.jpawithhibernate.performancetips.transactionaltests;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import javax.transaction.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest
@AutoConfigureMockMvc
class PostControllerIntegrationTest {
    @Autowired
    MockMvc mockMvc;

    @Test
    @Transactional // Ensure that my stuff is cleaned up!
    void shouldBeAbleToRetrieveSummaryOfPost() throws Exception {
        // Act
        var result = mockMvc.perform(get("/post/1"));

        // Assert
        result
            .andDo(print())
            .andExpect(content().string("""
                #1 - My cat
                Comment #1 - I love your cat!
                Comment #2 - I hate cats.
                """));
    }
}
