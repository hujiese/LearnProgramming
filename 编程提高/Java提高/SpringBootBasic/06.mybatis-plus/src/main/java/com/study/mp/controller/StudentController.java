package com.study.mp.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.study.mp.entity.Student;
import com.study.mp.service.StudentService;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jackster
 * @since 2021-10-24
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public List<Student> getStuList() {
        return studentService.list(null);
    }

    @GetMapping("/list/{id}")
    public Student getStuInfoById(@PathVariable("id") Integer id) {
        QueryWrapper<Student> wrapper = new QueryWrapper<>();
        wrapper.eq("id", id);
        Student student =  studentService.getOne(wrapper);
        return student;
    }
}

