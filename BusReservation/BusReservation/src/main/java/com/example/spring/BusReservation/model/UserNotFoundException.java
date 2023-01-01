package com.example.spring.BusReservation.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException{
	public UserNotFoundException(String exception) {
		super(exception);
	}
	public UserNotFoundException(String exception, Throwable t) {
		super(exception, t);
	}
}
