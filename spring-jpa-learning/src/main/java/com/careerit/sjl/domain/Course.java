package com.careerit.sjl.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "course_title")
    private String courseTitle;
    @Column(name = "description")
    private String description;
    @Column(name = "fee")
    private double fee;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "student_course",joinColumns = @JoinColumn(name = "course_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "student_id",referencedColumnName = "id"))
    private List<Student> students;

}
