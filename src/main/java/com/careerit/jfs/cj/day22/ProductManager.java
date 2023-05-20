package com.careerit.jfs.cj.day22;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class ProductManager {

  public static void main(String[] args) throws JsonProcessingException {
    List<Product> products = new ArrayList<>();

    products.add(Product.builder().pid(1001).pname("Dell Laptop").brand("Dell").price(45000).build());
    products.add(Product.builder().pid(1002).pname("HP Laptop").brand("HP").price(35000).build());
    products.add(Product.builder().pid(1003).pname("Lenovo Laptop").brand("Lenovo").price(35000).build());
    products.add(Product.builder().pid(1004).pname("Apple Laptop").brand("Apple").price(85000).build());
    products.add(Product.builder().pid(1005).pname("Asus Laptop").brand("Asus").price(55000).build());
    products.add(Product.builder().pid(1006).pname("HP Laptop new model").brand("HP").price(35000).build());

    // display product details in sorting order of price in descending.

    products.stream().sorted(Comparator.comparing(Product::getPrice).reversed()
        .thenComparing(Product::getPname)).forEach(System.out::println);

    List<String> list = new ArrayList<>();
    list.add("Hello");
    for (String obj : list) {
        System.out.println(obj.toUpperCase());
    }
    Product product = Product.builder().pid(1001).pname("Dell Laptop").brand("Dell").price(45000).build();
    String jsonStr = new ObjectMapper().writeValueAsString(product);
    Product p1 = getObject(jsonStr,Product.class);
    System.out.println(p1);
    double res = getSum(List.of(2,3,4,5,6,7,8,9,10));
    System.out.println("Result is :"+res);
    List<Integer> list1 = new ArrayList<>();
    addNumbers(list1);
    System.out.println(list1);
  }
  public static <T> T getObject(String t,Class clazz) throws JsonProcessingException {
    ObjectMapper obj = new ObjectMapper();
    return (T)obj.readValue(t,clazz);


  }

  public static double getSum(List<? extends Number> list) {
      double sum = 0;
      for(Number num:list) {
          sum += num.doubleValue();
      }
      return sum;
  }

  public static void addNumbers(List<? super Integer> list) {
    for (int i = 1; i <= 10; i++) {
      list.add(i);
    }
  }
}

class One{

}
class Two extends  One{

}
class Three extends  Two{

}