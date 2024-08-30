package com.api.crud.apicrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.api.crud.apicrud.models.Teacher;
import com.api.crud.apicrud.service.implementations.TeacherServiceImpl;

@RestController
@RequestMapping("/crud/teacher")
public class TeacherController {
    @Autowired
    private TeacherServiceImpl teacherServiceImpl;

    @GetMapping
    public List<Teacher> getAllTeachers() {
        return teacherServiceImpl.getAllTeachers();
    }
    
    @GetMapping("/{id}")
    public Teacher getTeacherById(@PathVariable Long id) {
        return teacherServiceImpl.getTeacherById(id);
    }

    @PostMapping
    public Teacher createTeacher(@RequestBody Teacher teacher) {
        return teacherServiceImpl.createTeacher(teacher);
    }

    @PutMapping("/{id}")
    public Teacher updateTeacher(@PathVariable Long id, @RequestBody Teacher teacher) {
        return teacherServiceImpl.updateTeacher(id, teacher);
    }

    @DeleteMapping("/{id}")
    public void deleteTeacher(@PathVariable Long id) {
        teacherServiceImpl.deleteTeacher(id);
    }
    
}
