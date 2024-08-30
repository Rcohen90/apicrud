package com.api.crud.apicrud.models;

import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // cascade ayuda a que si se elimina un alumno, se eliminan sus materias
    @OneToMany(mappedBy = "subject", cascade = CascadeType.ALL)
    private List<Student> students;    
    
}
