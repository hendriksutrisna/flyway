package com.example.flywaytest.services.impl;

import com.example.flywaytest.models.Student;
import com.example.flywaytest.repositories.StudentRepository;
import com.example.flywaytest.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findByName(String name) {
        return studentRepository.findByName(name);
    }

    @Override
    public void delete(UUID id) {
        studentRepository.deleteById(id);
    }
}
