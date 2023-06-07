package com.automobile.honda;

import com.automobile.Vehicle;

public class Honda extends Vehicle{
	
	private String modelNumber;
	private String registrationNumber;
	private String ownerName;
	
	@Override
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	@Override
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	@Override
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	

	public void getSpeed() {
		System.out.println("Speed of the Honda is 10kmph");
	}
	public void cdPlayer() {
		System.out.println("Controlling CD player");
	}
	public Honda(String modelNumber, String registrationNumber, String ownerName) {
		this.modelNumber = modelNumber;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
	}
	
	

}
