package com.careerit.cbook.dao;

import com.careerit.cbook.domain.Contact;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface ContactDao {
  Contact insertContact(Contact contact);

  Contact updateContact(Contact contact) throws SQLException;

  List<Contact> search(String str);

  boolean deleteContact(long id);

  Optional<Contact> selectContact(long id);
}
