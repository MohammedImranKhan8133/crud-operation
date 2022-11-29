package com.imran.crudoperation.demo.service;

import com.imran.crudoperation.demo.entity.Student;
import com.imran.crudoperation.demo.repository.StudentRepository;
import org.aspectj.weaver.AjcMemberMaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StudentServiceImp implements StudentService{
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public Student fetchById(long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void deleteStudentById(long id) {
      studentRepository.deleteById(id);
    }

    @Override
    public List<Student> studentByDepartment(String department) {
       return studentRepository.findBystudentDepartment(department);
    }

    @Override
    public List<Student> studentByName(String name) {
        return studentRepository.findBystudentName(name);
    }

    @Override
    public Student updateStudentById(long id,Student student) {

        Student studentDB=studentRepository.findById(id).get();

        if(Objects.nonNull(student.getStudentName()) && !"".equalsIgnoreCase(student.getStudentName())){
              studentDB.setStudentName(student.getStudentName());
        }

        if(Objects.nonNull(student.getStudentDepartment()) && !"".equalsIgnoreCase(student.getStudentDepartment())){
            studentDB.setStudentDepartment(student.getStudentDepartment());
        }
        return studentRepository.save(studentDB);
    }
}
