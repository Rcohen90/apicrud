package com.api.crud.apicrud.models;

import java.util.Set;

import jakarta.persistence.*;
import lombok.*;

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


    /* Se agrega relación muchos a muchos porque, en un supuesto real, un alumno puede
         tener varias materias y una materia puede tener varios alumnos.
        Por lo que, se agrega tabla intermedia que administre la relación mediante id's.
     */
    @ManyToMany
    @JoinTable(
        name = "student_subject", 
        joinColumns = @JoinColumn(name = "student_id"), 
        inverseJoinColumns = @JoinColumn(name = "subject_id")
    )
    private Set<Subject> subjects;


    /* La lógica de muchos a uno, permite que muchos alumnos tomen una materia, sin embargo,
         no sería posible tener varias materias en un solo alumno.
    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;
     */

}
