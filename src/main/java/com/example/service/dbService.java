package com.example.service;

import java.util.List;

import com.example.entity.Employee;

public interface dbService {

//	
//	String addUserExpenses();
//	
//	String addUserSkills();
//	
//	String addUsers();
	public List<Employee> insertAllEmployees(List<Employee> employees);

}
