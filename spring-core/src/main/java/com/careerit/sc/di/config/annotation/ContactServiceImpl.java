package com.careerit.sc.di.config.annotation;

import com.careerit.commonutil.Validations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

  @Autowired
  private ContactDao contactDao;

  @Autowired
  private Validations validations;

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
