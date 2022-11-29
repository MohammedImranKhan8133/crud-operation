package com.imran.crudoperation.demo.controller;

import com.imran.crudoperation.demo.entity.Student;
import com.imran.crudoperation.demo.service.StudentService;
import jakarta.validation.Valid;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;
    private static final Logger logger= LoggerFactory.getLogger(StudentController.class);

    @PostMapping("/student/insert")
    public Student insertStudent(@Valid @RequestBody Student student){
            studentService.saveStudent(student);
            logger.info(String.valueOf(student));
        return student;
    }

    @GetMapping("/student/getAll")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable long id){
        return studentService.fetchById(id);
    }

    @DeleteMapping("/student/delete/{id}")
    public void deleteStudent(@PathVariable long id){
        studentService.deleteStudentById(id);
    }

    @GetMapping("/student/department/{name}")
    public List<Student> getStudentByDepartment(@PathVariable(name ="name") String department){
       return studentService.studentByDepartment(department);
    }

    @GetMapping("/student/name/{name}")
    public List<Student> getStudentByName(@PathVariable(name ="name") String name){
        return studentService.studentByName(name);
    }

    @PutMapping("/student/update/{id}")
    public Student updateStudent(@PathVariable long id,@Valid @RequestBody Student student){
        return studentService.updateStudentById(id,student);
    }

}
