package com.application.admnistration.repository;

import com.application.admnistration.entity.entities.StudentAdmnistration;
import org.springframework.data.jpa.repository.JpaRepository;



public interface StudentRepository extends JpaRepository<StudentAdmnistration, Long> {
}
