package com.infosupport.jpawithhibernate.performancetips.proxygetter;

import com.infosupport.jpawithhibernate.performancetips.transactionaltests.CommentJpaEntity;
import com.infosupport.jpawithhibernate.performancetips.transactionaltests.PostJpaEntity;
import com.infosupport.jpawithhibernate.performancetips.transactionaltests.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostServiceWithProxy {
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    public PostServiceWithProxy(PostRepository postRepository, CommentRepository commentRepository) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

    public void addComment(int postId, String content) {
        PostJpaEntity postReference = postRepository.getById(postId);
        CommentJpaEntity comment = new CommentJpaEntity();
        comment.setPost(postReference);
        comment.setContent(content);
        commentRepository.save(comment);
    }
}
