package com.spring.demo.resources.exceptions;


import org.hibernate.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.naming.OperationNotSupportedException;
import java.time.LocalDateTime;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e) {
        StandardError err = new StandardError(HttpStatus.NOT_FOUND.value(), LocalDateTime.now(), e.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }


    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<StandardError> validation(MethodArgumentNotValidException e) {
        ValidationError err = new ValidationError(HttpStatus.BAD_REQUEST.value(), LocalDateTime.now(), "Error de Validação");
        for (FieldError x : e.getBindingResult().getFieldErrors()) {
            err.addError(x.getField(), x.getDefaultMessage());
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
    }

    @ExceptionHandler(OperationNotSupportedException.class)
    public ResponseEntity<StandardError> authorization(OperationNotSupportedException e) {
        StandardError err = new StandardError(HttpStatus.BAD_REQUEST.value(), LocalDateTime.now(), e.getLocalizedMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<StandardError> authorization(Exception e) {
        StandardError err = new StandardError(HttpStatus.INTERNAL_SERVER_ERROR.value(), LocalDateTime.now(), e.getLocalizedMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
    }

}
