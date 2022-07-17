package com.example.demo;

public class MIS_FORM 
{
	String zone, circle, loc, month;

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getCircle() {
		return circle;
	}

	public void setCircle(String circle) {
		this.circle = circle;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	@Override
	public String toString() {
		return "MIS_FORM [zone=" + zone + ", circle=" + circle + ", loc=" + loc + ", month=" + month + "]";
	}

	public MIS_FORM(String zone, String circle, String loc, String month) {
		super();
		this.zone = zone;
		this.circle = circle;
		this.loc = loc;
		this.month = month;
	}

	public MIS_FORM() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
