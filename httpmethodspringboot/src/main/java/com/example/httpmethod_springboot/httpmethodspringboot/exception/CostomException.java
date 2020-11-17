package com.example.httpmethod_springboot.httpmethodspringboot.exception;

public class CostomException extends RuntimeException {
    public CostomException() {
        super();
    }

    public CostomException(String message) {
        super(message);
    }

    public CostomException(String message, Throwable cause) {
        super(message, cause);
    }

    public CostomException(Throwable cause) {
        super(cause);
    }

    protected CostomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
