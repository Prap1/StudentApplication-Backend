package com.rest.rest.controller;

import com.rest.rest.models.Student;
import com.rest.rest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudent()
    {
        return studentService.getStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable(value = "id") String id)
    {
        return studentService.getStudentById(id);
    }

    @PostMapping("/students")
    public Student addServer(@RequestBody Student student) {
        return studentService.add(student);
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable (value = "id") String id)
    {
        studentService.delete(id);
        return "SUCCESS";
    }

    @GetMapping("/getByName/{name}")
    public List<Student> getStudentByName(@PathVariable (value = "name") String name)
    {
        return studentService.getStudentByName(name);
    }



}
