package com.skillnext2;

import java.sql.*;
import java.util.*;

public class StudentDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/skillnext2_db";
    private static final String USER = "root";
    private static final String PASSWORD = "root"; // change if needed

    // Add student
    public void addStudent(Student s) throws Exception {
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        String sql = "INSERT INTO student (name, email, course, age, grade) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, s.getName());
        stmt.setString(2, s.getEmail());
        stmt.setString(3, s.getCourse());
        stmt.setInt(4, s.getAge());
        stmt.setString(5, s.getGrade());

        stmt.executeUpdate();
        conn.close();
    }

    // Fetch all students
    public List<Student> getAllStudents() throws Exception {
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM student");

        List<Student> list = new ArrayList<>();
        while (rs.next()) {
            Student s = new Student();
            s.setId(rs.getInt("student_id"));
            s.setName(rs.getString("name"));
            s.setEmail(rs.getString("email"));
            s.setCourse(rs.getString("course"));
            s.setAge(rs.getInt("age"));
            s.setGrade(rs.getString("grade"));
            list.add(s);
        }
        conn.close();
        return list;
    }

    // Delete student
    public void deleteStudent(int id) throws Exception {
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        String sql = "DELETE FROM student WHERE student_id=?";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setInt(1, id);
        stmt.executeUpdate();
        conn.close();
    }

    // Update student
    public void updateStudent(Student s) throws Exception {
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        String sql = "UPDATE student SET name=?, email=?, course=?, age=?, grade=? WHERE student_id=?";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, s.getName());
        stmt.setString(2, s.getEmail());
        stmt.setString(3, s.getCourse());
        stmt.setInt(4, s.getAge());
        stmt.setString(5, s.getGrade());
        stmt.setInt(6, s.getId());

        stmt.executeUpdate();
        conn.close();
    }
}
