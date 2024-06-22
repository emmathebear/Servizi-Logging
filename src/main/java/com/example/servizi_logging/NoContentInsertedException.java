package com.example.servizi_logging;

public class NoContentInsertedException extends RuntimeException{

    public NoContentInsertedException(String message) {
        super(message);
    }
}
