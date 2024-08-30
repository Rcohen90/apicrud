package com.api.crud.apicrud.service.interfaces;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.api.crud.apicrud.models.Subject;

public interface ISubjectService {
    List<Subject> getAllSubjects();
    Subject getSubjectById(Long id);
    Subject createSubject(Subject subject);
    Subject updateSubject(Long id, Subject subject);
    ResponseEntity<Void> deleteSubject(Long id);
}
