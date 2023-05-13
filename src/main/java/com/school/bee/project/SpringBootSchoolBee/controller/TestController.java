package com.school.bee.project.SpringBootSchoolBee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.bee.project.SpringBootSchoolBee.dto.EmployeeDto;
import com.school.bee.project.SpringBootSchoolBee.dto.SampleDto;
import com.school.bee.project.SpringBootSchoolBee.service.TestService;

@RestController
public class TestController {
	
	@Autowired
	TestService testService; 

	@GetMapping("/welcome")
	public String welcomeMethod() {		
		return "<h1>Welcome to your own world mr. shubham</h1>";
	}
		
	@GetMapping("/allTestData")
	public List<SampleDto> getTestData() {
		return testService.getTestData();
	}
	
	@GetMapping("/TestDatafor1")
	public SampleDto getTestDataById() {
		SampleDto dataByid = testService.getTestDataById(1);
		return dataByid;
	}
	
	@GetMapping("/getEmployeeDtoData")
	public EmployeeDto convertJsonToJavaDto() {
		return testService.convertJsonToJavaDto();
	}
}
