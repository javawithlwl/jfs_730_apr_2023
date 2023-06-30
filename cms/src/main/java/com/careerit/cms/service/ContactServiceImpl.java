package com.careerit.cms.service;

import com.careerit.cms.domain.Contact;
import com.careerit.cms.dto.ContactDto;
import com.careerit.cms.exception.ContactExistsException;
import com.careerit.cms.exception.ContactNotFoundException;
import com.careerit.cms.repo.ContactRepo;
import com.fasterxml.jackson.core.type.TypeReference;
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
    List<Contact> contactList = contactRepo.findAll();
    log.info("Contact count is  : {}",contactList.size());
    return objectMapper.convertValue(contactList, new TypeReference<List<ContactDto>>() {});
  }

  @Override
  public ContactDto updateContact(ContactDto contactDto) {
    Assert.notNull(contactDto,"Contact can't be null");
    Assert.notNull(contactDto.getId(),"Id can't be null");
    Contact contact = objectMapper.convertValue(contactDto, Contact.class);
    contact = contactRepo.save(contact);
    ContactDto updatedContact = objectMapper.convertValue(contact, ContactDto.class);
    log.info("Contact is updated with id : {}",updatedContact.getId());
    return updatedContact;
  }

  @Override
  public void deleteContact(String id) {
    if(contactRepo.existsById(id)){
      contactRepo.deleteById(id);
      log.info("Contact with id : {} is deleted",id);
    }else {
      log.error("Contact with id : {} not found",id);
      throw new ContactNotFoundException("Contact with id : " + id + " not found");
    }
  }
  @Override
  public ContactDto getContactById(String id) {
    Assert.notNull(id,"Id can't be null");
    Contact contact = contactRepo.findById(id)
        .orElseThrow(() -> {
          log.error("Contact with id : {} not found", id);
          return new ContactNotFoundException("Contact with id : " + id + " not found");
        });
    log.info("Contact with id : {} is found",id);
    return objectMapper.convertValue(contact, ContactDto.class);
  }

  @Override
  public List<ContactDto> search(String str) {
    Assert.notNull(str,"Search string can't be null");
    List<Contact> contactList = contactRepo.search(".*"+str+".*");
    log.info("Contact count is  : {}",contactList.size());
    return objectMapper.convertValue(contactList, new TypeReference<List<ContactDto>>() {});
  }

  @Override
  public List<ContactDto> addContacts(List<ContactDto> contactDtoList) {
    Assert.notNull(contactDtoList,"Contact list can't be null");
    List<Contact> contactList = objectMapper.convertValue(contactDtoList, new TypeReference<List<Contact>>() {});
    contactList = contactRepo.saveAll(contactList);
    log.info("Contact count is  : {}",contactList.size());
    return objectMapper.convertValue(contactList, new TypeReference<List<ContactDto>>() {});
  }
}
