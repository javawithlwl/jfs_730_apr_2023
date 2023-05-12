package com.careerit.jfs.cj.day17;

public class Product extends Object {

  private int pid;
  private String pname;
  private double price;

  public Product(int pid, String pname, double price) {
    this.pid = pid;
    this.pname = pname;
    this.price = price;
  }
  @Override
  public String toString() {
    return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
  }



  public static void main(String[] args) {
    Product p1 = new Product(1001, "Dell Laptop", 45000);
    System.out.println(p1.toString());



  }
}
