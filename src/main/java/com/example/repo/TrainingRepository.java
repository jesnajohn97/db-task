package com.example.repo;

import java.sql.Timestamp;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.training;


@Repository
public interface TrainingRepository extends JpaRepository<training, Integer> {
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value="INSERT INTO training (id, title,trainerId, datetime) values (?1, ?2, ?3 , ?4)", nativeQuery = true)
    public void saveTraining(int id, String name, int trainerId , Timestamp datetime);
	 
}




 


