package com.example.controller;

import com.example.entity.Employee;
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

	@PostMapping("addBulkUnits")
	public String addUnits(@RequestBody List<Unit> units) {
		if (units != null && !units.isEmpty()) {
			int res = dbservices.insertAllUnits(units);
			if (res > 0) {
				return String.format("Added %d units.", res);
			} else {
				return "No data inserted";
			}
		} else {
			return "no request body";
		}
	}

	@PostMapping("addBulkEmployees")
	public String addEmployees(@RequestBody List<Employee> employees) {
		if (employees != null && !employees.isEmpty()) {
			int res = dbservices.insertAllEmployees(employees);
			if (res > 0) {
				return String.format("Added %d employees.", res);
			} else {
				return "No data inserted";
			}
		} else {
			return "no request body";
		}
	}

	@PostMapping("addBulkTrainings")
	public String addTrainings(@RequestBody List<training> trainings) {
		if (trainings != null && !trainings.isEmpty()) {
			int res = dbservices.insertAllTrainings(trainings);
			if (res > 0) {
				return String.format("Added %d trainings.", res);
			} else {
				return "No data inserted";
			}
		} else {
			return "no request body";
		}
	}

	@PostMapping("addBulkTrainingFeedback")
	public String addTrainingFeedback(@RequestBody List<TrainingFeedback> trainingFeedbacks) {
		if (trainingFeedbacks != null && !trainingFeedbacks.isEmpty()) {
			int res = dbservices.insertAllTrainingFeedbacks(trainingFeedbacks);
			if (res > 0) {
				return String.format("Added %d training feedbacks.", res);
			} else {
				return "No data inserted";
			}
		} else {
			return "no request body";
		}
	}

	@GetMapping("getAllTrainings")
	public List<Map<String, Object>> getAllTRainings() {
		List<Map<String, Object>> trainings = dbservices.getAllTrainings();
		if (trainings != null && !trainings.isEmpty()) {
			return trainings;
		} else {
			return new ArrayList<>();
		}
	}

	@PostMapping("getParticipantsByTrainingId")
	public List<Map<String, Object>> getParticipantsByTrainingId(@RequestBody TrainingFeedback f) {
		return dbservices.getParticipantsByTrainingId(f.getTrainingId());
	}

	@PostMapping("getAllTrainingsByParticipant")
	public List<Map<String, Object>> getAllTrainingsByParticipant(@RequestBody TrainingFeedback f) {
		List<Map<String, Object>> trainings = dbservices.getAllTrainingsByParticipant(f);
		if (trainings != null && !trainings.isEmpty()) {
			return trainings;
		} else {
			return new ArrayList<>();
		}
	}

}