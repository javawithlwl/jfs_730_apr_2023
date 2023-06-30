package com.careerit.cms.api;

import com.careerit.cms.dto.ContactDto;
import com.careerit.cms.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/contact")
@RequiredArgsConstructor
public class ContactController {

  private final ContactService contactService;

  @PostMapping
  public ResponseEntity<ContactDto> addContact(@RequestBody ContactDto contactDto) {
    ContactDto contact = contactService.addContact(contactDto);
    return ResponseEntity.ok(contact);
  }
  @GetMapping("/list")
  public ResponseEntity<List<ContactDto>> getContacts(){
    List<ContactDto> contactList = contactService.getAllContacts();
    return ResponseEntity.ok(contactList);
  }
  @PutMapping
  public ResponseEntity<ContactDto> updateContact(@RequestBody ContactDto contactDto){
    ContactDto updatedContact = contactService.updateContact(contactDto);
    return ResponseEntity.ok(updatedContact);
  }
  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteContact(@PathVariable("id") String id){
    contactService.deleteContact(id);
    return ResponseEntity.ok("Contact is deleted with id : "+id);
  }
  @GetMapping("/{id}")
  public ResponseEntity<ContactDto> getContactById(@PathVariable("id") String id){
    ContactDto contactDto = contactService.getContactById(id);
    return ResponseEntity.ok(contactDto);
  }
  @GetMapping("/search/{str}")
  public ResponseEntity<List<ContactDto>> search(@PathVariable("str") String str){
    List<ContactDto> contactDtoList = contactService.search(str);
    return ResponseEntity.ok(contactDtoList);
  }
  @PostMapping("/list")
  public ResponseEntity<List<ContactDto>> addContacts(@RequestBody List<ContactDto> contactDtoList){
    List<ContactDto> contactList = contactService.addContacts(contactDtoList);
    return ResponseEntity.ok(contactList);
  }

}
