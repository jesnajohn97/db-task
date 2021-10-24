package com.example.entity;
import java.sql.Timestamp;

import javax.persistence.*;
 
@Entity
@Table(name = "training")
public class training {
    @Id
    private Integer id;
    private String title;
    private Integer trainerId;
    private String datetime;
    
    public training() {
    	super();
    }
  
	public training(Integer id, String title,Integer trainerId,String datetime) {
		super();
		this.id = id;
		this.title = title;
		this.trainerId = trainerId;
		this.datetime = datetime;
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


	public String getDatetime() {
		return datetime;
	}


	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}



	
 
}
