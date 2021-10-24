package com.example.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Participants;


@Repository
public interface ParticipantsRepository extends JpaRepository<Participants, Integer> {
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value="INSERT INTO participants (id, trainingId, userId) values (?1, ?2, ?3)", nativeQuery = true)
    public void saveParticipants(int id, int trainingId , int userId);
	 
}
