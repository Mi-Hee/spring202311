package org.choongang.commons;

import org.springframework.http.HttpStatus;

public class BadRequestException extends CommomException {
    public BadRequestException(String message) {
        super(message, HttpStatus.BAD_REQUEST);
    }
}
