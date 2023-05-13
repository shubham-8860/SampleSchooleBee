package com.school.bee.project.SpringBootSchoolBee.dto;

public class AddressDto {
	
	private String street;
    private String streetNo;
    

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreetNo() {
		return streetNo;
	}

	public void setStreetNo(String streetNo) {
		this.streetNo = streetNo;
	}

	@Override
	public String toString() {
		return "AddressDto [street=" + street + ", streetNo=" + streetNo + "]";
	}
	

}
