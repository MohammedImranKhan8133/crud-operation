package com.imran.crudoperation.demo.controller;

import com.imran.crudoperation.demo.entity.Student;
import com.imran.crudoperation.demo.service.StudentService;
import jakarta.validation.Valid;

<<<<<<< HEAD
import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;
        import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@Controller
@PropertySource("classpath:imran.properties")
public class StudentController {
    @Value("${trade}")
    int i;
    @Value("${age}")
    int age;
=======

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

>>>>>>> f8f083f1d10b0bd973d6d94e478e8214ffaed906
    @Autowired
    private StudentService studentService;
    private static final Logger logger= LoggerFactory.getLogger(StudentController.class);

    @PostMapping("/student/insert")
<<<<<<< HEAD
    @ResponseBody
    public ResponseEntity<Student> insertStudent(@Valid @RequestBody Student student){
            studentService.saveStudent(student);
            logger.info(String.valueOf(student));
            System.out.println(age);
        return new ResponseEntity<Student>(student, HttpStatus.OK);
    }
    @GetMapping("/student/getAll")
    public ModelAndView getAllStudent(){
       List<Student> allStudent= studentService.getAllStudent();
       ModelAndView mv=new ModelAndView("Student");
       mv.addObject("allStudent",allStudent);
        return mv;
=======
    public Student insertStudent(@Valid @RequestBody Student student){
            studentService.saveStudent(student);
            logger.info(String.valueOf(student));
        return student;
    }

    @GetMapping("/student/getAll")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
>>>>>>> f8f083f1d10b0bd973d6d94e478e8214ffaed906
    }

    @GetMapping("/student/{id}")
    public Student getStudentById(@PathVariable long id){
        return studentService.fetchById(id);
    }

<<<<<<< HEAD
    @GetMapping("/student/delete/{id}")
    @ResponseBody
    public String deleteStudent(@PathVariable long id){
        studentService.deleteStudentById(id);
        return "One record deleted";
=======
    @DeleteMapping("/student/delete/{id}")
    public void deleteStudent(@PathVariable long id){
        studentService.deleteStudentById(id);
>>>>>>> f8f083f1d10b0bd973d6d94e478e8214ffaed906
    }

    @GetMapping("/student/department/{name}")
    public List<Student> getStudentByDepartment(@PathVariable(name ="name") String department){
       return studentService.studentByDepartment(department);
    }

    @GetMapping("/student/name/{name}")
    public List<Student> getStudentByName(@PathVariable(name ="name") String name){
        return studentService.studentByName(name);
    }

<<<<<<< HEAD
//    @PutMapping("/student/update/{id}")
//    public Student updateStudent(@PathVariable long id, @RequestBody Student student){
//        return studentService.updateStudentById(id,student);
//    }
    @RequestMapping( value="/name",method =RequestMethod.GET)
    public String name(){
        return "imran";
    }

    @GetMapping("/student/add")
    public String addStudent(Model model){
        Student student=new Student();
        model.addAttribute("StudentObj",student);
        return "addStudent";
    }

    @PostMapping("/student/save")
    @ResponseBody
    public String saveStudent(@ModelAttribute("StudentObj") Student student){
        studentService.saveStudent(student);
        return "saved";
    }

    @GetMapping("student/update")
    public String updateStudent(Model model){
        Student student=new Student();
        model.addAttribute("UpdateObj",student);
        return "updateStudent";
    }

    @PostMapping("/student/saveUpdate")
    @ResponseBody
    public String saveUpdateStudent(@ModelAttribute("UpdateObj") Student student){
        long id=student.getStudentId();
        studentService.updateStudentById(id,student);
        return "Updated";
    }
//    @GetMapping("student/delete")
//    public String deleteStudent(){
//
//    }
    @GetMapping("/index")
    public String getIndex(){
        return "index";
    }
    @PostMapping("/test")
    @ResponseBody
   public String testApi(@RequestParam String whether){
        return whether;
   }
=======
    @PutMapping("/student/update/{id}")
    public Student updateStudent(@PathVariable long id,@Valid @RequestBody Student student){
        return studentService.updateStudentById(id,student);
    }

>>>>>>> f8f083f1d10b0bd973d6d94e478e8214ffaed906
}
