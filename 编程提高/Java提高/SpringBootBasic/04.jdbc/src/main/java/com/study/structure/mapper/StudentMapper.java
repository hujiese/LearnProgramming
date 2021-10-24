package com.study.structure.mapper;

import com.study.structure.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentMapper {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Student> getAllStu() {
        String sql = "select * from student";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper(Student.class));
    }

    public Student getStuInfoById(int id) {
        String sql = "select * from student where id = ?";

        List<Student> list = jdbcTemplate.query(sql, new Object[]{id}, new BeanPropertyRowMapper(Student.class));
        if(list!=null && list.size()>0){
            return list.get(0);
        }else {
            return null;
        }
    }

    public int addStuInfo(Student student) {
        String sql = "insert into student(name,gender) values(?,?)";
        return jdbcTemplate.update(sql, student.getName(), student.isGender());
    }

    public int addStuInfo(Integer id, Student student) {
        String sql = "update student set name=?, gender=? where id=?";
        return jdbcTemplate.update(sql, student.getName(), student.isGender(), id);
    }

    public int delStuInfo(Integer id) {
        String sql = "delete from student where id=?";
        return jdbcTemplate.update(sql, id);
    }
}
