package com.infosupport.jpawithhibernate.loadingassociations;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public String getSummary(int postId) {
        return "nothing :(";
    }
}
