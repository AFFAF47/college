package com.example.elasticsearch.elasticsearchproject.Services;

import com.example.elasticsearch.elasticsearchproject.Models.Student;
import com.example.elasticsearch.elasticsearchproject.Repositorys.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private IStudentRepository studentRepository;

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
}
