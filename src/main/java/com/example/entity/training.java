package com.example.entity;
import java.security.Timestamp;

import javax.persistence.*;
 
@Entity
@Table(name = "training")
public class training {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private Integer trainerId;
    private Timestamp datetime;
    
  
	public training(Integer id, String title,Integer trainerId,Timestamp datetime) {
		super();
		this.id = id;
		this.title = title;
		this.trainerId = trainerId;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Integer getTrainerId() {
		return trainerId;
	}


	public void setTrainerId(Integer trainerId) {
		this.trainerId = trainerId;
	}


	public Timestamp getDatetime() {
		return datetime;
	}


	public void setDatetime(Timestamp datetime) {
		this.datetime = datetime;
	}



	
 
}
