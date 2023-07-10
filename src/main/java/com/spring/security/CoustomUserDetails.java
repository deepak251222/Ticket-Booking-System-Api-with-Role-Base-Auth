package com.spring.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.spring.Entity.Passenger;

public class CoustomUserDetails implements UserDetails {

	private Passenger passenger;
	// when i create coustom user service then I passenger Detatils
	public CoustomUserDetails(Passenger passenger) {
		super();
		this.passenger = passenger;
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
	   SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority(passenger.getRole());
		return List.of(simpleGrantedAuthority);
	}
	@Override
	public String getPassword() {
			return passenger.getPpassword();
	}

	@Override
	public String getUsername() {
	   return passenger.getPemail();
	}

	@Override
	public boolean isAccountNonExpired() {
	
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
			return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
			return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
