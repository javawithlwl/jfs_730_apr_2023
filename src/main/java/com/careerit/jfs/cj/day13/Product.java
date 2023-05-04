package com.careerit.jfs.cj.day13;

import java.util.List;
import java.util.StringJoiner;

public class Product {

  private int pid;
  private String name;
  private String description;
  private String code;
  private double price;

  public Product(int pid, String name, double price) {
      this(pid,name,"N/A",price);
  }


  public Product(int pid, String name, String code, double price) {
      this(pid,name,"N/A",code,price);
  }

  public Product(int pid, String name, String description, String code, double price) {
    this.pid = pid;
    this.name = name;
    this.description = description;
    this.code = code;
    this.price = price;
  }

  public int getPid() {
    return pid;
  }

  public void setPid(int pid) {
    this.pid = pid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", Product.class.getSimpleName() + "[", "]")
        .add("pid=" + pid)
        .add("name='" + name + "'")
        .add("description='" + description + "'")
        .add("code='" + code + "'")
        .add("price=" + price)
        .toString();
  }

  public static void main(String[] args) {
        Product product1 = new Product(1001,"Dell Laptop",500000);
        Product product2 = new Product(1002,"Dell Laptop-1","Dell Inspiron 15 5000",500000);
        Product product3 = new Product(1003,"Dell Laptop","Dell Inspiron 15 5000","DELL-INS-15-5000",45000);
        Product product4 = new Product(1004,"Dell Laptop","Dell Inspiron 15 5000","DELL-INS-15-5000",185000);
        Product product5 = new Product(1005,"Dell Laptop","Dell Inspiron 15 5000","DELL-INS-15-5000",50000);


  }


}
