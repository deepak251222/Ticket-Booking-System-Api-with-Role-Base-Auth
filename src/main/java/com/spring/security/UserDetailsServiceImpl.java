package com.spring.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.spring.Entity.Passenger;
import com.spring.dao.PassengerRepo;

public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private PassengerRepo passengerRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
	Passenger passenger = passengerRepo.findByPemail(username);
	if(passenger==null)
	{
		throw new UsernameNotFoundException("Passenger Not Found !@");
	}
	CoustomUserDetails coustomUserDetails =new CoustomUserDetails(passenger);
		return coustomUserDetails;
	}

}
