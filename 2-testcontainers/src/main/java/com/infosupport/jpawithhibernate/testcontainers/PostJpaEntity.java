package com.infosupport.jpawithhibernate.testcontainers;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "posts")
public class PostJpaEntity {
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "content")
    private String content;

    @OneToMany(mappedBy = "post")
    private List<CommentJpaEntity> comments;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String comment) {
        this.content = comment;
    }

    public List<CommentJpaEntity> getComments() {
        return comments;
    }

    public void setComments(List<CommentJpaEntity> comments) {
        this.comments = comments;
    }
}
