package com.spring.controller;

import java.util.Optional;

import javax.security.auth.login.AccountNotFoundException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Entity.Booking;
import com.spring.Entity.Passenger;
import com.spring.dao.BookingRepo;
import com.spring.dao.TravlingDetailsDao;
import com.spring.dto.BookingDto;
import com.spring.dto.LoginDto;
import com.spring.service.BookingService;
import com.spring.service.PassengerServiceImpl;

@RestController
@RequestMapping("/passenger")
public class PassengerController {
	@Autowired
	private PassengerServiceImpl passengerService;
	@Autowired
	private TravlingDetailsDao travlingDao;
	 
	@Autowired
	private BookingRepo bookingRepo;
	
	@Autowired
	private BookingService bookingService;
	
	@PostMapping("/add")
	public ResponseEntity<?> addPassenger(@RequestBody @Valid Passenger passenger)
	{
		Passenger passenger2 = passengerService.findbyEmail(passenger.getPemail());
		if(passenger2!=null)
		{
			return ResponseEntity.status(HttpStatus.ALREADY_REPORTED)
					.body("User Already Exit : "+ passenger.getPemail());
		}else {
		Passenger passenger1 = passengerService.add(passenger);
	   return ResponseEntity.status(HttpStatus.CREATED).body(passenger1);
	}
	}
	@GetMapping("/login")
	public ResponseEntity<?> PassengerLogin(@RequestBody LoginDto loginDto)
	{
	    String str =passengerService.loginPassenegr(loginDto);
	    if(str=="user avilable") {
	    	return ResponseEntity.status(HttpStatus.OK).body(travlingDao.findAll());
	    }else {
	    	return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("@ User Not Avilable ! Please Enter Valid User Name and Password @ !");	
	    }
	}
//******** Getting Booking Details ******
	@GetMapping("/{bid}")
   public ResponseEntity<?> BookingDetails(@PathVariable int b_id)
   {
		Booking booking=bookingRepo.findById(b_id).get();
		if(booking!=null) {
		return ResponseEntity.status(HttpStatus.OK).body(booking);
		}else
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Booking Is Not Found !#");
		}
   }
	// Canceling Ticket  by User 
	@DeleteMapping("/cancel/{id}")
	public ResponseEntity<?> Cancel(@PathVariable int id)throws Exception
	{
	     Booking booking = bookingRepo.findById(id).get();
	     if(booking ==null)
	     {
	    	 throw new AccountNotFoundException("Booking Not Found !");   
	     }
	     else {
	    	 bookingRepo.delete(booking);
	    	 return ResponseEntity.status(HttpStatus.OK).body("Booking Delete SuccessFull !" + booking.getP_name());
	     }
	}
	
	// ******* For Booking Ticket *******
	@PostMapping("/booking")
	public ResponseEntity<?> BookingDetails(@ModelAttribute BookingDto bookingDto)
	{	
		ResponseEntity<?> bookingTicket = bookingService.bookingTicket(bookingDto);
		return ResponseEntity.ok(bookingTicket);
	}
	
}
