package com.school.bee.project.SpringBootSchoolBee.dto;

public class SampleDto {
    int id;
	String fName;
	String lName;
	String address;
	int age;
	
	public SampleDto(int id, String fName, String lName, String address, int age) {
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.address = address;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
