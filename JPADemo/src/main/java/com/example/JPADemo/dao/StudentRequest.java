package com.example.JPADemo.dao;

// This is a DTO (Data Transfer Object) for receiving data from HTTP requests.
public class StudentRequest {

    // Fields for capturing the data of a student.
    int id;
    String name;
    String course;
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
