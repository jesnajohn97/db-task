package com.example.repo;

import java.sql.Timestamp;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.TrainingFeedback;

@Repository
public interface TrainingFeedbackRepository extends JpaRepository<TrainingFeedback, Integer> {
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value="INSERT INTO training (id, comment,userId , trainerId) values (?1, ?2, ?3 , ?4)", nativeQuery = true)
    public void saveTrainingFeedback(int id, String name, int userId, int trainerId);
	 
}




 


