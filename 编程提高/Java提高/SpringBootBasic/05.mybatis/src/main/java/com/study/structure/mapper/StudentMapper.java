package com.study.structure.mapper;

import com.study.structure.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    List<Student> getAllStu();

    Student getStuInfoById(int id);
}
