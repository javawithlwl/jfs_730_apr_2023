package com.careerit.cms.dto;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "app_user")
public class AppUser {
  @Id
  private String id;
  private String username;
  private String password;
  private Collection<String> roles;
}
