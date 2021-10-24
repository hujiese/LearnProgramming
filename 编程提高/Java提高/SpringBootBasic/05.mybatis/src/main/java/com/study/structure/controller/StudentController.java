package com.study.structure.controller;

import com.study.structure.entity.Student;
import com.study.structure.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public List<Student> listStudents() {
        return studentService.getAllStu();
    }

    @GetMapping("/info")
    public Object getStuInfoByQueryPara(@RequestParam("id") int id) {
        Student student = studentService.getStuInfoById(id);
        if (student != null) {
            return student;
        } else {
            return new Student();
        }
    }
}
