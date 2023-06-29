package com.careerit.cms.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactDto {
  private String id;
  private String name;
  private String email;
  private String mobile;
}
