package com.spring.service;

import com.spring.Entity.Passenger;
import com.spring.dto.LoginDto;

public interface PassengerService {
	
	public Passenger add(Passenger passenger);
	
	public String loginPassenegr(LoginDto loginDto);
	
	public Passenger findbyEmail(String email);

}
