package com.spring.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.Entity.Booking;
import com.spring.Entity.Passenger;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer> {
	
	     // @Query("SELECT u.P_email FROM booking_table u WHERE")
	    //  Optional<Booking> findByP_email(String P_email);

}
