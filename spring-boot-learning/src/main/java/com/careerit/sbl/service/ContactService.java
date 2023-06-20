package com.careerit.sbl.service;

import com.careerit.sbl.dto.ContactDto;

import java.util.List;

public interface ContactService {

      ContactDto addContact(ContactDto contactDto);
      List<ContactDto> getContacts();
}
