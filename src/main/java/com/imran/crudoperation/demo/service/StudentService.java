package com.imran.crudoperation.demo.service;

import com.imran.crudoperation.demo.entity.Student;

import java.util.List;

public interface StudentService {

     public Student saveStudent(Student student);

   public List<Student> getAllStudent();

   public Student fetchById(long id);

   public void deleteStudentById(long id);

   public List<Student> studentByDepartment(String department);

   public List<Student> studentByName(String name);

 public Student updateStudentById(long id,Student student);
}
