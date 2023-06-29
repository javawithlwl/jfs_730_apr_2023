package com.careerit.cms.service;

import com.careerit.cms.dto.ContactDto;

import java.util.List;

public interface ContactService {

  ContactDto addContact(ContactDto contactDto);

  List<ContactDto> getAllContacts();

  ContactDto updateContact(ContactDto contactDto);

  void deleteContact(String id);

  ContactDto getContactById(String id);

  List<ContactDto> search(String str);

  List<ContactDto> addContacts(List<ContactDto> contactDtoList);

}
