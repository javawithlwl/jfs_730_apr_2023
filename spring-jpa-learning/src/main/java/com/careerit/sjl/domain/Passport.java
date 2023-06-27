package com.careerit.sjl.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "passport_number")
    private String passportNumber;
    @Column(name = "issued_country")
    private String issuedCountry;
    @OneToOne(mappedBy = "passport")
    private Student student;
}
