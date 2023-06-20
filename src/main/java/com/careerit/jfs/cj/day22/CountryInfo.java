package com.careerit.jfs.cj.day22;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;
import java.util.StringJoiner;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CountryInfo {

    private String commonName;
    private String officialName;
    private List<String> capital;
    private double area;
    private double population;


}
