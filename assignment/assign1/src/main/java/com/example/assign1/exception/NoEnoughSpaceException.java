package com.example.assign1.exception;

public class NoEnoughSpaceException extends RuntimeException {
    public NoEnoughSpaceException(String message) {
        super(message);
    }
}
