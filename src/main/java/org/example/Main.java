package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //ko cache 17s
        System.out.println("Hello and welcome!");
        Student student = new Student("John Doe", 3.5);
        System.out.println("Student Name: " + student.name);
        System.out.println("Student GPA: " + student.gpa);
    }
}
