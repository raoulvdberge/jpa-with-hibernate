package com.infosupport.jpawithhibernate.performancetips.transactionalsemantics;

import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public void giveRaiseToManagers() {
        repository.findAll().forEach(this::tryGiveRaiseToManager);
    }

    private void tryGiveRaiseToManager(EmployeeJpaEntity employeeEntity) {
        employeeEntity.setSalary(employeeEntity.getSalary() * 2);
        // Only managers get the raise...
        if (employeeEntity.isManager()) {
            repository.save(employeeEntity);
        }
    }
}
