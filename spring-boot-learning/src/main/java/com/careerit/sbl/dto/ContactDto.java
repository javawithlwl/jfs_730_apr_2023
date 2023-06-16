package com.careerit.sbl.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContactDto {
  private long id;
  private String name;
  private String email;
  private String mobile;
}
