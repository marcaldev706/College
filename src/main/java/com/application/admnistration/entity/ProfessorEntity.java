package com.application.admnistration.entity.entities;

import com.application.admnistration.entity.AvailableCourses;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Entity
@Table(name = "professor")
public class ProfessorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProfessor;
    @Column(name = "name_professor", nullable = false)
    private String nameProfessor;
    @Column(name = "email_professor", nullable = false, unique = true)
    private String emailProfessor;
    @Column(name = "age_professor", nullable = false)
    private Integer ageProfessor;
    @Column(name = "height_professor", nullable = false)
    private Double heightProfessor;
    @Column(name = "cpf_professor", nullable = false, unique = true)
    private Long cpfProfessor;
    @Column(name = "rg_professor", nullable = false, unique = true)
    private Long rgProfessor;
    @Enumerated(EnumType.STRING)
    private final AvailableCourses availableCourses;

    public void setRgProfessor(Long rgProfessor) {
        this.rgProfessor = rgProfessor;
    }

    public void setNameProfessor(String nameProfessor) {
        this.nameProfessor = nameProfessor;
    }

    public void setHeightProfessor(Double heightProfessor) {
        this.heightProfessor = heightProfessor;
    }

    public void setEmailProfessor(String emailProfessor) {
        this.emailProfessor = emailProfessor;
    }

    public void setCpfProfessor(Long cpfProfessor) {
        this.cpfProfessor = cpfProfessor;
    }

    public void setAgeProfessor(Integer ageProfessor) {
        this.ageProfessor = ageProfessor;
    }
}
