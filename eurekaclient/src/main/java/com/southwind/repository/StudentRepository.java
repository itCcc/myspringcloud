package com.southwind.repository;

import com.southwind.entity.Student;

import java.util.Collection;

/**
 * @author solang
 * @date 2019-09-26 13:59
 */

public interface StudentRepository {

    public Collection<Student> findAll();

    public Student findById(Long id);

    public void save(Student student);

    public void update(Student student);

    public void delete(Long id);
}
