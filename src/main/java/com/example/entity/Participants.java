package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "participants")

public class Participants {
	@Id
	private Integer id;
	private Integer userId;
	private Integer trainingId;

	public Participants() {
		super();
	}

	public Participants(Integer id ,Integer unitId, Integer trainingId) {
		super();
		this.id = id;
		this.userId = unitId;
		this.trainingId = trainingId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getUserId() {
		return userId;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(Integer trainingId) {
		this.trainingId = trainingId;
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();
		builder.append(String.valueOf(id));
		builder.append(", ");
		builder.append(userId);
		builder.append(", ");
		builder.append(trainingId);
		return builder.toString();
	}

}
