package com.infosupport.jpawithhibernate.performancetips.transactionalsemantics;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeJpaEntity, Integer> {
}
