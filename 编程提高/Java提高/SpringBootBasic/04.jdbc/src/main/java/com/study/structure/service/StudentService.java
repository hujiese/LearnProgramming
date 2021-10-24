package com.study.structure.service;

import com.study.structure.entity.Student;
import com.study.structure.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public List<Student> getAllStu() {
        return studentMapper.getAllStu();
    }

    public Student getStuInfoById(int id) {
        return studentMapper.getStuInfoById(id);
    }

    public int addStuInfo(Student student) {
        return studentMapper.addStuInfo(student);
    }

    public int addStuInfo(Integer id, Student student) {
        return studentMapper.addStuInfo(id, student);
    }

    public int delStuInfo(Integer id) {
        return studentMapper.delStuInfo(id);
    }
}
