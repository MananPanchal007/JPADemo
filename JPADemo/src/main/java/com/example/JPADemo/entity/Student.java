package com.example.JPADemo.entity;

import javax.persistence.*; // JPA annotations for mapping the class to a database table.

// Marks this class as an entity mapped to a database table.
@Entity
// Specifies the name of the table in the database.
@Table(name = "students")
public class Student {

    // Primary key with auto-increment strategy for ID generation.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    // Maps the 'name' field to a column in the database.
    @Column(name = "name")
    String name;

    // Maps the 'course' field to a column in the database.
    @Column(name = "course")
    String course;

    // Maps the 'address' field to a column in the database.
    @Column(name = "address")
    String address;

    // Getter and Setter for 'id'.
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for 'name'.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for 'course'.
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // Getter and Setter for 'address'.
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
