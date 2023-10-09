package com.example.elasticsearch.elasticsearchproject.Controller;

import com.example.elasticsearch.elasticsearchproject.Models.Student;
import com.example.elasticsearch.elasticsearchproject.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
}
