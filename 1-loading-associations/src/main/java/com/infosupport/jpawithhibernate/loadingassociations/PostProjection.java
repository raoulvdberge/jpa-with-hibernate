package com.infosupport.jpawithhibernate.loadingassociations;

public class PostProjection {
    private final String name;
    private final String content;

    public PostProjection(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }
}
