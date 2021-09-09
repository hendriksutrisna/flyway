package com.example.flywaytest.models;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Data
@Entity
@Table(name = Student.STUDENT)
public class Student implements Serializable {
    public static final String STUDENT = "student";
    private static final String ID = "id";
    private static final String NAME = "name";
    private static final String ADDRESS = "address";
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = Student.ID)
    @GeneratedValue
    @Type(type = "pg-uuid")
    private UUID id;

    @Column(name = Student.NAME)
    private String name;

    @Column(name = Student.ADDRESS)
    private String address;
}
