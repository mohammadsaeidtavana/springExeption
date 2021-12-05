package com.greenbox.exeptionhandeler.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.security.sasl.SaslException;

@Controller
@ControllerAdvice
public class GlobalExeption {

    @ExceptionHandler(saeedexeption.class)
    public ResponseEntity<String> saeedExeption (saeedexeption saeedexeption){

        return new ResponseEntity(saeedexeption.getMessage()+saeedexeption.getCode(), HttpStatus.BAD_REQUEST);
    }
}
