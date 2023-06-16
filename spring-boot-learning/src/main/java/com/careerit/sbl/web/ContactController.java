package com.careerit.sbl.web;

import com.careerit.sbl.dto.ContactDto;
import com.careerit.sbl.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
@RequiredArgsConstructor
public class ContactController {

      private final ContactService contactService;

      @PostMapping("/add")
      public ResponseEntity<ContactDto> addContact(@RequestBody ContactDto contactDto){
        return ResponseEntity.ok(contactService.addContact(contactDto));
      }
      @GetMapping("/all")
      public ResponseEntity<List<ContactDto>> getContact(){
        return ResponseEntity.ok(contactService.getContacts());
      }
}
