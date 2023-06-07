package com.automobile.TwoWheeler;

import com.automobile.Vehicle;

public class TwoWheeler extends Vehicle{
	
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
		System.out.println("Speed of the Two Wheeler is 60kmph");
	}
	public void radio() {
		System.out.println("Controlling radio");
	}
	public TwoWheeler(String modelNumber, String registrationNumber, String ownerName) {
		this.modelNumber = modelNumber;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
	}
	

}
