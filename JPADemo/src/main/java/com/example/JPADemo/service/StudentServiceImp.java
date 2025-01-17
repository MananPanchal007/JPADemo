package com.example.JPADemo.service;

import com.example.JPADemo.dao.StudentRequest; // Importing the DTO for request data.
import com.example.JPADemo.entity.Student; // Importing the entity class for database operations.
import com.example.JPADemo.repo.StudentRepo; // Importing the repository for database interaction.
import com.example.JPADemo.util.Utility; // Importing the utility class for mapping DTO to Entity.
import org.springframework.beans.factory.annotation.Autowired; // Annotation for dependency injection.
import org.springframework.stereotype.Service; // Marks this class as a Service component.

import java.util.List; // List to handle multiple student records.

// Marks this class as a Spring Service to handle business logic.
@Service
public class StudentServiceImp implements StudentService {

    // Automatically injects an instance of StudentRepo.
    @Autowired
    StudentRepo studentRepo;

    @Override
    public List<Student> getAllStudentByCourse(String courseName) {
        // Uses the repository to fetch students by course name.
        return studentRepo.findByCourse(courseName);
    }

    @Override
    public Student saveStdData(StudentRequest studentRequest) {
        // Maps the DTO to an Entity and saves it using the repository.
        return studentRepo.save(Utility.Mapper(studentRequest));
    }

    @Override
    public void deleteStudent(int id) {
        // Deletes a student record by ID.
        studentRepo.deleteById(id);
    }

    @Override
    public List<Student> getAllStudent() {
        // Fetches all student records from the database.
        return studentRepo.getAllStudentData();
    }
}
