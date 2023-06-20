package com.careerit.sc.di.config.java;

import java.util.List;

public class ContactDaoImpl implements ContactDao {
  @Override
  public List<String> getNames() {
    return List.of("Krish - Java","Manoj","Charan","Tanvi","Sai","Rajesh","Suresh");
  }
}
