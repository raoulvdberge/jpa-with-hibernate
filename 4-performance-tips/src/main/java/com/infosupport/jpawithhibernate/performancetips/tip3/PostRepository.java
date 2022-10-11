package com.infosupport.jpawithhibernate.performancetips.tip3;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostJpaEntity, Integer> {
}
