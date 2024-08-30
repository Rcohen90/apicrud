package com.api.crud.apicrud.service.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.api.crud.apicrud.models.Teacher;

public interface ITeacherService {
    List<Teacher> getAllTeachers();
    Teacher getTeacherById(Long id);
    Teacher createTeacher(Teacher teacher);
    Teacher updateTeacher(Long id, Teacher teacher);
    ResponseEntity<Void> deleteTeacher(Long id);
}
