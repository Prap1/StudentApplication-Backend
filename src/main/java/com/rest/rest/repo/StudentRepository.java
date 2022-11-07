package com.rest.rest.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.rest.rest.models.Student;

import java.util.List;

public interface StudentRepository extends MongoRepository<Student,String> {
    public List<Student> findStudentsByName(String name);


}
