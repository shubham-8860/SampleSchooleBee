package com.school.bee.project.SpringBootSchoolBee.service;

import java.util.List;

import com.school.bee.project.SpringBootSchoolBee.dto.SampleDto;

public interface TestService {
	List<SampleDto> getTestData();

	SampleDto getTestDataById(int id);
}
