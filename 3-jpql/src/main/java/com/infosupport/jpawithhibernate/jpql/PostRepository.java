package com.infosupport.jpawithhibernate.jpql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<PostJpaEntity, Integer> {
    @Query("SELECT p FROM PostJpaEntity p JOIN FETCH p.lazyComments")
    List<PostJpaEntity> findAllPostsWithTheirComments();
}
