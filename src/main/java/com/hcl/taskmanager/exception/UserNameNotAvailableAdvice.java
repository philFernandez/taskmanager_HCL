package com.hcl.taskmanager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class UserNameNotAvailableAdvice {

    @ExceptionHandler(UserNameNotAvailableException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ModelAndView userNameNotAvailableHandler(UserNameNotAvailableException e) {
        return new ModelAndView("usernameTaken", "usernameException", e.getMessage());
    }

}
