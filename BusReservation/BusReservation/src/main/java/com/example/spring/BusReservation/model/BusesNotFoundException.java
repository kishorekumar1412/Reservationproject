package com.example.spring.BusReservation.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class BusesNotFoundException extends RuntimeException{
	public BusesNotFoundException(String exception) {
		super(exception);
	}
	public BusesNotFoundException(String exception, Throwable t) {
		super(exception, t);
	}
}
