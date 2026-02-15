package com.application.admnistration.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "admnistration_college")
public class CollegeAdmnistration implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private Long idCollege = 1L;
    @Column(name = "cnpj_college", unique = true)
    private final String cnpjCollege = "21.329.842/0001-61";
    @Column(name = "quantity_students", nullable = false)
    private Integer quantitysOfStudents;
    @Column(name = "quantity_professors", nullable = false)
    private Integer QuantitysOfProfessors;
    @Enumerated(EnumType.STRING)
    private AvailableCourses availableCourses;

    public void setAvailableCourses(AvailableCourses availableCourses) {
        this.availableCourses = availableCourses;
    }

    public void setQuantitysOfProfessors(Integer quantitysOfProfessors) {
        QuantitysOfProfessors = quantitysOfProfessors;
    }

    public void setQuantitysOfStudents(Integer quantitysOfStudents) {
        this.quantitysOfStudents = quantitysOfStudents;
    }
}
