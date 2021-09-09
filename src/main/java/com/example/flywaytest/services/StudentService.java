package com.example.flywaytest.services;

import com.example.flywaytest.models.Student;

import java.util.UUID;

public interface StudentService {
    Student save(Student student);
    Student findByName(String name);
    void delete (UUID id);
}
