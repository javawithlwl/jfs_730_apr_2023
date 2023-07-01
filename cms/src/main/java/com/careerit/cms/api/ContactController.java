package com.careerit.cms.api;

import com.careerit.cms.dto.ContactDto;
import com.careerit.cms.dto.CountryInfo;
import com.careerit.cms.service.ContactService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
  public ResponseEntity<List<ContactDto>> getContacts() {
    List<ContactDto> contactList = contactService.getAllContacts();
    return ResponseEntity.ok(contactList);
  }

  @PutMapping
  public ResponseEntity<ContactDto> updateContact(@RequestBody ContactDto contactDto) {
    ContactDto updatedContact = contactService.updateContact(contactDto);
    return ResponseEntity.ok(updatedContact);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteContact(@PathVariable("id") String id) {
    contactService.deleteContact(id);
    return ResponseEntity.ok("Contact is deleted with id : " + id);
  }

  @GetMapping("/{id}")
  public ResponseEntity<ContactDto> getContactById(@PathVariable("id") String id) {
    ContactDto contactDto = contactService.getContactById(id);
    return ResponseEntity.ok(contactDto);
  }

  @GetMapping("/search/{str}")
  public ResponseEntity<List<ContactDto>> search(@PathVariable("str") String str) {
    List<ContactDto> contactDtoList = contactService.search(str);
    return ResponseEntity.ok(contactDtoList);
  }

  @PostMapping("/list")
  public ResponseEntity<List<ContactDto>> addContacts(@RequestBody List<ContactDto> contactDtoList) {
    List<ContactDto> contactList = contactService.addContacts(contactDtoList);
    return ResponseEntity.ok(contactList);
  }

  @GetMapping("/currency/{code}")
  public ResponseEntity<List<CountryInfo>> searchOnChatGpt(@PathVariable("code") String currencyCode) {
    RestTemplate restTemplate = new RestTemplate();
    String url = "https://restcountries.com/v3.1/currency/" + currencyCode;
    List<Object> list = restTemplate.getForObject(url, List.class);
    ObjectMapper objectMapper = new ObjectMapper();
    List<CountryInfo> countryInfoList = new ArrayList<>();
    for (Object object : list) {
      Map<String, Object> map = (Map<String, Object>) object;
      Map<String, Object> nameMap = (Map<String, Object>) map.get("name");
      String countryName = nameMap.get("common").toString();
      String region = map.get("region").toString();
      Map<String, Object> flagMap = (Map<String, Object>) map.get("flags");
      String flag = flagMap.get("svg").toString();
      CountryInfo countryInfo = CountryInfo.builder()
                                           .name(countryName)
                                           .region(region).flagUrl(flag).build();
      countryInfoList.add(countryInfo);
    }
    return ResponseEntity.ok(countryInfoList);
  }

}
