package com.careerit.playerstats.controller;

import com.careerit.playerstats.dto.ErrorResponse;
import com.careerit.playerstats.exception.PlayerNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler(value = PlayerNotFoundException.class)
  public ResponseEntity<ErrorResponse> playerNotFoundException(PlayerNotFoundException exception) {
    ErrorResponse errorResponse = ErrorResponse.builder().message(exception.getMessage()).status(HttpStatus.BAD_REQUEST)
        .localTime(java.time.LocalTime.now())
        .build();
    return ResponseEntity.badRequest().body(errorResponse);
  }
  @ExceptionHandler(value
      = { IllegalArgumentException.class, IllegalStateException.class })
  protected ResponseEntity<ErrorResponse> handleConflict(
      RuntimeException ex, WebRequest request) {
    ErrorResponse errorResponse = ErrorResponse.builder().message(ex.getMessage()).status(HttpStatus.CONFLICT)
        .localTime(java.time.LocalTime.now())
        .build();
    return ResponseEntity.badRequest().body(errorResponse);
  }

}
