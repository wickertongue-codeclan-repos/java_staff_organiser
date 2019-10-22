package com.codeclan.example.staff_organiser.repositories;

import com.codeclan.example.staff_organiser.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
