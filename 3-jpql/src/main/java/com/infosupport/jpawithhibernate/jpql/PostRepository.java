package com.infosupport.jpawithhibernate.jpql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostJpaEntity, Integer> {
    // TODO: Custom query with JOIN FETCH to avoid the N+1 query problem.
}
