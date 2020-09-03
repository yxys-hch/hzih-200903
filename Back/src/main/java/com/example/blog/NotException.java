package com.example.blog;

public class NotException extends RuntimeException {
    public NotException() {
    }

    public NotException(String message) {
        super(message);
    }

    public NotException(String message, Throwable cause) {
        super(message, cause);
    }
}
