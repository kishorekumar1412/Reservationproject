package com.example.spring.BusReservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.spring.BusReservation.model.Buses;
import com.example.spring.BusReservation.model.BusesNotFoundException;
import com.example.spring.BusReservation.service.BusesService;

public class BusesController {

	@Autowired
	BusesService busesService;

	@GetMapping
	public ResponseEntity<List<Buses>>getBuses(){
		List<Buses> list=busesService.getBuses();

		return new ResponseEntity<List<Buses>>(list,new HttpHeaders(),HttpStatus.CONTINUE);
	}

	@GetMapping("/{busno}")
	public ResponseEntity<Buses> getBusesById(@PathVariable("busno") int busno) throws BusesNotFoundException{
		Buses entity=busesService.getBusesById(busno);

		return new ResponseEntity<Buses>(entity,new HttpHeaders(),HttpStatus.ACCEPTED);
	}

	@PostMapping("/{busno}")
	public ResponseEntity<Buses> createOrUpdateBuses(@RequestBody Buses buses) throws BusesNotFoundException{
		Buses updated=busesService.createOrUpdateBuses(buses);
		return new ResponseEntity<Buses>(updated,new HttpHeaders(),HttpStatus.CREATED);
	}

	@DeleteMapping("/{busno}")
	public HttpStatus deleteBuses(@PathVariable("busno") Integer busno) throws BusesNotFoundException{
		busesService.deleteBuses(busno);
		return HttpStatus.GONE;
	}
}
