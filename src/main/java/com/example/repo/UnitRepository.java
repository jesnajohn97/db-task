package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Unit;


@Repository
public interface UnitRepository extends JpaRepository<Unit, Integer> {
	
	@Transactional
	@Modifying(clearAutomatically = true)
	@Query(value="INSERT INTO unit (id, name) values (?1, ?2)", nativeQuery = true)
    public void saveEmployee(int id, String name);
	 
}



