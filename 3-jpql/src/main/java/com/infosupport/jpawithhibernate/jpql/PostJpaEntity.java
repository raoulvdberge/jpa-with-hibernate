package com.infosupport.jpawithhibernate.jpql;

import javax.persistence.*;
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

    @OneToMany(mappedBy = "post", fetch = FetchType.LAZY)
    private List<CommentJpaEntity> lazyComments;

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

    public List<CommentJpaEntity> getLazyComments() {
        return lazyComments;
    }

    public void setLazyComments(List<CommentJpaEntity> lazyComments) {
        this.lazyComments = lazyComments;
    }
}
