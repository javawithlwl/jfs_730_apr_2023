package com.careerit.cbook.service;

import com.careerit.cbook.dto.ContactDto;

import java.sql.SQLException;
import java.util.List;


public interface ContactService {
  ContactDto addContact(ContactDto contactDto);

  ContactDto updateContact(ContactDto contactDto) throws SQLException;

  List<ContactDto> search(String str);

  boolean deleteContact(long id);

  ContactDto getContact(long id);

  List<ContactDto> addContacts(List<ContactDto> contacts);

  void exportContacts(String email);
}
