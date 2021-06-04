package com.example.restfulapispringboot.controller;

import com.example.restfulapispringboot.model.entity.Student;
import com.example.restfulapispringboot.model.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    public final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/get-all")
    public ResponseEntity<?> getStudents () {
        List result = (ArrayList) studentService.findAll();
        return ResponseEntity.ok(result);
    }
}
