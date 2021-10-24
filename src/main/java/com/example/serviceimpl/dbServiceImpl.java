package com.example.serviceimpl;

import com.example.entity.Employee;
import com.example.entity.Participants;
import com.example.entity.TrainingFeedback;
import com.example.entity.Unit;
import com.example.entity.training;
import com.example.service.dbService;
import com.example.utils.Sql;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class dbServiceImpl implements dbService {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int insertAllEmployees(List<Employee> employees) {
		List<Object[]> users = new ArrayList<>();
		int[] rows = null;
		try {
			for (Employee employee : employees) {
				Object[] user = { employee.getName(), employee.getUnitId() };
				users.add(user);
			}
			rows = jdbcTemplate.batchUpdate(Sql.INSERT_EMPLOYEE, users);
			return rows.length;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	@Override
	public int insertAllUnits(List<Unit> units) {
		List<Object[]> depts = new ArrayList<>();
		int[] rows = null;
		try {
			for (Unit unit : units) {
				Object[] user = { unit.getName() };
				depts.add(user);
			}
			rows = jdbcTemplate.batchUpdate(Sql.INSERT_UNIT, depts);
			return rows.length;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	@Override
	public int insertAllTrainings(List<training> trainings) {
		List<Object[]> ts = new ArrayList<>();
		int[] rows = null;
		try {
			for (training tr : trainings) {
				Object[] training = { tr.getTitle(), tr.getTrainerId(), tr.getDatetime() };
				ts.add(training);
			}
			rows = jdbcTemplate.batchUpdate(Sql.INSERT_UNIT, ts);
			return rows.length;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	@Override
	public int insertAllParticipants(List<Participants> participants) {
		List<Object[]> users = new ArrayList<>();
		int[] rows = null;
		try {
			for (Participants participant : participants) {
				Object[] user = { participant.getUserId(), participant.getTrainingId() };
				users.add(user);
			}
			rows = jdbcTemplate.batchUpdate(Sql.INSERT_PARTICIPANT, users);
			return rows.length;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	@Override
	public int insertAllTrainingFeedbacks(List<TrainingFeedback> trainingFeedbacks) {
		List<Object[]> feedbacks = new ArrayList<>();
		int[] rows = null;
		try {
			for (TrainingFeedback feedback : trainingFeedbacks) {
				Object[] fb = { feedback.getComment(), feedback.getUserId(), feedback.getTrainingId() };
				feedbacks.add(fb);
			}
			rows = jdbcTemplate.batchUpdate(Sql.INSERT_FEEDBACK, feedbacks);
			return rows.length;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}

	@Override
	public List<Map<String, Object>> getAllTrainingsByUnit(Employee e) {
		return jdbcTemplate.queryForList(Sql.GET_ALL_TRAININGS_BY_UNIT, e.getUnitId());
	}

	@Override
	public List<Map<String, Object>> getParticipantsByTrainingId(int trainingId) {
		return jdbcTemplate.queryForList(Sql.GET_ALL_PARTICIPANTS_BY_TRAINING_ID, trainingId);
	}

}
