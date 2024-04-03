package com.learn.learning;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class FirstController {
    private final StudentRepository repository;

    public FirstController(StudentRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String Home() {
        return "Home";
    }

    @PostMapping("/students")
    public Student PostStudent(@RequestBody Student student) {
        return repository.save(student);
    }

    @GetMapping("/students")
    public List<Student> GetStudents() {
        return repository.findAll();
    }

    @GetMapping("/students/{student-id}")
    public Student GetStudentById(
            @PathVariable("student-id") Integer id) {
        return repository.findById(id).orElse(null);
    }

}
