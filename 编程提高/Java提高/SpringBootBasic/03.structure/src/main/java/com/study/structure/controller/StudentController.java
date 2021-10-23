package com.study.structure.controller;

import com.study.structure.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public String listStudents() {
        return studentService.getAllStu();
    }
}
