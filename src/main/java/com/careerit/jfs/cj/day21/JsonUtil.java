package com.careerit.jfs.cj.day21;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.util.List;

public final class JsonUtil {

  private JsonUtil() {
  }

  @SneakyThrows
  public static List<Employee> loadFromJSON() {
    String fileName = "/emp_data.json";
    TypeReference<List<Employee>> typeReference = new TypeReference<>() {};
    ObjectMapper objectMapper = new ObjectMapper();
    List<Employee> empList = objectMapper.readValue(JsonUtil.class.getResourceAsStream(fileName), typeReference);
    return empList;
  }

}
