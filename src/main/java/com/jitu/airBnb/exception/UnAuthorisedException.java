package com.jitu.airBnb.exception;

public class UnAuthorisedException extends RuntimeException{
    public UnAuthorisedException(String message) {
        super(message);
    }
}
