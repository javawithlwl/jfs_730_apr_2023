package com.careerit.cbook.service;

import com.careerit.cbook.dao.ContactDao;
import com.careerit.cbook.domain.Contact;
import com.careerit.cbook.dto.ContactDto;
import com.careerit.cbook.exception.ContactException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.sql.SQLException;
import java.util.List;


public class ContactServiceImpl implements ContactService {

  private ContactDao contactDao;
  private ObjectMapper objectMapper;

  public ContactServiceImpl(ContactDao contactDao) {
    this.contactDao = contactDao;
    this.objectMapper = new ObjectMapper();
  }

  @Override
  public ContactDto addContact(ContactDto contactDto) {
    Assert.notNull(contactDto.getName(), "Name should not be null");
    Assert.notNull(contactDto.getMobile(), "Mobile should not be null");
    if (contactDao.isContactExists(contactDto.getMobile())) {
      throw new ContactException("Contact already exists with mobile number :" + contactDto.getMobile());
    }
    Contact contact = objectMapper.convertValue(contactDto, Contact.class);
    contact = contactDao.insertContact(contact);
    contactDto = objectMapper.convertValue(contact, ContactDto.class);
    System.out.println("Contact is added with id :" + contactDto.getId());
    return contactDto;
  }

  @Override
  public ContactDto updateContact(ContactDto contactDto) throws SQLException {
    return null;
  }

  @Override
  public List<ContactDto> search(String str) {
    if(!StringUtils.hasText(str)){
      return contactDao.selectAllContacts().stream().map(c->objectMapper.convertValue(c,ContactDto.class)).toList();
    }
    return contactDao.search(str).stream().map(c->objectMapper.convertValue(c,ContactDto.class)).toList();
  }

  @Override
  public boolean deleteContact(long id) {
    return false;
  }

  @Override
  public ContactDto getContact(long id) {
    return null;
  }

  @Override
  public List<ContactDto> addContacts(List<ContactDto> contacts) {
    return null;
  }

  @Override
  public void exportContacts(String email) {

  }
}
