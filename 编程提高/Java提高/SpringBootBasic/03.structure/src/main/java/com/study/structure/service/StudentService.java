package com.study.structure.service;

import com.study.structure.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public String getAllStu() {
        return studentMapper.getAllStu();
    }
}
