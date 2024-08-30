package com.api.crud.apicrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.crud.apicrud.models.Subject;

public interface SubjectRepository  extends JpaRepository<Subject, Long>{
    
}
