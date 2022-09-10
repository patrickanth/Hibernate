package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "students")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idStudents;

    @Column(name = "student_name", nullable = false)
    private String firstName;

    @Column(name = "student_last_name", nullable = false)
    private String lastName;

    @Column(name = "student_email", nullable = false, unique = true)
    private String email;
}
