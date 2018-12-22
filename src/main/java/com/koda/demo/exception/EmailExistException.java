package com.koda.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmailExistException extends RuntimeException{

    private static final String PREFIX_MESSAGE = "This email already exists: ";

    public EmailExistException(String email) {
        super(PREFIX_MESSAGE + email);
    }
}
