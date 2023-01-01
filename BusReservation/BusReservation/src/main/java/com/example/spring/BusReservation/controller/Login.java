package com.example.spring.BusReservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.BusReservation.model.User;
import com.example.spring.BusReservation.model.UserNotFoundException;
import com.example.spring.BusReservation.service.UserService;

@RestController
public class Login {
	
	@Autowired
	UserService userservice;
	
	@GetMapping("/busbooking")
	public String displaySite() {
		return "...WELCOME TO GREENBUS...";
	}
	@GetMapping("/{emailid}")
	public ResponseEntity<User> getuserById(@PathVariable("emailId") String emailId) throws UserNotFoundException{
		User entity=userservice.getuserById(emailId);
		return new ResponseEntity<User>(entity,new HttpHeaders(),HttpStatus.ACCEPTED);
	}
	@PostMapping
	public ResponseEntity<User> createOrUpdateUser(@RequestBody User user) throws UserNotFoundException{
		User updated=userservice.createOrUpdateUser(user);
		return new ResponseEntity<User>(updated,new HttpHeaders(),HttpStatus.CREATED);
	}
}