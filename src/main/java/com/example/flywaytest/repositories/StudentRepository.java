package com.example.flywaytest.repositories;

import com.example.flywaytest.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentRepository extends JpaRepository<Student, UUID> {
    Student findByName(String name);
}
