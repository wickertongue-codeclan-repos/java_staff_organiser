package com.codeclan.example.staff_organiser.repositories;

import com.codeclan.example.staff_organiser.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
