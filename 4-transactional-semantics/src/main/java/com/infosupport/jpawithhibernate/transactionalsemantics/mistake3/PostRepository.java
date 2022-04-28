package com.infosupport.jpawithhibernate.transactionalsemantics.mistake3;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostJpaEntity, Integer> {
}
