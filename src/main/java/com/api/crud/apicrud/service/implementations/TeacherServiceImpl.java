package com.api.crud.apicrud.service.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.api.crud.apicrud.models.Teacher;
import com.api.crud.apicrud.repository.TeacherRepository;
import com.api.crud.apicrud.service.interfaces.ITeacherService;
@Service
public class TeacherServiceImpl implements ITeacherService {

    @Autowired
    private TeacherRepository teacherRepository;

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher getTeacherById(Long id) {
        return teacherRepository.findById(id).orElse(null);
    }

    @Override
    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    @Override
    public Teacher updateTeacher(Long id, Teacher teacher) {
        Optional<Teacher> optionalTeacher = teacherRepository.findById(id);
        if (optionalTeacher.isPresent()) {
            Teacher existingTeacher = optionalTeacher.get();
            existingTeacher.setName(teacher.getName());
            existingTeacher.setLastName(teacher.getLastName());
            existingTeacher.setSubject(teacher.getSubject());
            return teacherRepository.save(existingTeacher);
        }
        return null;
    }

     @Override
    public ResponseEntity<Void> deleteTeacher(Long id) {
        Optional<Teacher> teacher = teacherRepository.findById(id);
        if (teacher.isPresent()) {
            teacherRepository.delete(teacher.get());
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
}
