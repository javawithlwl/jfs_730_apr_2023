package com.careerit.sc.di.config.ci;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("db")
public class ContactDaoDBImpl implements ContactDao{

  @Override
  public List<String> getNames() {
    return List.of("Balu","Manoj","Charan","Tanvi");
  }
}
