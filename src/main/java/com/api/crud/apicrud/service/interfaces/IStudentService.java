package com.api.crud.apicrud.service.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.api.crud.apicrud.models.Student;

public interface IStudentService {
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student createStudent(Student student);
    Student updateStudent(Long id, Student student);
    ResponseEntity<Void> deleteStudent(Long id);
}
