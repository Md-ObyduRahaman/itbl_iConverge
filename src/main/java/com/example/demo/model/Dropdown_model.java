package com.example.demo.model;

public class Dropdown_model
{
	String PERIOD_CODE;
	String ZONE_CODE;
	String CIRCLE_CODE;
	
	public String getPERIOD_CODE() {
		return PERIOD_CODE;
	}
	public void setPERIOD_CODE(String pERIOD_CODE) {
		PERIOD_CODE = pERIOD_CODE;
	}
	public String getZONE_CODE() {
		return ZONE_CODE;
	}
	public void setZONE_CODE(String zONE_CODE) {
		ZONE_CODE = zONE_CODE;
	}
	public String getCIRCLE_CODE() {
		return CIRCLE_CODE;
	}
	public void setCIRCLE_CODE(String cIRCLE_CODE) {
		CIRCLE_CODE = cIRCLE_CODE;
	}
	
	public Dropdown_model(String pERIOD_CODE, String zONE_CODE, String cIRCLE_CODE) {
		super();
		PERIOD_CODE = pERIOD_CODE;
		ZONE_CODE = zONE_CODE;
		CIRCLE_CODE = cIRCLE_CODE;
		
	}
	public Dropdown_model() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Dropdown_model [PERIOD_CODE=" + PERIOD_CODE + ", ZONE_CODE=" + ZONE_CODE + ", CIRCLE_CODE="
				+ CIRCLE_CODE + "]";
	}
	
	
}
