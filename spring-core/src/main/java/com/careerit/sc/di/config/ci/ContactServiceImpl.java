package com.careerit.sc.di.config.ci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService{

  private final ContactDao contactDao;

  @Autowired
  public ContactServiceImpl(@Qualifier("inmemory") ContactDao contactDao) {
    this.contactDao = contactDao;
  }
  @Override
  public List<String> getContactNames() {
    return contactDao.getNames();
  }
}
