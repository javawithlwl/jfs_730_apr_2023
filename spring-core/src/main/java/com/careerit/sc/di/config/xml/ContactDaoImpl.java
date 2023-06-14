package com.careerit.sc.di.config.xml;

import com.careerit.sc.di.config.xml.ContactDao;

import java.util.List;

public class ContactDaoImpl implements ContactDao {
  @Override
  public List<String> getNames() {
    return List.of("Krish","Manoj","Charan","Tanvi","Sai","Rajesh","Suresh");
  }
}
