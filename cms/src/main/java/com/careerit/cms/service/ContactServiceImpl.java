package com.careerit.cms.service;

import com.careerit.cms.domain.Contact;
import com.careerit.cms.dto.ContactDto;
import com.careerit.cms.exception.ContactExistsException;
import com.careerit.cms.repo.ContactRepo;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ContactServiceImpl implements  ContactService{

  private final ContactRepo contactRepo;
  private final ObjectMapper objectMapper;
  @Override
  public ContactDto addContact(final ContactDto contactDto) {
    Assert.notNull(contactDto,"Contact can't be null");
    Assert.notNull(contactDto.getName(),"Name can't be empty");
    Assert.notNull(contactDto.getEmail(),"Email can't be empty");
    Assert.notNull(contactDto.getMobile(),"Mobile can't be empty");
    contactRepo.findByMobile(contactDto.getMobile())
            .ifPresent(contact -> {
              log.error("Mobile number already exists : {}",contactDto.getMobile());
              throw new ContactExistsException("Mobile number already exists");
            });
    Contact contact = objectMapper.convertValue(contactDto, Contact.class);
    contact = contactRepo.save(contact);
    ContactDto savedContact = objectMapper.convertValue(contact, ContactDto.class);
    log.info("Contact is saved with id : {}",savedContact.getId());
    return savedContact;
  }

  @Override
  public List<ContactDto> getAllContacts() {
    return null;
  }

  @Override
  public ContactDto updateContact(ContactDto contactDto) {
    return null;
  }

  @Override
  public void deleteContact(String id) {

  }

  @Override
  public ContactDto getContactById(String id) {
    return null;
  }

  @Override
  public List<ContactDto> search(String str) {
    return null;
  }

  @Override
  public List<ContactDto> addContacts(List<ContactDto> contactDtoList) {
    return null;
  }
}
