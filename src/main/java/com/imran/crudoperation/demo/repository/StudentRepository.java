package com.imran.crudoperation.demo.repository;

import com.imran.crudoperation.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    public List<Student> findBystudentDepartment(String department);
    public List<Student> findBystudentName(String name);
}
