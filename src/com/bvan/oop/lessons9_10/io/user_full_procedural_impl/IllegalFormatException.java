package com.bvan.oop.lessons9_10.io.user_full_procedural_impl;

/**
 * @author bvanchuhov
 */
public class IllegalFormatException extends RuntimeException {

    public IllegalFormatException(String message) {
        super(message);
    }

    public IllegalFormatException(String message, Throwable cause) {
        super(message, cause);
    }
}
