package com.imran.crudoperation.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long studentId;
    @NotEmpty(message = "name must not be empty")
    @Size(min = 2, message = "name must contain minimum 2 letter")
    private String studentName;
    private String studentDepartment;

    private String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentDepartment() {
        return studentDepartment;
    }

    public void setStudentDepartment(String studentDepartment) {
        this.studentDepartment = studentDepartment;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentDepartment='" + studentDepartment + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public Student(long studentId, String studentName, String studentDepartment, String role) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentDepartment = studentDepartment;
        this.role = role;
    }

    public Student() {
    }

    public Student(long studentId, String studentName, String studentDepartment){
            this.studentId = studentId;
            this.studentName = studentName;
            this.studentDepartment = studentDepartment;

        }
}
