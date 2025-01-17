package com.example.JPADemo.util;

import com.example.JPADemo.dao.StudentRequest; // Importing the DTO for request data.
import com.example.JPADemo.entity.Student; // Importing the entity class for database operations.

// Utility class to map DTO to Entity.
public class Utility {

    // Static method to map a StudentRequest object to a Student entity.
    public static Student Mapper(StudentRequest studentRequest) {
        Student student = new Student();
        student.setName(studentRequest.getName()); // Sets the 'name' field.
        student.setAddress(studentRequest.getAddress()); // Sets the 'address' field.
        student.setCourse(studentRequest.getCourse()); // Sets the 'course' field.
        return student; // Returns the mapped Student entity.
    }
}
