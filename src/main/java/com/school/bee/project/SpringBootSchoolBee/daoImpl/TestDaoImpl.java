package com.school.bee.project.SpringBootSchoolBee.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.school.bee.project.SpringBootSchoolBee.dao.TestDao;
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

	
}
