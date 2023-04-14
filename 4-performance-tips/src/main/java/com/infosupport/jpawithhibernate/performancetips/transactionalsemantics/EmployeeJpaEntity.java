package com.infosupport.jpawithhibernate.performancetips.transactionalsemantics;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class EmployeeJpaEntity {
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "manager")
    private boolean manager;

    @Column(name = "salary")
    private int salary;

    protected EmployeeJpaEntity() {
    }

    public EmployeeJpaEntity(String name, boolean manager, int salary) {
        this.name = name;
        this.manager = manager;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isManager() {
        return manager;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmployeeJpaEntity{" +
            "name='" + name + '\'' +
            ", manager=" + manager +
            ", salary=" + salary +
            '}';
    }
}
