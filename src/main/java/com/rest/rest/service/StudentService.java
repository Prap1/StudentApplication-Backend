package com.rest.rest.service;

import com.rest.rest.models.Student;
import com.rest.rest.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }


    public Student getStudentById(String id) {
        // TODO Auto-generated method stub
        return studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("there's no such server"));
    }


    public Student add(Student student) {
        // TODO Auto-generated method stub
        return studentRepository.save(student);
    }


    public void delete(String id) {
        // TODO Auto-generated method stub
        studentRepository.deleteById(id);
    }


    public List<Student> getStudentByName(String name) {
        // TODO Auto-generated method stub
        return studentRepository.findStudentsByName(name);
    }

}

