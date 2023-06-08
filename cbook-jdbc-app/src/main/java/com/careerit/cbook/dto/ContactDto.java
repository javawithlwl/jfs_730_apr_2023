package com.careerit.cbook.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ContactDto {

  private long id;
  private String name;
  private String email;
  private String mobile;
}
