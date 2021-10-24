package com.example.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "trainingfeedback")

public class TrainingFeedback {
    @Id
    private Integer id;
    private String comment;
    private Integer user_id;
    private Integer training_id;
  
    public TrainingFeedback() {
    	super();
    }
  
	public TrainingFeedback(Integer id, String comment,Integer user_id, Integer training_id) {
		super();
		this.id = id;
		this.comment = comment;
		this.user_id = user_id;
		this.training_id = training_id;
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

	
	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getTraining_id() {
		return training_id;
	}

	public void setTraining_id(Integer training_id) {
		this.training_id = training_id;
	}

	@Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append(String.valueOf(id));
        builder.append(", ");
        builder.append(comment);
        builder.append(", ");
        builder.append(user_id);
        builder.append(", ");
        builder.append(training_id);
        return builder.toString();
    }
    

	
 
}
