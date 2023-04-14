package com.infosupport.jpawithhibernate.performancetips.proxygetter;

import com.infosupport.jpawithhibernate.performancetips.transactionaltests.CommentJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<CommentJpaEntity, Integer> {
}
