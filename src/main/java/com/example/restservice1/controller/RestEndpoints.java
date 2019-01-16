package com.example.restservice1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice1.entity.EmployeeInformation;
import com.example.restservice1.model.Course;
import com.example.restservice1.service.DashboardService;

@RestController
public class RestEndpoints {

	@Autowired
	private DashboardService dashboardservice;

	@RequestMapping(value = "Employee", method = RequestMethod.GET)
	public List<EmployeeInformation> GetAllEmployeeInformation() {
		return dashboardservice.getAllEmployee();
	}

	@RequestMapping(value = "Employee", method = RequestMethod.POST)
	public String AddEmployeeInformation(@RequestBody EmployeeInformation empInfo) {
		if(dashboardservice.addEmployee(empInfo) !=null) {
			return "Employee Info Added";
		}
		return "Nothing added";
	}
	
	@RequestMapping(value = "Employee", method = RequestMethod.PUT)
	public String UpdateEmployeeInformation(@RequestBody EmployeeInformation empInfo) {
		if(dashboardservice.updateEmployee(empInfo) !=null) {
			return "Employee Info Updated";
		}
		return "Nothing updated";
	}
	
	@RequestMapping(value = "Employee", method = RequestMethod.DELETE)
	public String DeleteEmployeeInformation(@RequestParam(value="empId", required=true) Long pk) {
		try {
			dashboardservice.deleteEmployee(pk);
			return "deletion made";			
		}
		catch (Exception e) {
			return e.getMessage();	
		}
	}
	

	
	// note in browser the parameters are case-sensitive

	@RequestMapping(value = "/Course")
	public Course getEndPoint(@RequestParam(value = "name", defaultValue = "Spring", required = false) String name,
			@RequestParam(value = "chapCount", defaultValue = "5", required = false) int chapCount) {
		return new Course(name, chapCount);
	}

	@RequestMapping(value = "/Course", method = RequestMethod.POST)
	public String postEndpoint(@RequestBody Course c) {
		return "The new course is " + c.getName() + " with chapter# " + c.getChapterCount();
	}

}
