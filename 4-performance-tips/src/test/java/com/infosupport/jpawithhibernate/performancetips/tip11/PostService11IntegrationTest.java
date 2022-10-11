package com.infosupport.jpawithhibernate.performancetips.tip11;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PostService11IntegrationTest {
    @Autowired
    PostService11 sut;

    @Test
    void shouldProxy() {
        sut.addComment(1, "test");
    }
}
