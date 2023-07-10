package com.spring.service;

import java.util.Optional;
import java.util.Random;
import java.util.random.RandomGenerator;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.Entity.Booking;
import com.spring.Entity.Passenger;
import com.spring.Entity.TravlingDetails;
import com.spring.GloableException.GloableExceptionHandler;
import com.spring.dao.BookingRepo;
import com.spring.dao.PassengerRepo;
import com.spring.dao.TravlingDetailsDao;
import com.spring.dto.BookingDto;

@Service
public class BookingService {
		@Autowired
	private PassengerServiceImpl passengerService;
	@Autowired
	private PassengerRepo passengerRepo;
	@Autowired
	private TravlingDetailsDao travlingDao;
	@Autowired
	private BookingRepo bookingRepo;
	
	public int random()
	{
		Random random=new Random();
		 int randomNumber = random.nextInt(99);
		    String output = Integer.toString(randomNumber);

		    while (output.length() < 73) {
		      output = "0" + output;
		    }
		    int ans = Integer.parseInt(output);
		    return ans;
		  }

	public ResponseEntity<?> bookingTicket(BookingDto bookingDto)
	{
		Passenger passenger= passengerRepo.findById(bookingDto.getP_ID()).get();
		if(passenger==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Passenegr Not Found !");
		}
		TravlingDetails trainDetails = travlingDao.findById(bookingDto.getTRAIN_NO()).get();
		if(trainDetails==null)
		{
			throw new GloableExceptionHandler();
		}
		Booking booking=new Booking();
		booking.setP_id(passenger.getPid());
		booking.setP_name(passenger.getPname());
		booking.setP_age(passenger.getPage());
		booking.setSeatno(random());
		booking.setP_auth_id(passenger.getPauthid());
		booking.setP_email(passenger.getPemail());
		booking.setTrain_no(trainDetails.getTrain_no());
		booking.setS_from(trainDetails.getS_from());
		booking.setE_to(trainDetails.getTo_Des());
		booking.setT_prise(trainDetails.getTicketprice());
		bookingRepo.save(booking);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(booking);
	}

}
