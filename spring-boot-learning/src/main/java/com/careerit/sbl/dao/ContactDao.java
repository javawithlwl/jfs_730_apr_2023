package com.careerit.sbl.dao;

import com.careerit.sbl.domain.Contact;

import java.util.List;

public interface ContactDao {

      Contact insertContact(Contact contact);
      List<Contact> selectContacts();
      long getContactCount();
      Contact updateContact(Contact contact);
      boolean deleteContact(long id);
      List<Contact> search(String str);
      void insertContacts(List<Contact> contacts);


}
