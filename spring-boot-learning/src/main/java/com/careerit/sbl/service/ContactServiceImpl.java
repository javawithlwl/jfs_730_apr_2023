package com.careerit.sbl.service;

import com.careerit.sbl.dao.ContactDao;
import com.careerit.sbl.domain.Contact;
import com.careerit.sbl.dto.ContactDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService{

  private final ContactDao contactDao;
  @Override
  public ContactDto addContact(ContactDto contactDto) {
    // Basic validation
    ObjectMapper objectMapper = new ObjectMapper();
    Contact contact = objectMapper.convertValue(contactDto, Contact.class);
    contact = contactDao.insertContact(contact);
    return objectMapper.convertValue(contact,ContactDto.class);
  }

  @Override
  public List<ContactDto> getContacts() {
    List<Contact> contacts = contactDao.selectContacts();
    ObjectMapper objectMapper = new ObjectMapper();
    return contacts.stream().map((contact)->{
      return objectMapper.convertValue(contact,ContactDto.class);
    }).toList();
  }
}
