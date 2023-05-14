package com.school.bee.project.SpringBootSchoolBee.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.school.bee.project.SpringBootSchoolBee.dao.TestDao;
import com.school.bee.project.SpringBootSchoolBee.dto.EmployeeDto;
import com.school.bee.project.SpringBootSchoolBee.dto.SampleDto;
import com.school.bee.project.SpringBootSchoolBee.service.TestService;

@Service
public class TestServiceImpl implements TestService{
	
	@Autowired
	TestDao testDao;	

	@Override
	public List<SampleDto> getTestData() {
		return testDao.getTestData();
	}

	@Override
	public SampleDto getTestDataById(int id) {
		return testDao.getTestDataById(id);
	}

	@Override
	public EmployeeDto convertJsonToJavaDto() {
		
		return testDao.convertJsonToJavaDto();
	}

}
