package com.careerit.playerstats.dto;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorResponse {

      private String message;
      private HttpStatus status;
      private LocalTime localTime;
}
