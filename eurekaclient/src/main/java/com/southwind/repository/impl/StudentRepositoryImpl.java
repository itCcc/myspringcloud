package com.southwind.repository.impl;

import com.southwind.entity.Student;
import com.southwind.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author solang
 * @date 2019-09-26 14:16
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Long,Student> studentMap;

    static {
        studentMap=new HashMap<>();
        studentMap.put(1l,new Student(1l,"林徽因",19));
        studentMap.put(2l,new Student(2l,"巩俐",18));
        studentMap.put(3l,new Student(3l,"赵霁",17));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(Long id) {
        return studentMap.get(id);
    }

    @Override
    public void save(Student student) {
            studentMap.put(student.getId(), student);
    }

    @Override
    public void update(Student student) {
            studentMap.put(student.getId(),student);
    }

    @Override
    public void delete(Long id) {
            studentMap.remove(id);
    }
}
