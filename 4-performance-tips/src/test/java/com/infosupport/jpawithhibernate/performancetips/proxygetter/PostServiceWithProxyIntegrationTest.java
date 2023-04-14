package com.infosupport.jpawithhibernate.performancetips.proxygetter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PostServiceWithProxyIntegrationTest {
    @Autowired
    PostServiceWithProxy sut;

    @Test
    void demoUsageOfProxyToAvoidAdditionalDatabaseCall() {
        sut.addComment(1, "test");
    }
}
