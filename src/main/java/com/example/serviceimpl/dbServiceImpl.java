package com.example.serviceimpl;

import com.example.entity.Employee;
import com.example.entity.Participants;
import com.example.entity.TrainingFeedback;
import com.example.entity.Unit;
import com.example.entity.training;
import com.example.repo.EmployeeRepository;
import com.example.repo.ParticipantsRepository;
import com.example.repo.TrainingFeedbackRepository;
import com.example.repo.TrainingRepository;
import com.example.repo.UnitRepository;
import com.example.service.dbService;
import com.example.utils.Sql;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class dbServiceImpl implements dbService {

	@Autowired
	private EmployeeRepository employeeRepo;

	@Autowired
	private UnitRepository unitRepo;

	@Autowired
	private TrainingRepository trainingRepo;

	@Autowired
	private ParticipantsRepository participantsRepo;

	@Autowired
	private TrainingFeedbackRepository trainingFeedbackRepo;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> insertAllEmployees(List<Employee> employees) {
		return (List<Employee>) employeeRepo.saveAll(employees);
	}

	@Override
	public List<Unit> insertAllUnits(List<Unit> units) {
		return (List<Unit>) unitRepo.saveAll(units);
	}

	@Override
	public List<training> insertAllTrainings(List<training> trainings) {
		return (List<training>) trainingRepo.saveAll(trainings);
	}

	@Override
	public List<Participants> insertAllParticipants(List<Participants> participants) {
		return (List<Participants>) participantsRepo.saveAll(participants);
	}

	@Override
	public List<TrainingFeedback> insertAllTrainingFeedbacks(List<TrainingFeedback> trainingFeedbacks) {
		return (List<TrainingFeedback>) trainingFeedbackRepo.saveAll(trainingFeedbacks);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return (List<Employee>) employeeRepo.findAll();
	}

	@Override
	public List<training> getAllTrainings() {
		return (List<training>) trainingRepo.findAll();
	}

	@Override
	public List<Map<String, Object>> getAllTrainingsByUnit(Employee e) {
		return jdbcTemplate.queryForList(Sql.GET_ALL_TRAININGS_BY_UNIT, e.getUnitId());
	}

	@Override
	public List<Map<String, Object>> getParticipantsByTrainingId(int trainingId) {
		return jdbcTemplate.queryForList(Sql.GET_PARTICIPANTS_BY_TRAINING_ID, trainingId);
	}

}
