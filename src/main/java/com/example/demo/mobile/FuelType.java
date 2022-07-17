package com.example.demo.mobile;

public class FuelType {
	private String fuelCode, fuelType;

	public FuelType(String fuelCode, String fuelType) {
		super();
		this.fuelCode = fuelCode;
		this.fuelType = fuelType;
	}

	public String getFuelCode() {
		return fuelCode;
	}

	public void setFuelCode(String fuelCode) {
		this.fuelCode = fuelCode;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	
	

}
