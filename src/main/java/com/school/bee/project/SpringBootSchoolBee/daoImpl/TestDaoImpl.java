package com.school.bee.project.SpringBootSchoolBee.daoImpl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.school.bee.project.SpringBootSchoolBee.dao.TestDao;
import com.school.bee.project.SpringBootSchoolBee.dto.EmployeeDto;
import com.school.bee.project.SpringBootSchoolBee.dto.SampleDto;

@Repository
public class TestDaoImpl implements TestDao {

	@Override
	public List<SampleDto> getTestData() {
		
		List<SampleDto> sampleDtoList = new ArrayList<>();
		
		sampleDtoList.add(new SampleDto(1, "shubham", "rai", "village-sikraul dist-buxar bihar,", 27));
		sampleDtoList.add(new SampleDto(2, "satyam", "rai", "village-sikraul dist-buxar bihar,", 20));
		sampleDtoList.add(new SampleDto(3, "badak", "rai", "village-sikraul dist-buxar bihar,", 26));
		sampleDtoList.add(new SampleDto(4, "chhotak", "rai", "village-sikraul dist-buxar bihar,", 28));
		sampleDtoList.add(new SampleDto(5, "jugnu", "rai", "village-sikraul dist-buxar bihar,", 25));
		
		return sampleDtoList;
	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public SampleDto getTestDataById(int id) {
		
        List<SampleDto> sampleDtoList = new ArrayList<>();	
		sampleDtoList.add(new SampleDto(1, "shubham", "rai", "village-sikraul dist-buxar bihar,", 27));
		sampleDtoList.add(new SampleDto(2, "satyam", "rai", "village-sikraul dist-buxar bihar,", 20));
		sampleDtoList.add(new SampleDto(3, "badak", "rai", "village-sikraul dist-buxar bihar,", 26));
		sampleDtoList.add(new SampleDto(4, "chhotak", "rai", "village-sikraul dist-buxar bihar,", 28));
		sampleDtoList.add(new SampleDto(5, "jugnu", "rai", "village-sikraul dist-buxar bihar,", 25)); 
		
		for (SampleDto customer : sampleDtoList) {
		        if (customer.getId() == id) {
		            return customer;
		        }
		    }
		return null;
	}

	
	
	@Override
	public EmployeeDto convertJsonToJavaDto() {
		/*
		 * { "name":"David", "position":"Software Engineer", "skilltree":[ "Java",
		 * "Python", "JavaScript" ], "address":{ "street":"Street", "streetNo":"123" } }
		 */
		EmployeeDto employeeData=null;
		String result=null;
	    try {
			result = new String(Files.readAllBytes(Paths.get("C://Shubham//Employee.json")));
		} catch (IOException e) {
			e.printStackTrace();
		}  
   
		//String json = "{ \"name\":\"David\", \"position\":\"SOFTWARE_ENGINEER\", \"skilltree\":[ \"Java\", \"Python\", \"JavaScript\" ], \"address\":{ \"street\":\"Street\", \"streetNo\":\"123\" } }";

		ObjectMapper objectMapper = new ObjectMapper();
		
		// Deserialization into the `EmployeeDto` class
		try {
			employeeData = objectMapper.readValue(result, EmployeeDto.class);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		System.out.println(employeeData);
		return employeeData;
	}

	
}
