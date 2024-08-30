package com.api.crud.apicrud.models;

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

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student studen;

    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
    
}
