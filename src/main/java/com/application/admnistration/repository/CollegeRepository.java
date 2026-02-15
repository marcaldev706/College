package com.application.admnistration.repository;

import com.application.admnistration.entity.CollegeAdmnistration;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CollegeRepository extends JpaRepository<CollegeAdmnistration, Long> {
}
