package com.company.exception.exception;

import com.company.exception.utility.TimeApi;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZonedDateTime;

@ControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value ={UserNotFoundException.class})
    public ResponseEntity<Object> userExceptionHandler(UserNotFoundException e){
        ZonedDateTime zonedDateTime= TimeApi.getZonedDateTime();
        ExceptionPojo exceptionPojo = new ExceptionPojo(zonedDateTime, e.getMessage(), HttpStatus.NOT_FOUND, e);

        return new ResponseEntity<>(exceptionPojo, HttpStatus.NOT_FOUND);
    }
}
