package com.careerit.sjl.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="mobile")
    private String mobile;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "passport_id",referencedColumnName = "id")
    private Passport passport;

    @OneToMany(mappedBy = "student")
    private List<Address> addresses;

    @ManyToMany(mappedBy = "students")
    private List<Course> courses;
}
