package com.careerit.jfs.cj.day21;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSONManager {

  public static void main(String[] args) throws IOException {
//    String data = """
//          {
//            "empno": 1001,
//            "name": "Manoj",
//            "country": "India",
//            "salary": 220000,
//            "gender": "M"
//          }
//        """;
//    ObjectMapper objectMapper = new ObjectMapper();
//    Employee emp = objectMapper.readValue(data, Employee.class);
//    System.out.println(emp);
//    String jsonData = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
//    System.out.println(jsonData);

    TypeReference<List<Employee>> typeReference = new TypeReference<>() {};
    ObjectMapper objectMapper = new ObjectMapper();
    List<Employee> empList = objectMapper.readValue(JSONManager.class.getResourceAsStream("/emp_data.json"), typeReference);
    objectMapper.writeValue(new File("emp.json"), empList);
  }
}
