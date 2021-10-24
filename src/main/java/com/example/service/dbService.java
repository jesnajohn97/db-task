package com.example.service;

import java.util.List;

import com.example.entity.Employee;
import com.example.entity.Participants;
import com.example.entity.TrainingFeedback;
import com.example.entity.Unit;
import com.example.entity.training;

public interface dbService {

//	
//	String addUserExpenses();
//	
//	String addUserSkills();
//	
//	String addUsers();
	public List<Employee> insertAllEmployees(List<Employee> employees);

	public List<Employee> getAllEmployees();
	public List<training> getAllTrainings();

	public List<Unit> insertAllUnits(List<Unit> units);

	public List<training> insertAllTrainings(List<training> trainings);
	
	public List<TrainingFeedback> insertAllTrainingFeedbacks(List<TrainingFeedback> trainingFeedbacks );

	public List<Participants> insertAllParticipants(List<Participants> participants);


}
