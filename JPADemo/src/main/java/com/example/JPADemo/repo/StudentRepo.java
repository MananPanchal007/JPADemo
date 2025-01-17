package com.example.JPADemo.repo;

import com.example.JPADemo.entity.Student; // Importing the Student entity class.
import org.springframework.data.jpa.repository.JpaRepository; // JPA Repository for CRUD operations.
import org.springframework.data.jpa.repository.Query; // Annotation for custom queries.
import org.springframework.stereotype.Repository; // Marks this interface as a Spring-managed repository.

import java.util.List; // Importing List for handling multiple Student records.

// Marks this as a Repository for interacting with the database.
@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

    // Custom query to find all students by their course.
    public List<Student> findByCourse(String course);

    // Native SQL query to fetch all students from the 'students' table.
    @Query(value = "select * from students", nativeQuery = true)
    public List<Student> getAllStudentData();
}
