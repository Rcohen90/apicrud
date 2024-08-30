package com.api.crud.apicrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.crud.apicrud.models.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
