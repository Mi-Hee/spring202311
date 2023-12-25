package org.choongang.commons;

import org.springframework.http.HttpStatus;

public class CommomException extends RuntimeException {
    private HttpStatus status;

    public CommomException(String message) {
        this(message, HttpStatus.INTERNAL_SERVER_ERROR); // 500
    }

    public CommomException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
