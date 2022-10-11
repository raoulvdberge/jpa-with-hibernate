package com.infosupport.jpawithhibernate.loadingassociations;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostJpaEntity, Integer> {
    // TODO: Custom query with JOIN FETCH

    // TODO: Custom query with JOIN FETCH and projections
}
