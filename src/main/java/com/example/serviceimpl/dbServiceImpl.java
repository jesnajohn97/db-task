package com.example.serviceimpl;

import com.example.entity.Employee;
import com.example.repo.EmployeeRepository;
import com.example.service.dbService;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class dbServiceImpl implements dbService  {
	
	
	@Autowired
	private EmployeeRepository employeeRepo;
	
	@Override
    public List<Employee> insertAllEmployees(List<Employee> employees) {
        return (List<Employee>)employeeRepo.saveAll(employees);
    }
	
//	@Value("${file.firstnames.path}")
//	String firstnamesPath;
//	
//	@Value("${file.lastnames.path}")
//	String lastnamesPath;
	

	
//	@Override
//	public int[] addUsers(UserListDto userListDto) {
//		List<Object[]> users = new ArrayList<>();
//		int[] rows = null;
//		try {
//			for (UserDto userDto : userListDto.getUserList()) {
//				Object[] user = { userDto.getFirstName(), userDto.getLastName(), userDto.getEmail().toLowerCase(),
//						userDto.getUsername().toLowerCase(), userDto.getPhone(), userListDto.getUpdatedBy(),
//						userDto.getEmpId(), userDto.getDesignationId(), userDto.getDob(), userDto.getBloodgroup(),
//						userDto.getBusinessUnitId(), null, null, userDto.getTeamId(), userDto.getGender(),
//						Constants.UserType.PERMANENT.toString().toLowerCase() };
//				users.add(user);
//			}
//			rows = getJdbcTemplate().batchUpdate(Sql.User.INSERT_NEW_USER, users);
//		} catch (Exception e) {
//			LOGGER.error(String.format(Constants.ENCOUNTERED_EXCEPTION, e.getMessage()));
//		}
//		return rows;
//	}


//	
//	@Override
//	public String addUser()
//	{
//
//		ArrayList<String> firstnames = readFile(firstnamesPath);
//		ArrayList<String> lastnames = readFile(lastnamesPath);
//		
//		ArrayList<Integer> emp_ids = getEmp_ids();
//		ArrayList<String> names = getUserNameCombinations(firstnames, lastnames);
//		ArrayList<String> dates = getRandomDates();
//		for(int i = 0; i< 3 ; i++)
//		{
//			
//			employeeRepo.saveEmployee(emp_ids.get(i), names.get(i), dates.get(i), names.get(i)+"@gmail.com", (int)Math.floor(Math.random()*(20-1+1)+1), (int)Math.floor(Math.random()*(5-1+1)+1));
//		}
//		
//		String s = "Data inserted successfully";
//		return s;
//	}
//
//
//	
//	
//	private ArrayList<String> readFile(String path)
//	{
//		ArrayList<String> names = new ArrayList<>();
//		try {
//			Scanner s = new Scanner(new File(path));
//			while (s.hasNext())
//			{
//			    names.add(s.next());
//			}
//			s.close();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return names;
//		
//	}
//	@Override
//	public String addUserExpenses()
//	{
//		ArrayList<String> titles = new ArrayList<>();
//		titles.add("work from home reimbursement");
//		titles.add("certifications reimbursement");
//		titles.add("travel expense reimbursement");
//		titles.add("covid vaccination reimbursement");
//		titles.add("covid medical bill reimbursement");
//		titles.add("wifi connection reimbursement");
//		titles.add("telephone bill reimbursement");
//		titles.add("medical bill reimbursement");
//		titles.add("travel kit reimbursement");
//		titles.add("passport courier reimbursement");
//		titles.add("domestic travel reimbursement");
//		titles.add("conveyance reimbursement");
//		titles.add("team lunch reimbursement");
//		titles.add("laptop repair reimbursement");
//		titles.add("covid medicines reimbursement");
//		Random rand = new Random();
//		ArrayList<Integer> emp_ids = getEmp_ids();
//		ArrayList<Integer> category_ids = getCategory_ids();
//		ArrayList<String> bill_nos = getBill_nos();
//		ArrayList<String> combinations = getCombinations(emp_ids,category_ids, bill_nos);	
//		for(int i = 0; i< 3 ; i++)
//		{
//			expenseRepo.saveExpense(Integer.parseInt(combinations.get(i).substring(0,5)), titles.get(rand.nextInt(titles.size())),(int)Math.floor(Math.random()*(50-1+1)+1),
//					Integer.parseInt(combinations.get(i).substring(13)), combinations.get(i).substring(5,13), (int)Math.floor(Math.random()*(10000-1000+1000)+1000));
//		}
//		String s = "Data inserted successfully";
//		return s;
//	}
//	
//	
//	private ArrayList<String> getCombinations(ArrayList<Integer> emp_ids, ArrayList<Integer> category_ids, ArrayList<String> bill_nos)
//	{
//		ArrayList<String> combinations = new ArrayList<>();
//		
//		for (int i = 0; i < emp_ids.size(); i++)
//		{
//		  for (int j = 0; j < bill_nos.size(); j++)
//		  {
//		    for (int k = 0; k < category_ids.size(); k++)
//		    {
//		       String combination = emp_ids.get(i) +  bill_nos.get(j) + category_ids.get(k);
//		       combinations.add(combination);
//		       
//		    }
//		  }
//		}
//		
//		return combinations;
//	}
//	
//	 private ArrayList<String> getRandomDates()
//	 {
//		 ArrayList<String> dates = new ArrayList<>();
//		 for(int i = 0; i< 5 ; i++)
//		 {
//		
//		 LocalDate from = LocalDate.of(2016, 1, 1);
//		 LocalDate to = LocalDate.of(2017, 1, 1);
//		 long days = from.until(to, ChronoUnit.DAYS);
//		 long randomDays = ThreadLocalRandom.current().nextLong(days + 1);
//		 LocalDate randomDate = from.plusDays(randomDays);
//		 String d = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH).format(randomDate);
//		 System.out.println(d);
//		 dates.add(d);
//		 }
//		
//		 return dates;
//		 
//	 }
//	
//	private ArrayList<String> getUserSkillCombinations(ArrayList<Integer> emp_ids, ArrayList<Integer> skill_ids)
//	{
//		ArrayList<String> combinations = new ArrayList<>();
//		
//		for (int i = 0; i < emp_ids.size(); i++)
//		{
//		  for (int j = 0; j < skill_ids.size(); j++)
//		  {
//		       String combination = Integer.toString(emp_ids.get(i)) + Integer.toString(skill_ids.get(j));
//		       System.out.println(combination);
//		       combinations.add(combination);
//		  }
//		}
//		
//		return combinations;
//	}
//	
//	private ArrayList<String> getUserNameCombinations(ArrayList<String> firstnames, ArrayList<String> lastnames)
//	{
//		ArrayList<String> combinations = new ArrayList<>();
//		
//		for (int i = 0; i < firstnames.size(); i++)
//		{
//		  for (int j = 0; j < lastnames.size(); j++)
//		  {
//		       String combination = firstnames.get(i) + "." + lastnames.get(j);
//		       combinations.add(combination);
//		  }
//		}
//		
//		return combinations;
//	}
//	
//	
//	private ArrayList<Integer> getEmp_ids()
//	{
//		ArrayList<Integer> emp_ids = new ArrayList<>();
//		for(int i =50001; i< 50004; i++)
//		{
//			{
//				emp_ids.add(i);
//				
//			}
//			
//		}
//		System.out.println(emp_ids);
//		return emp_ids;
//	}
//	
//	
//	private ArrayList<Integer> getCategory_ids()
//	{
//		ArrayList<Integer> category_ids = new ArrayList<>();
//		for(int i =10; i< 13; i++)
//		{
//			category_ids.add(i);
//		}
//		return category_ids;
//	}
//	
//	private ArrayList<String> getBill_nos()
//    {
//  
//		ArrayList<String> bill_nos = new ArrayList<>();
//        // chose a Character random from this String
//		for(int i=0; i< 6; i++)
//		{
//			String uuid = UUID.randomUUID().toString();
//			if(uuid.length() > 8)
//			{
//				uuid = uuid.substring(0, 8);
//			}
//			else if(uuid.length() < 8)
//			{
//				("00000000" + uuid).substring(uuid.length());
//			}
//			bill_nos.add(uuid);
//		}
//		return bill_nos;
//		
//     }
//  
//	private ArrayList<Integer> getSkill_ids()
//	{
//		ArrayList<Integer> skill_ids = new ArrayList<>();
//		for(int i = 1; i< 10; i++)
//		{
//			skill_ids.add(i);
//		}
//		System.out.println(skill_ids);
//		return skill_ids;
//	}
//  
//	
//
//
//	@Override
//	public String addUserSkills() {
//		ArrayList<Integer> emp_ids = getEmp_ids();
//		ArrayList<Integer> skill_ids = getSkill_ids();
//		ArrayList<String> combinations = getUserSkillCombinations(emp_ids, skill_ids);
//		for(int i = 0; i< 3 ; i++)
//		{
//			employeeSkillRepo.saveUserSkill(Integer.parseInt(combinations.get(i).substring(0,5)), Integer.parseInt(combinations.get(i).substring(5)), (int)Math.floor(Math.random()*(5-1+1)+1));
//		}
//		String s = "Data inserted successfully";
//		return s;
//		
//	}

}
