package com.example.service;

import java.util.List;
import java.util.Map;

import com.example.entity.Employee;
import com.example.entity.Participants;
import com.example.entity.TrainingFeedback;
import com.example.entity.Unit;
import com.example.entity.training;

public interface dbService {

	public int insertAllEmployees(List<Employee> employees);

	public int insertAllUnits(List<Unit> units);

	public int insertAllTrainings(List<training> trainings);
	
	public int insertAllTrainingFeedbacks(List<TrainingFeedback> trainingFeedbacks );

	public int insertAllParticipants(List<Participants> participants);
	
	public List<Map<String, Object>> getParticipantsByTrainingId(int trainingId);

	public List<Map<String, Object>> getAllTrainingsByUnit(Employee e);

}
