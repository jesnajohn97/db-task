package com.example.controller;

import com.example.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.service.dbService;
import java.util.List;

@RestController
public class UserController {

	@Autowired
	dbService dbservices;
	
	  @PostMapping("bulk")
	    public String addEmployees(@RequestBody List<Employee> employees) {
	        if(employees != null && !employees.isEmpty()) {
	            dbservices.insertAllEmployees(employees);
	            return String.format("Added %d people.", employees.size());
	        } else {
	            return "no request body";
	        }
	    }

	
	
//
//	@GetMapping("/add/users")
//	public String addUsers() {
//	 
//		return dbservices.addUser();
//	}
//	
	
//	@GetMapping("/add/userExpenses")
//	public String addUserExpenses() {
//		
//		return dbservices.addUserExpenses();
//	}
//	
//	
//	@GetMapping("/add/userSkills")
//	public String addUserSkills() {
//		
//		return dbservices.addUserSkills();
//	}
//	
	

	


}