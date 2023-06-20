package com.careerit.cbook.dao;

import com.careerit.cbook.domain.Contact;
import com.careerit.cbook.util.ConnectionUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.postgresql.util.PSQLException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class ContactDaoTest {

  private ContactDao contactDao;
  @BeforeEach
  void init() {
    cleanUp();
    contactDao = new ContactDaoImpl();
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

  @Test
  void addContactTest() {
    Contact contact = new Contact();
    contact.setName("Krish");
    contact.setEmail("krish@gmail.com");
    contact.setMobile("9876543210");
    contact=contactDao.insertContact(contact);
    System.out.println("Contact saved with id :"+contact.getId());
    Assertions.assertTrue(contact.getId() > 0);
  }
  @Test
  void updateContactTestWithValidMobile() throws SQLException {
    Contact contact = new Contact();
    contact.setName("Krish");
    contact.setEmail("krish@gmail.com");
    contact.setMobile("9876543210");
    contact=contactDao.insertContact(contact);
    contact.setMobile("9876543211");
    Contact updatedContact = contactDao.updateContact(contact);
    Assertions.assertEquals("9876543211",updatedContact.getMobile());
  }
  @Test
  void updateContactTestWithDuplicateMobileNumbers() {
    Contact contact = new Contact();
    contact.setName("Krish");
    contact.setEmail("krish@gmail.com");
    contact.setMobile("9876543210");
    Contact savedContact = contactDao.insertContact(contact);
    Contact contact1 = new Contact();
    contact1.setName("Manoj");
    contact1.setEmail("manoj@gmail.com");
    contact1.setMobile("9876543211");
    contact1=contactDao.insertContact(contact1);
    contact.setMobile("9876543211");  
    Assertions.assertThrows(PSQLException.class,()->contactDao.updateContact(contact));
    
  }

  @Test
  void searchContact(){
    Contact contact1 = new Contact();
    contact1.setName("Krish");
    contact1.setEmail("krish@gmail.com");
    contact1.setMobile("9876543210");
    contact1 = contactDao.insertContact(contact1);
    Contact contact2 = new Contact();
    contact2.setName("Manoj");
    contact2.setEmail("manoj@gmail.com");
    contact2.setMobile("9876543211");
    contact2=contactDao.insertContact(contact2);
    Contact contact3 = new Contact();
    contact3.setName("Manoj Kumar");
    contact3.setEmail("manojkumar@gmail.com");
    contact3.setMobile("9876543111");
    contact3=contactDao.insertContact(contact3);
    List<Contact> list = contactDao.search("man");
    Assertions.assertEquals(2,list.size());
  }
  @Test
  void deleteContact(){
    Contact contact1 = new Contact();
    contact1.setName("Krish");
    contact1.setEmail("krish@gmail.com");
    contact1.setMobile("9876543210");
    contact1 = contactDao.insertContact(contact1);
    boolean isDeleted=contactDao.deleteContact(contact1.getId());
    Assertions.assertTrue(isDeleted);
  }
  @Test
  void deleteContactIdNotPresent(){
    boolean isDeleted=contactDao.deleteContact(1L);
    Assertions.assertFalse(isDeleted);
  }

  @Test
  void contactByIdtest(){
    Contact contact1 = new Contact();
    contact1.setName("Krish");
    contact1.setEmail("krish@gmail.com");
    contact1.setMobile("9876543210");
    contact1 = contactDao.insertContact(contact1);
    Contact existingContact = contactDao.selectContact(contact1.getId()).get();
    Assertions.assertEquals(contact1.getName(),existingContact.getName());
  }

}
