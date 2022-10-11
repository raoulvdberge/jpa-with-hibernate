package com.infosupport.jpawithhibernate.performancetips.tip9;

import org.assertj.core.api.recursive.comparison.RecursiveComparisonConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class EmployeeServiceTest {
    private static final RecursiveComparisonConfiguration IGNORE_IDS = RecursiveComparisonConfiguration
        .builder()
        .withIgnoredFields("id")
        .build();

    @Autowired
    EmployeeService sut;

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    void shouldBeAbleToGiveRaiseToManagers() {
        // Arrange
        addEmployee("Raoul", false, 1000);
        addEmployee("Tim", true, 1000);

        // Act
        sut.giveRaiseToManagers();

        // Assert
        var employees = employeeRepository.findAll();

        assertThat(employees)
            .usingRecursiveFieldByFieldElementComparator(IGNORE_IDS)
            .containsExactlyInAnyOrder(
                new EmployeeJpaEntity("Raoul", false, 1000),
                new EmployeeJpaEntity("Tim", true, 2000)
            );
    }

    private void addEmployee(String name, boolean manager, int salary) {
        EmployeeJpaEntity entity = new EmployeeJpaEntity();
        entity.setName(name);
        entity.setManager(manager);
        entity.setSalary(salary);
        employeeRepository.save(entity);
    }
}
