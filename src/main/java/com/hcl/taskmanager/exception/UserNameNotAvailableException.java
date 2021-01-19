package com.hcl.taskmanager.exception;

public class UserNameNotAvailableException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    public UserNameNotAvailableException(String userName) {
        super("User Name " + userName + " is not available");
    }
}
