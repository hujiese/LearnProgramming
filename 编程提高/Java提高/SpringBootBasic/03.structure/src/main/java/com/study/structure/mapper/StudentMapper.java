package com.study.structure.mapper;

import com.study.structure.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentMapper {

    public String getAllStu() {

        List<Student> list = new ArrayList<Student>();
        for(int i = 0; i < 5; ++i) {
            Student stu = new Student(i, "student-" + i);
            list.add(stu);
        }
        return list.toString();
    }
}
