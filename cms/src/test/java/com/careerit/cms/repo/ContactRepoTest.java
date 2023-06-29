package com.careerit.cms.repo;

import com.careerit.cms.domain.Contact;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ContactRepoTest {

  @Autowired
  private ContactRepo contactRepo;
  @BeforeEach
  public void init(){
      contactRepo.deleteAll();
  }

  @Test
  void addContact() {
    Contact contact = getContact();
    contact = contactRepo.save(contact);
    Assertions.assertNotNull(contact.getId(), "Contact is not added, Id value is null");
  }

  @Test
  void addContacts() {
    List<Contact> contacts = getMultipleContacts();
    contacts = contactRepo.saveAll(contacts);
    Assertions.assertEquals(3, contacts.size(), "Contacts are not added");
  }
  @Test
  void getContacts(){
    List<Contact> contacts = getMultipleContacts();
    contacts = contactRepo.saveAll(contacts);
    List<Contact> existingContacts = contactRepo.findAll();
    Assertions.assertEquals(3, existingContacts.size(), "Contacts are not added");
  }

  private Contact getContact() {
    Contact contact = new Contact();
    contact.setName("Krish");
    contact.setEmail("krish.t@gmail.com");
    contact.setMobile("9876543210");
    return contact;
  }

  private List<Contact> getMultipleContacts() {
    Contact contact1 = new Contact();
    contact1.setName("Krish");
    contact1.setEmail("krish.t@gmail.com");
    contact1.setMobile("9876543210");
    Contact contact2 = new Contact();
    contact2.setName("Charan");
    contact2.setEmail("charan.k@gmail.com");
    contact2.setMobile("9876543210");
    Contact contact3 = new Contact();
    contact3.setName("Manoj");
    contact3.setEmail("manoj.pvn@gmail.com");
    contact3.setMobile("9876543210");
    return List.of(contact1, contact2, contact3);
  }

}
