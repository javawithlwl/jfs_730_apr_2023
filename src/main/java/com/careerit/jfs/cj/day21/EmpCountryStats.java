package com.careerit.jfs.cj.day21;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmpCountryStats {
    private long count;
    private String country;
    private double maxSalary;
    private double minSalary;
    private double avgSalary;
}
