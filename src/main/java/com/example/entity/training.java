package com.example.entity;
import java.sql.Timestamp;

import javax.persistence.*;
 
@Entity
@Table(name = "training")
public class training {
    @Id
    private Integer id;
    private String title;
    private Integer trainer_id;
    private String datetime;
    
    public training() {
    	super();
    }
  
	public training(Integer id, String title,Integer trainer_id,String datetime) {
		super();
		this.id = id;
		this.title = title;
		this.trainer_id = trainer_id;
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


	

	public Integer getTrainer_id() {
		return trainer_id;
	}

	public void setTrainer_id(Integer trainer_id) {
		this.trainer_id = trainer_id;
	}

	public String getDatetime() {
		return datetime;
	}


	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}



	
 
}
