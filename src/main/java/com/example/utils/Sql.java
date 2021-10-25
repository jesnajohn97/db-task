package com.example.utils;

public class Sql {

	public static final String INSERT_UNIT = "INSERT INTO unit(name) values(?)";
	public static final String INSERT_EMPLOYEE = "INSERT INTO employee(name, unit_id) values(?,?)";
	public static final String INSERT_TRAINING = "INSERT INTO training(title, trainer_id, datetime) values(?,?,?)";
	public static final String INSERT_PARTICIPANT = "INSERT INTO participants(user_id, training_id) values(?,?)";
	public static final String INSERT_FEEDBACK = "INSERT INTO trainingfeedback(comment,  user_id, training_id) values(?,?,?)";
	public static final String GET_ALL_TRAININGS_BY_UNIT = "select t.id as id, t.title as title, e.id as trainerId, e.name as trainer, t.datetime as dateTime from employee e, training t where e.id=t.trainer_id  and e.unit_id=?";
	public static final String GET_TRAININGS_BY_UNIT = "select t.id as trainingId, t.title as trainingTitle ,e.id as trainerId ,e.name as trainer,t.datetime as dateTime from employee e inner join training t on e.id=t.trainer_id  where e.unit_id=?";
	public static final String GET_ALL_PARTICIPANTS_BY_TRAINING_ID="select e.id as userId, e.name as userName, u.name as unitName from employee e, participants p, unit u where e.id=p.user_id and e.unit_id=u.id and p.training_id=?";
	public static final String GET_PARTICIPANTS_BY_TRAINING_ID="select e.id as userId ,e.name as userName, u.name as unitName from employee e inner join unit u on e.unit_id=u.id"
			+ " inner join participants p on  e.id=p.user_id where p.training_id=?";
}
