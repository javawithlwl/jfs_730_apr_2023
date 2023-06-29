package com.careerit.cms.api;

import com.careerit.cms.dto.ContactDto;
import com.careerit.cms.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
