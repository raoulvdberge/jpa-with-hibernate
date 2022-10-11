package com.infosupport.jpawithhibernate.performancetips.tip11;

import com.infosupport.jpawithhibernate.performancetips.tip3.CommentJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<CommentJpaEntity, Integer> {
}
