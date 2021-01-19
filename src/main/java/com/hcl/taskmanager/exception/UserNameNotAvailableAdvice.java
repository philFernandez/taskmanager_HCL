package com.hcl.taskmanager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class UserNameNotAvailableAdvice {

    @ResponseBody
    @ExceptionHandler(UserNameNotAvailableException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public String userNameNotAvailableHandler(UserNameNotAvailableException e) {
        return e.getMessage();
    }
    
}
