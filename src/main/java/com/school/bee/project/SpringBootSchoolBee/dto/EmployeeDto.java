package com.school.bee.project.SpringBootSchoolBee.dto;

import java.util.List;


public class EmployeeDto {

	private String name;
    private String position;
    private List<String> skilltree;
    private AddressDto address;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public List<String> getSkilltree() {
		return skilltree;
	}
	public void setSkilltree(List<String> skilltree) {
		this.skilltree = skilltree;
	}
	public AddressDto getAddress() {
		return address;
	}
	public void setAddress(AddressDto address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "EmployeeDto [name=" + name + ", position=" + position + ", skilltree=" + skilltree + ", address="
				+ address + "]";
	}
	
    
    
    
}
