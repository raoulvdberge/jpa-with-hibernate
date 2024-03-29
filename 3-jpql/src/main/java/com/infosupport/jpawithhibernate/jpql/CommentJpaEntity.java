package com.infosupport.jpawithhibernate.jpql;

import jakarta.persistence.*;

@Entity
@Table(name = "comments")
public class CommentJpaEntity {
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @ManyToOne(fetch = FetchType.EAGER)
    private PostJpaEntity post;

    @Column(name = "content")
    private String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PostJpaEntity getPost() {
        return post;
    }

    public void setPost(PostJpaEntity post) {
        this.post = post;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
