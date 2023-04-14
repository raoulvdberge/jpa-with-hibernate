package com.infosupport.jpawithhibernate.jpql;

import jakarta.persistence.*;

@Entity
@Table(name = "tags")
public class TagJpaEntity {
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @ManyToOne(fetch = FetchType.EAGER)
    private PostJpaEntity post;

    @Column(name = "name")
    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
