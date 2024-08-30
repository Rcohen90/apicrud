package com.api.crud.apicrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.crud.apicrud.models.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Long>{
    
}
