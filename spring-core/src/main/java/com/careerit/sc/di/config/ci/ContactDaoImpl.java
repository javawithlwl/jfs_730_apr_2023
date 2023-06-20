package com.careerit.sc.di.config.ci;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("inmemory")
public class ContactDaoImpl implements ContactDao{
  @Override
  public List<String> getNames() {
    return List.of("Krish","Manoj","Charan","Tanvi");
  }
}
