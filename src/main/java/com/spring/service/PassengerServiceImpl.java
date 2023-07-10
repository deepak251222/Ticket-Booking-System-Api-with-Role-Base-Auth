package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.spring.Entity.Passenger;
import com.spring.dao.PassengerRepo;
import com.spring.dto.LoginDto;

@Service
public class PassengerServiceImpl implements PassengerService {
	 
	@Autowired
	private PassengerRepo passengerRepo;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	// **** Adding user *****
	@Override
	public Passenger add(Passenger passenger) {
		passenger.setPpassword(passwordEncoder.encode(passenger.getPpassword()));
		return passengerRepo.save(passenger);
	}
	// **** login *******
	@Override
	public String loginPassenegr(LoginDto loginDto) {
	// String pwd =passwordEncoder.encode(loginDto.getUpwd());
		Passenger passenger = passengerRepo.findByPemailAndPpassword(loginDto.getUemail(), loginDto.getUpwd());
		if(passenger!=null)
		{
			return "user avilable";
		}
		return "user not avilable";
	}
	// **** finding passenger ****
	@Override
	public Passenger findbyEmail(String email) {
		return passengerRepo.findByPemail(email);
	
	}

	
}
