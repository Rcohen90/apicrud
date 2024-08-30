package com.api.crud.apicrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.crud.apicrud.models.Teacher;
@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long>{
    
}
