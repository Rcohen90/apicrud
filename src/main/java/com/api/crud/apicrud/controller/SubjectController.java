package com.api.crud.apicrud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.api.crud.apicrud.models.Subject;
import com.api.crud.apicrud.service.implementations.SubjectServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/crud/subject")
public class SubjectController {
    @Autowired
    private SubjectServiceImpl subjectServiceImpl;

    @GetMapping
    public List<Subject> getAllSubjects() {
        return subjectServiceImpl.getAllSubjects();
    }
    
    @GetMapping("/{id}")
    public Subject getSubjectById(@PathVariable Long id) {
        return subjectServiceImpl.getSubjectById(id);
    }

    @PostMapping
    public Subject createSubject(@RequestBody Subject subject) {
        return subjectServiceImpl.createSubject(subject);
    }

    @PutMapping("/{id}")
    public Subject updateSubject(@PathVariable Long id, @RequestBody Subject subject) {
        return subjectServiceImpl.updateSubject(id, subject);
    }

    @DeleteMapping("/{id}")
    public void deleteSubject(@PathVariable Long id) {
        subjectServiceImpl.deleteSubject(id);
    }
}