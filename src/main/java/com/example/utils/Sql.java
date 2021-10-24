package com.example.utils;

public class Sql {

	public static final String INSERT_UNIT = "INSERT INTO unit(name) values(?)";
	public static final String INSERT_EMPLOYEE = "INSERT INTO employee(name, unit_id) values(?,?)";
	public static final String INSERT_TRAINING = "INSERT INTO training(title, trainer_id, datetime) values(?,?,?)";
	public static final String INSERT_PARTICIPANT = "INSERT INTO participants(user_id, training_id) values(?,?)";
	public static final String INSERT_FEEDBACK = "INSERT INTO trainingfeedback(comment,  user_id, training_id) values(?,?,?)";
	public static final String GET_ALL_TRAININGS_BY_UNIT = "select t.id as id, t.title as title, e.id as trainerId, e.name as trainer, t.datetime as dateTime from employee e, training t where e.id=t.trainer_id  and e.unit_id=?";
	public static final String GET_ALL_PARTICIPANTS_BY_TRAINING_ID="select e.id as userId, e.name as userName from employee e, participants p where e.id=p.user_id and p.training_id=?";
}
