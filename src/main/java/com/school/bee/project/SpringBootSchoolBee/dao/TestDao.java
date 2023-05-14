package com.school.bee.project.SpringBootSchoolBee.dao;

import java.util.List;

import com.school.bee.project.SpringBootSchoolBee.dto.EmployeeDto;
import com.school.bee.project.SpringBootSchoolBee.dto.SampleDto;

public interface TestDao {
	public List<SampleDto> getTestData();

	public SampleDto getTestDataById(int id);

	public EmployeeDto convertJsonToJavaDto();
}
