package com.example.elasticsearch.elasticsearchproject.Controller;

import com.example.elasticsearch.elasticsearchproject.Models.Student;
import com.example.elasticsearch.elasticsearchproject.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@CrossOrigin(origins = "*")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getStudents();
    }

    @PostMapping("/addstudent")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

}
