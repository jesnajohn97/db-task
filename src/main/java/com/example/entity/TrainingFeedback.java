package com.example.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trainingfeedback")

public class TrainingFeedback {
    @Id
    private Integer id;
    private String comment;
    private Integer userId;
    private Integer trainingId;
  
    public TrainingFeedback() {
    	super();
    }
  
	public TrainingFeedback(Integer id, String comment,Integer userId, Integer trainingId) {
		super();
		this.id = id;
		this.comment = comment;
		this.userId = userId;
		this.trainingId = trainingId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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
        builder.append(comment);
        builder.append(", ");
        builder.append(userId);
        builder.append(", ");
        builder.append(trainingId);
        return builder.toString();
    }
 
}
