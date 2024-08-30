package com.api.crud.apicrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.crud.apicrud.models.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
