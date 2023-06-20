package com.careerit.cbook.dao;

import com.careerit.cbook.domain.Contact;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

public class JsonUtilTest {

  @Test
  void strToObjectTest() throws JsonProcessingException {
    String str = "{\"id\":1,\"name\":\"Krish\",\"email\":\"krish.t@gmail.com\",\"mobile\":\"9876543210\"}";
    ObjectMapper objectMapper = new ObjectMapper();
    Contact contact = objectMapper.readValue(str, Contact.class);
    System.out.println(contact);
  }
}
