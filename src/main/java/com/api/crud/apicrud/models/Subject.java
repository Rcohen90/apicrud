package com.api.crud.apicrud.models;

import java.util.Set;

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

    /* Se agrega relación muchos a muchos porque, en un supuesto real, una materia
         también puede contar con numerosos alumnos y un alumno, 
            pueden tomar varias materias.
     */
    @ManyToMany(mappedBy = "subjects")
    private Set<Student> students;

    @OneToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
    
}
