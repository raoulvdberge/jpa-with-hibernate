package com.infosupport.jpawithhibernate.loadingassociations;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostJpaEntity, Integer> {
    @Query("FROM PostJpaEntity p JOIN FETCH p.comments WHERE p.id = :id")
    PostJpaEntity getPostWithItsComments(@Param("id") int id);

    @Query("SELECT new com.infosupport.jpawithhibernate.loadingassociations.PostProjection(p.title, p.content) FROM PostJpaEntity p WHERE p.id = :id")
    PostProjection getPostProjection(@Param("id") int id);
}
