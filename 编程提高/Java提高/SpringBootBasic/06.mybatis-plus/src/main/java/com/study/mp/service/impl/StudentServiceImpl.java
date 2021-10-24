package com.study.mp.service.impl;

import com.study.mp.entity.Student;
import com.study.mp.mapper.StudentMapper;
import com.study.mp.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jackster
 * @since 2021-10-24
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
