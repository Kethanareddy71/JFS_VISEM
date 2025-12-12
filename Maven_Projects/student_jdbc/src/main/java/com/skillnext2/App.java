package com.skillnext2;

import java.util.*;

public class App {
    public static void main(String[] args) {
        try {
            StudentDAO dao = new StudentDAO();

            // Add student
            Student s1 = new Student("Kethana", "kethana@example.com", "Java Full Stack", 21, "A");
            dao.addStudent(s1);
            System.out.println("Student Added Successfully!");

            // Fetch students
            List<Student> students = dao.getAllStudents();
            for (Student s : students) {
                System.out.println(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
