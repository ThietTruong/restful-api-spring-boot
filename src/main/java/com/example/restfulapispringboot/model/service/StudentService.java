package com.example.restfulapispringboot.model.service;

import com.example.restfulapispringboot.model.entity.Student;
import com.example.restfulapispringboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Iterable<Student> findAll(){
        return studentRepository.findAll();
    }
}
