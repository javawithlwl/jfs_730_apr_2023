package com.careerit.sc.di.config.annotation;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContactDaoImpl implements ContactDao {
  @Override
  public List<String> getNames() {
    return List.of("Krish - Annotations","Manoj","Charan","Tanvi","Sai","Rajesh","Suresh");
  }
}
