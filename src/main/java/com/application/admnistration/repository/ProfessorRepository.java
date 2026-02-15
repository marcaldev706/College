package com.application.admnistration.repository;

import com.application.admnistration.entity.entities.ProfessorAdmnistration;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ProfessorRepository extends JpaRepository<ProfessorAdmnistration, Long> {
}
