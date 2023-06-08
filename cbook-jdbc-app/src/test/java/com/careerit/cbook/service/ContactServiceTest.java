package com.careerit.cbook.service;

import com.careerit.cbook.dao.ContactDao;
import com.careerit.cbook.dao.ContactDaoImpl;
import com.careerit.cbook.dto.ContactDto;
import com.careerit.cbook.exception.ContactException;
import com.careerit.cbook.util.ConnectionUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ContactServiceTest {

  private ContactDao contactDao;
  private ContactService contactService;

  @BeforeEach
  void init() {
    cleanUp();
    contactDao = new ContactDaoImpl();
    contactService = new ContactServiceImpl(contactDao);
  }

  @Test
  void addContactTest() {
    ContactDto contactDto = ContactDto.builder().name("Krish").mobile("9876543210").email("krish.t@gmail.com").build();
    contactDto = contactService.addContact(contactDto);
    System.out.println(contactDto);
    Assertions.assertTrue(contactDto.getId() > 0);
  }

  @Test
  void addContactDuplicateTest() {
    ContactDto contactDto = ContactDto.builder().name("Krish").mobile("9876543210").email("krish.t@gmail.com").build();
    contactDto = contactService.addContact(contactDto);
    ContactDto contactDto1 = ContactDto.builder().name("Manoj").mobile("9876543210").email("manoj.pvn@gmail.com").build();
    Assertions.assertThrows(ContactException.class, () -> contactService.addContact(contactDto1));
  }
  @Test
  void searchWithEmptyString(){
    ContactDto contactDto1 = ContactDto.builder().name("Krish").mobile("9876543210").email("krish.t@gmail.com").build();
    ContactDto contactDto2 = ContactDto.builder().name("Manoj").mobile("9876543211").email("manoj.pvn@gmail.com").build();
    ContactDto contactDto3 = ContactDto.builder().name("Manohar").mobile("9876543111").email("manu.pvn@gmail.com").build();
    contactService.addContact(contactDto1);
    contactService.addContact(contactDto2);
    contactService.addContact(contactDto3);
    List<ContactDto> list = contactService.search("");
    Assertions.assertEquals(3,list.size());
  }
  @Test
  void searchWithString(){
    ContactDto contactDto1 = ContactDto.builder().name("Krish").mobile("9876543210").email("krish.t@gmail.com").build();
    ContactDto contactDto2 = ContactDto.builder().name("Manoj").mobile("9876543211").email("manoj.pvn@gmail.com").build();
    ContactDto contactDto3 = ContactDto.builder().name("Manohar").mobile("9876543111").email("manu.pvn@gmail.com").build();
    contactService.addContact(contactDto1);
    contactService.addContact(contactDto2);
    contactService.addContact(contactDto3);
    List<ContactDto> list = contactService.search("man");
    Assertions.assertEquals(2,list.size());
  }

  private void cleanUp() {
    Connection con = null;
    Statement st = null;
    try {
      con = ConnectionUtil.getConnection();
      st = con.createStatement();
      st.executeUpdate("delete from contact");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

}
