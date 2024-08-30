package com.api.crud.apicrud.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String lastName;

    // cascade ayuda a que si se elimina un alumno, se eliminan sus materias
    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Subject> subjects;    
}
