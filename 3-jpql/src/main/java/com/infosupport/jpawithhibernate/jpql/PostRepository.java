package com.infosupport.jpawithhibernate.jpql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import javax.persistence.QueryHint;
import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<PostJpaEntity, Integer> {
    @Query("SELECT DISTINCT p FROM PostJpaEntity p JOIN FETCH p.lazyComments")
    @QueryHints({@QueryHint(name = "hibernate.query.passDistinctThrough", value = "false")})
    List<PostJpaEntity> findAllDistinctPostsWithTheirComments();
}
