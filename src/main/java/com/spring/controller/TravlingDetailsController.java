package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.Entity.TravlingDetails;
import com.spring.dao.TravlingDetailsDao;

@RestController
@RequestMapping("/traving")
public class TravlingDetailsController {
	@Autowired
	private TravlingDetailsDao travlingDao;
	@PostMapping("/add")
	public ResponseEntity<?> add(@ModelAttribute TravlingDetails travlingDetails)
	{
		travlingDao.save(travlingDetails);
		return  ResponseEntity.status(HttpStatus.CREATED).body(travlingDao.save(travlingDetails));
	}
	@GetMapping("/all")
	public ResponseEntity<?> getAllTravlingDetatils()
	{
		return ResponseEntity.status(HttpStatus.OK).body(travlingDao.findAll());
	}

}
