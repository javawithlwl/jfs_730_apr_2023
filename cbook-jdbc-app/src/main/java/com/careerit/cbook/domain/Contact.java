package com.careerit.cbook.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.StringJoiner;

@Getter
@Setter
public class Contact {
      private long id;
      private String name;
      private String email;
      private String mobile;

}
