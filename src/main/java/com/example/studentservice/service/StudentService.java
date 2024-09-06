package com.example.studentservice.service;

import com.example.studentservice.exception.StudentNotFoundException;
import com.example.studentservice.model.Student;
import com.example.studentservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student getStudent(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id));
    }

    public Map<Long, Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student updateStudent(Long id, Student student) {
        if (!studentRepository.findById(id).isPresent()) {
            throw new StudentNotFoundException(id);
        }
        student.setId(id);
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        if (!studentRepository.findById(id).isPresent()) {
            throw new StudentNotFoundException(id);
        }
        studentRepository.deleteById(id);
    }
}
