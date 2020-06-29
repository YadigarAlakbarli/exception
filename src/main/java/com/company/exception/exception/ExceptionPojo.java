package com.company.exception.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class ExceptionPojo {

    private ZonedDateTime time;
    private String message;
    private HttpStatus status;
    private Exception e;

    public ExceptionPojo(ZonedDateTime time, String message, HttpStatus status, Exception e) {
        this.time = time;
        this.message = message;
        this.status = status;
        this.e = e;
    }

    public ZonedDateTime getTime() {
        return time;
    }

    public void setTime(ZonedDateTime time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public Exception getE() {
        return e;
    }

    public void setE(Exception e) {
        this.e = e;
    }
}
