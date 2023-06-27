package com.careerit.sjl.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String city;
    private String state;
    private String country;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id",referencedColumnName = "id")
    private Student student;
}
