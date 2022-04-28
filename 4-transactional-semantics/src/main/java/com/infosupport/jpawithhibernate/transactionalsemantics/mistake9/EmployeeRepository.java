package com.infosupport.jpawithhibernate.transactionalsemantics.mistake9;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeJpaEntity, Integer> {
}
