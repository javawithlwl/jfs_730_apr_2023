package com.careerit.sc.di.config.xml;

import java.util.List;

public class ContactServiceImpl implements ContactService {

  private ContactDao contactDao;

  @Override
  public List<String> getContactNames() {
    return contactDao.getNames();
  }

  public ContactDao getContactDao() {
    return contactDao;
  }

  public void setContactDao(ContactDao contactDao) {
    this.contactDao = contactDao;
  }
}
