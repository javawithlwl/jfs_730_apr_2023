package com.careerit.jfs.cj.day22;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {

    private int pid;
    private String pname;
    private double price;
    private String brand;

}
