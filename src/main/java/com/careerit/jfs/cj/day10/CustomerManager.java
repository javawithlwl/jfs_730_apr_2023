package com.careerit.jfs.cj.day10;
import com.careerit.jfs.cj.day9.ReadDataFromFile;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class CustomerManager {

  public static void main(String[] args) throws IOException {
    List<String> list1 = getCustomer("blr");
    List<String> list2 = getCustomer("hyd");
    List<String> visitedCutsomerIdList = new ArrayList<>();
    for (String l1 : list1) {
      if (!visitedCutsomerIdList.contains(l1)) {
        visitedCutsomerIdList.add(l1);
      }
    }
    for (String l1 : list2) {
      if (!visitedCutsomerIdList.contains(l1)) {
        visitedCutsomerIdList.add(l1);
      }
    }
    List<Customer> customerList = getCustomerList();
    List<String> visitedCustomerNameList = new ArrayList<>();
    for(String id:visitedCutsomerIdList){
          String name = getCustomerName(customerList,id);
          if(name!=null){
              visitedCustomerNameList.add(name);
          }
    }
    System.out.println(visitedCustomerNameList);
  }

  private static String getCustomerName(List<Customer> list, String id){
        for(Customer c:list){
            if(c.getId().equals(id)){
              return c.getName();
            }
        }
        return null;
  }

  private static List<String> getCustomer(String city) throws IOException {
    File file = new File(ReadDataFromFile.class.getResource("/" + city + ".txt").getFile());
    List<String> lines = Files.readAllLines(file.toPath());
    return lines;
  }
  private static List<Customer> getCustomerList()throws  IOException{
    File file = new File(ReadDataFromFile.class.getResource("/customer.txt").getFile());
    List<String> lines = Files.readAllLines(file.toPath());
    List<Customer> customerList = new ArrayList<>();
    for(String line : lines){
        String[] arr = line.split(",");
        Customer customer = new Customer(arr[0],arr[1]);
        customerList.add(customer);
    }
    return customerList;
  }
}
