package com.careerit.jfs.cj.day21;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
  private String empno;
  private String name;
  private String country;
  private Gender gender;
  private double salary;
}
