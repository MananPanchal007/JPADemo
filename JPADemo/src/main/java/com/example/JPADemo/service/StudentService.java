package com.example.JPADemo.service;

import com.example.JPADemo.dao.StudentRequest; // Importing the DTO for request data.
import com.example.JPADemo.entity.Student; // Importing the entity class for database operations.

import java.util.List; // List to handle multiple student records.

// Interface to define methods for StudentService.
public interface StudentService {

    // Method to retrieve all students by course name.
    public List<Student> getAllStudentByCourse(String courseName);

    // Method to save student data.
    Student saveStdData(StudentRequest studentRequest);

    // Method to delete a student by their ID.
    void deleteStudent(int id);

    // Method to retrieve all student records.
    List<Student> getAllStudent();
}
