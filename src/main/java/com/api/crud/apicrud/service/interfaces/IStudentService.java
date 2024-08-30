package com.api.crud.apicrud.service.interfaces;

import java.util.List;

import com.api.crud.apicrud.models.Student;

public interface IStudentService {
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student createStudent(Student student);
    Student updateStudent(Long id, Student student);
    void deleteStudent(Long id);
}
