
package com.example.demo.model;

public class StudentModel {
    private String studentName;
    private String message;
    public StudentModel(String studentName, String message) {
        this.studentName = studentName;
        this.message = message;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}