package com.careerit.sjl.domain;

import jakarta.persistence.*;
import lombok.*;

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

}
