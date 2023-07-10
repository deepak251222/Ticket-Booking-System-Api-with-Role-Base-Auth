package com.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.spring.Entity.TravlingDetails;

@Repository
@EnableJpaRepositories
public interface TravlingDetailsDao extends JpaRepository<TravlingDetails, Integer> {
	
	
	//TravlingDetails findByTrain_no(int train_no);
	
	// Voter findByVoterid(String voterid);

}
