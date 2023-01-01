package com.example.spring.BusReservation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.BusReservation.model.Buses;
import com.example.spring.BusReservation.model.BusesNotFoundException;
import com.example.spring.BusReservation.repository.BusesRespository;


@Service
public class BusesService {

	@Autowired
	BusesRespository busesrepository;

	public List<Buses> getBuses(){
		List<Buses> buses=busesrepository.findAll();

		if (buses.size()>0) {
			return buses;
		}
		else {
			return new ArrayList<Buses>();
		}
	}

	public Buses getBusesById(Integer busno) throws BusesNotFoundException{
		Optional<Buses> buses=busesrepository.findById(busno);

		if (buses.isPresent()) {
			return buses.get();
		}
		else {
			throw new BusesNotFoundException("buses not available");
		}
	}

	public Buses createOrUpdateBuses(Buses busess) throws BusesNotFoundException{
		Optional<Buses> buses=busesrepository.findById(buses.getBusno());

		if(buses.isPresent()) {
			Buses newBuses=buses.get();
			newBuses.setBusno(2);
			newBuses.setTotalseats(100);
			newBuses.setSeaterorsleeper(false);

			newBuses=busesrepository.save(newBuses);

			return newBuses;
		}
		else {
			buses=busesrepository.save(buses);
		}
	}

	public void deleteBuses(Integer busno) throws BusesNotFoundException{
		Optional<Buses> buses = busesrepository.findById(busno);

		if(buses.isPresent()) {
			busesrepository.deleteById(busno);
		}
		else {
			throw new BusesNotFoundException("No such buses found");
		}
	}
}