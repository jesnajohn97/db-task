package com.example.controller;

import com.example.entity.Employee;
import com.example.entity.Participants;
import com.example.entity.TrainingFeedback;
import com.example.entity.Unit;
import com.example.entity.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.service.dbService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

	@Autowired
	dbService dbservices;

	@PostMapping("addBulkEmployees")
	public String addEmployees(@RequestBody List<Employee> employees) {
		if (employees != null && !employees.isEmpty()) {
			dbservices.insertAllEmployees(employees);
			return String.format("Added %d people.", employees.size());
		} else {
			return "no request body";
		}
	}

	@PostMapping("addBulkTrainings")
	public String addTrainings(@RequestBody List<training> trainings) {
		if (trainings != null && !trainings.isEmpty()) {
			dbservices.insertAllTrainings(trainings);
			return String.format("Added %d trainings.", trainings.size());
		} else {
			return "no request body";
		}
	}

	@PostMapping("addBulkTrainingFeedback")
	public String addTrainingFeedback(@RequestBody List<TrainingFeedback> trainingFeedbacks) {
		if (trainingFeedbacks != null && !trainingFeedbacks.isEmpty()) {
			dbservices.insertAllTrainingFeedbacks(trainingFeedbacks);
			return String.format("Added %d training feedback.", trainingFeedbacks.size());
		} else {
			return "no request body";
		}
	}

	@PostMapping("addBulkParticipants")
	public String addParticipants(@RequestBody List<Participants> participants) {
		if (participants != null && !participants.isEmpty()) {
			dbservices.insertAllParticipants(participants);
			return String.format("Added %d participants.", participants.size());
		} else {
			return "no request body";
		}
	}

	@PostMapping("addBulkUnits")
	public String addUnits(@RequestBody List<Unit> units) {
		if (units != null && !units.isEmpty()) {
			dbservices.insertAllUnits(units);
			return String.format("Added %d units.", units.size());
		} else {
			return "no request body";
		}
	}

	@GetMapping("getAllEmployees")
	public List<Employee> getAllEmployees() {
		List<Employee> employees = dbservices.getAllEmployees();
		if (employees != null && !employees.isEmpty()) {
			return employees;
		} else {
			return new ArrayList<>();
		}
	}

	@GetMapping("getAllTrainings")
	public List<training> getAllTrainings() {
		List<training> trainings = dbservices.getAllTrainings();
		if (trainings != null && !trainings.isEmpty()) {
			return trainings;
		} else {
			return new ArrayList<>();
		}
	}

	@PostMapping("getAllTRainingsByUnit")
	public List<Map<String, Object>> getAllTRainingsByUnit(@RequestBody Employee e) {
		List<Map<String, Object>> trainings = dbservices.getAllTRainingsByUnit(e);
		if (trainings != null && !trainings.isEmpty()) {
			return trainings;
		} else {
			return new ArrayList<>();
		}
	}

	@PostMapping("getParticipantsByTrainingId")
	public List<Map<String, Object>> getParticipantsByTrainingId(@RequestBody Participants p) {
		return dbservices.getParticipantsByTrainingId(p.getTrainingId());
	}

}