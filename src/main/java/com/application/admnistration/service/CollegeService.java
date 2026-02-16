package com.application.admnistration.service;

import com.application.admnistration.entity.CollegeAdmnistration;
import com.application.admnistration.repository.CollegeRepository;
import com.application.admnistration.repository.ProfessorRepository;
import com.application.admnistration.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class CollegeAdmService {
    private final CollegeRepository collegeRepository;
    private final ProfessorRepository professorRepository;
    private final StudentRepository studentRepository;


    @Transactional
    public CollegeAdmnistration updateQuantities() {

        CollegeAdmnistration college = collegeRepository.findAll().get(0);

        long totalStudents = studentRepository.count();
        long totalProfessors = professorRepository.count();

        college.setQuantitysOfStudents((int) totalStudents);
        college.setQuantitysOfProfessors((int) totalProfessors);

        return collegeRepository.save(college);
    }

    //EXPECTED 1 ID REGISTERED IN THE DATA-BASE
    public CollegeAdmnistration getCollegeAdmnistrationInformation(){
        return collegeRepository.getReferenceById(1L);
    }
}
