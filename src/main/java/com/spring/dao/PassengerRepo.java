package com.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.Entity.Passenger;
import java.util.List;
import java.util.Optional;


@Repository
public interface PassengerRepo extends JpaRepository<Passenger, Integer> {
   
	 Passenger findByPemailAndPpassword(String pemail, String ppassword);
	 
	Passenger findByPemail(String pemail);
//	 //security 
//     @Query(value="Select p from passenger p where p.pemail =:pemail", nativeQuery = true)
//	 public Passenger getPassengerByPemail(@Param("pemail") String pemail);
//}
}
