package com.empanada.app.webservice.exceptions;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.empanada.app.webservice.ui.model.response.ErrorMessage;

@ControllerAdvice
public class AppExceptionsHandler {

  @ExceptionHandler(value = { UserServiceException.class })
  public ResponseEntity<Object> handleUserServiceException(UserServiceException ex, WebRequest request) {
    final ErrorMessage errorMessage = new ErrorMessage(new Date(), ex.getMessage());

    return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
  }

  @ExceptionHandler(value = { Exception.class })
  public ResponseEntity<Object> handleOtherExceptions(Exception ex, WebRequest request) {
    final ErrorMessage errorMessage = new ErrorMessage(new Date(), ex.getMessage());

    ex.printStackTrace();

    return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
  }
}
