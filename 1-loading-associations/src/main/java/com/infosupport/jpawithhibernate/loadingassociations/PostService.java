package com.infosupport.jpawithhibernate.loadingassociations;

import org.springframework.stereotype.Service;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public String getSummary(int postId) {
        // TODO: Return a summary of the post using various loading techniques
        return "Nothing yet";
    }
}
