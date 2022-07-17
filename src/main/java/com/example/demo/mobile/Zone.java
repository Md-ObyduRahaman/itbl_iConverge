package com.example.demo.mobile;

public class Zone {
	private String zoneCode,ZoneName;
	
	

	public Zone(String zoneCode, String zoneName) {
		super();
		this.zoneCode = zoneCode;
		ZoneName = zoneName;
	}

	public String getZoneCode() {
		return zoneCode;
	}

	public void setZoneCode(String zoneCode) {
		this.zoneCode = zoneCode;
	}

	public String getZoneName() {
		return ZoneName;
	}

	public void setZoneName(String zoneName) {
		ZoneName = zoneName;
	}
	
	

}
