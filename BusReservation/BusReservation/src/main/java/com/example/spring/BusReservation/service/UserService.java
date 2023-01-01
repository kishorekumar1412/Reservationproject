package com.example.spring.BusReservation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.BusReservation.model.User;
import com.example.spring.BusReservation.model.UserNotFoundException;
import com.example.spring.BusReservation.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userrepository;

	public User getuserById(String emailId) throws UserNotFoundException{
		Optional<User> user=userrepository.findById(emailId);

		if(user.isPresent())
		{
			return user.get();
		}
		else
		{
			throw new UserNotFoundException("Not Valid");
		}
	}

	public User createOrUpdateUser(User user) {
		//TODO Auto-generated method stub
		return null;
	}
}
