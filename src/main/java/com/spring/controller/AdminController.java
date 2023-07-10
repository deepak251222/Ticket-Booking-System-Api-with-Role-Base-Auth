package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.dto.BookingUpdateDto;
import com.spring.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;
	@GetMapping("/all")
	public ResponseEntity<?> getPassengerList()
	{
		return ResponseEntity.ok(adminService.getAllPassengerlist());
	}
	@DeleteMapping("/{booking_id}")
	public ResponseEntity<?> delete(@PathVariable ("booking_id") int b_id)
	{
		String str=adminService.deleteBooking(b_id);
		return ResponseEntity.ok("str");
	}
	@PutMapping("/update")
	public ResponseEntity<?> updatebooking(@RequestBody BookingUpdateDto bookingUpdateDto)
	{
		return adminService.updateBooking(bookingUpdateDto);
	}

}
