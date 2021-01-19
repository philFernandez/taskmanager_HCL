package com.hcl.taskmanager.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class NoSuchUserAdvice {

    @ExceptionHandler(NoSuchUserException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ModelAndView noSuchUserFoundAdvice(NoSuchUserException e) {
        return new ModelAndView("noSuchUser", "noUserException", e.getMessage());
    }
}
