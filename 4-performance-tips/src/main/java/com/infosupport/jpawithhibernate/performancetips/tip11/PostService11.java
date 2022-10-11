package com.infosupport.jpawithhibernate.performancetips.tip11;

import com.infosupport.jpawithhibernate.performancetips.tip3.CommentJpaEntity;
import com.infosupport.jpawithhibernate.performancetips.tip3.PostJpaEntity;
import com.infosupport.jpawithhibernate.performancetips.tip3.PostRepository;
import org.springframework.stereotype.Service;

@Service
public class PostService11 {
    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    public PostService11(PostRepository postRepository, CommentRepository commentRepository) {
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
