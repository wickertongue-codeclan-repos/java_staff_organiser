package com.codeclan.example.staff_organiser.repositories;

import com.codeclan.example.staff_organiser.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
