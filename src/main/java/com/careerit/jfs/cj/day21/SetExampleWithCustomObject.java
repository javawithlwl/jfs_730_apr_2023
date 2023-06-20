package com.careerit.jfs.cj.day21;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;
import java.util.stream.Collectors;

@Getter
@Setter
@ToString
class Product{
    private long pid;
    private String name;
    private double price;

    public Product(long pid,String name,double price){
        this.pid = pid;
        this.name = name;
        this.price = price;
    }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Product product)) return false;
    return pid == product.pid && Double.compare(product.price, price) == 0 && Objects.equals(name, product.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, name, price);
  }
}
public class SetExampleWithCustomObject {

  public static void main(String[] args) {

    Set<Product> products = new HashSet<>();
    Product p1 = new Product(1001,"Dell Laptop",45000);
    Product p2 = new Product(1002,"Lenovo Laptop",45000);
    Product p3 = new Product(1003,"HP Laptop",45000);
    Product p4 = new Product(1001,"Dell Laptop",45000);
    Product p5 = p1;

    products.add(p1);
    products.add(p2);
    products.add(p3);
    products.add(p4);
    products.add(p5);

    System.out.println(products.size());

    // q: how set works for custom objects
    // a: internally set uses hashcode and equals method to check the uniqueness of the object in the set
    //    if hashcode is same then it will call equals method to check the uniqueness of the object in the set
    //    if hashcode is different then it will not call equals method to check the uniqueness of the object in the set
    //    if hashcode is same and equals method returns true then it will not add the object to the set
    //    if hashcode is same and equals method returns false then it will add the object to the set

    List<Employee> empList = JsonUtil.loadFromJSON();

    List<String> countryNames = getCountryNames(empList);
    System.out.println(countryNames);


  }

  private static List<String> getCountryNames(List<Employee> empList){
//      Set<String> set = new HashSet<>();
//      for(Employee emp:empList){
//          set.add(emp.getCountry());
//      }
//      return set;
   // Set<String> set = empList.stream().map(e -> e.getCountry()).collect(Collectors.toSet());
    List<String> list = empList.stream().map(e -> e.getCountry()).distinct().collect(Collectors.toList());
    return list;
  }
}
