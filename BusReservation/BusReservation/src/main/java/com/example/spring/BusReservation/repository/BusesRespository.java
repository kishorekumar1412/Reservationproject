package com.example.spring.BusReservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.BusReservation.model.Buses;

public interface BusesRespository extends JpaRepository<Buses, Integer>{
		
}
