package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.Entity.Booking;
import com.spring.dao.BookingRepo;
import com.spring.dto.BookingUpdateDto;

@Service
public class AdminService {
	
	@Autowired
	private BookingRepo bookingRepo;
	
	public ResponseEntity<?> getAllPassengerlist()
	{ 
		List<Booking> booking = bookingRepo.findAll();
		 if(booking.size()<=0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Booking Not found !");
		 }else{
			 return ResponseEntity.status(HttpStatus.OK).body(booking); }
	}
	public String deleteBooking(int bid)
	{
		Booking booking =bookingRepo.findById(bid).get();
		if(booking==null){
			return "Booking Not Found @!";
		}else{
			bookingRepo.delete(booking);
			return "Booking Delete Successfull : " + booking.getP_name();
		}
	}
	public ResponseEntity<?> updateBooking(BookingUpdateDto bookingUpdateDto)
	{
		Booking booking =bookingRepo.findById(bookingUpdateDto.getBid()).get();
		if(booking==null){
			return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("Booking Not Found @!");
		}else{
			booking.setP_name(bookingUpdateDto.getBname());
			booking.setP_age(bookingUpdateDto.getBage());
			booking.setP_auth_id(bookingUpdateDto.getBauth());
			booking.setP_email(bookingUpdateDto.getBemail());
		  Booking b1= bookingRepo.save(booking);
		 //we can get by booking id update data may be 
		  return ResponseEntity.status(HttpStatus.OK).body(b1);
		}
	}
}
