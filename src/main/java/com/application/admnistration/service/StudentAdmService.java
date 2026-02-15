package com.application.admnistration.service;

import com.application.admnistration.entity.entities.StudentAdmnistration;
import com.application.admnistration.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentAdmService {
    private final StudentRepository studentRepository;

    public StudentAdmnistration createStudent(StudentAdmnistration studentAdmnistration) {
        return studentRepository.save(studentAdmnistration);
    }

    public StudentAdmnistration updateStudent(StudentAdmnistration student) {
        StudentAdmnistration studentLocal = studentRepository.findById(student.getIdStudent())
                .orElseThrow(() -> new RuntimeException("No User Found"));

        studentLocal.setNameStudent(student.getNameStudent());
        studentLocal.setEmailStudent(student.getEmailStudent());
        studentLocal.setAgeStudent(student.getAgeStudent());
        studentLocal.setCpfStudent(student.getCpfStudent());
        studentLocal.setRgStudent(student.getRgStudent());
        studentLocal.setHeightStudent(student.getHeightStudent());

        return studentRepository.save(student);
    }

    public Optional<StudentAdmnistration> getStudentById(StudentAdmnistration student) {
        StudentAdmnistration studentLocal = studentRepository.findById(student.getIdStudent())
                .orElseThrow(() -> new RuntimeException("No User Found"));
        
        return studentRepository.findById(studentLocal.getIdStudent());
    }
    
    public List<StudentAdmnistration> getAllStudents(){
        return studentRepository.findAll();
    }

    public void deleteStudent(StudentAdmnistration student) {
        StudentAdmnistration studentLocal = studentRepository.findById(student.getIdStudent())
                .orElseThrow(() -> new RuntimeException("User Not Found"));

        studentRepository.delete(studentLocal);
    }

}
