package com.example.depInjection;

import java.util.Objects;

public class Student {
   private String studentName;

    public Student setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    public void displayStudentInfo() {
        System.out.println("students name is = " + studentName);
    }
}
