package com.hcl.taskmanager.exception;

public class NoSuchUserException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public NoSuchUserException(String userName) {
        super("User " + userName + " does not exist");
    }

}
