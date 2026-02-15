package com.application.admnistration.entity.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Entity
@Table(name = "student")
public class StudentAdmnistration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStudent;
    @Column(name = "name_student", nullable = false)
    private String nameStudent;
    @Column(name = "email_student", nullable = false, unique = true)
    private String emailStudent;
    @Column(name = "age_student", nullable = false)
    private Integer ageStudent;
    @Column(name = "height_student", nullable = false)
    private Double heightStudent;
    @Column(name = "cpf_student", nullable = false, unique = true)
    private Long cpfStudent;
    @Column(name = "rg_student", nullable = false, unique = true)
    private Long rgStudent;

    public void setAgeStudent(Integer ageStudent) {
        this.ageStudent = ageStudent;
    }

    public void setCpfStudent(Long cpfStudent) {
        this.cpfStudent = cpfStudent;
    }

    public void setEmailStudent(String emailStudent) {
        this.emailStudent = emailStudent;
    }

    public void setHeightStudent(Double heightStudent) {
        this.heightStudent = heightStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public void setRgStudent(Long rgStudent) {
        this.rgStudent = rgStudent;
    }
}
