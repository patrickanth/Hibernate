package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "enrollments")
public class Enrollments {

    @Id
    private long idEnrollments;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idClassEnrollment", nullable = false)
    private Classes classesEnrollment;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idStudentsEnrollment", nullable = false)
    private Students studentsEnrollment;

}
