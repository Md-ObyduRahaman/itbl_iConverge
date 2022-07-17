package com.example.demo.mobile;

public class Location {
	private String locationCode,locationName;

	public Location(String locationCode, String locationName) {
		super();
		this.locationCode = locationCode;
		this.locationName = locationName;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	
	

}
