package com.careerit.jfs.cj.day1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

public class JsonDataTest {
  @Test
  void jsonToJavaTest() throws JsonProcessingException {
    ObjectMapper obj = new ObjectMapper();
    String empData = "{\"empno\":1001,\"name\":\"Krish\",\"salary\":5000}";
    Employee emp = obj.readValue(empData, Employee.class);
    System.out.println(emp);
    String jsonStr = obj.writeValueAsString(emp);
    System.out.println(jsonStr);
  }

}
