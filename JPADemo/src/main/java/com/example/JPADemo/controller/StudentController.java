package com.example.JPADemo.controller;

import com.example.JPADemo.dao.StudentRequest; // Importing the DTO for handling request data.
import com.example.JPADemo.entity.Student; // Importing the Entity class mapped to the database.
import com.example.JPADemo.service.StudentService; // Importing the Service interface for business logic.
import org.springframework.beans.factory.annotation.Autowired; // Annotation for dependency injection.
import org.springframework.web.bind.annotation.*; // Provides annotations for defining REST endpoints.

import java.util.List; // Importing List collection for returning multiple Student objects.

// Marks this class as a REST Controller to handle HTTP requests.
@RestController
// Defines the base URL for all endpoints in this controller.
@RequestMapping("/std")
public class StudentController {

    // Automatically injects an instance of the StudentService.
    @Autowired
    StudentService studentService;

    // GET endpoint to retrieve all students enrolled in a specific course.
    @GetMapping("/get/{courseName}")
    public List<Student> getStudentByCourse(@PathVariable String courseName) {
        // Calls the service layer to fetch all students by course name.
        List<Student> allStudentByCourse = studentService.getAllStudentByCourse(courseName);
        return allStudentByCourse; // Returns the list of students as JSON.
    }

    // POST endpoint to save a new Student record.
    @PostMapping("/save")
    public Student saveStudent(@RequestBody StudentRequest studentRequest) {
        // Calls the service layer to process and save the student data.
        return studentService.saveStdData(studentRequest);
    }

    // DELETE endpoint to remove a student record by their ID.
    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable int id) {
        // Calls the service layer to delete the student record.
        studentService.deleteStudent(id);
    }

    // GET endpoint to retrieve all student records.
    @GetMapping("/get")
    public List<Student> getAllStudent() {
        // Calls the service layer to fetch all student data.
        List<Student> allStudent = studentService.getAllStudent();
        return allStudent; // Returns the complete list of students as JSON.
    }
}
