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

    @GetMapping("/info/{id}")
    public Object getStuInfoByPathVar(@PathVariable("id") Integer id) {
        Student student = studentService.getStuInfoById(id);
        if (student != null) {
            return student;
        } else {
            return new Student();
        }
    }

    @PutMapping("/info")
    public int addStuInfo(@RequestBody Student student) {
        return studentService.addStuInfo(student);
    }

    @PutMapping("/info/{id}")
    public int updateStuInfo(@PathVariable("id") Integer id, @RequestBody Student student) {
        return studentService.addStuInfo(id, student);
    }

    @DeleteMapping("/info/{id}")
    public int delStuInfo(@PathVariable("id") Integer id) {
        return studentService.delStuInfo(id);
    }
}
