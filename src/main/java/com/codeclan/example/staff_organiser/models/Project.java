package com.codeclan.example.staff_organiser.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "duration")
    private int duration;

    @JsonIgnoreProperties(value = "projects")
    @ManyToMany
    @JoinTable(
            name = "employees_projects",
            joinColumns = { @JoinColumn(
                    name = "project_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = { @JoinColumn(
                    name = "employee_id",
                    nullable = false,
                    updatable = false)
            })
    private List<Employee> employees;

    public Project(String name, int duration) {
        this.name = name;
        this.duration = duration;
        this.employees = new ArrayList<Employee>();
    }

    public Project() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployeeToProject(Employee employee) {
        employees.add(employee);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
