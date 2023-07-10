package com.spring.GloableException;

import java.util.NoSuchElementException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GloableExceptionHandler extends RuntimeException {

	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<?> exceptionMethod1(NoSuchElementException e)
	{
		return ResponseEntity.badRequest().body("Please Enter Valid Train NO  !");
	}
}
