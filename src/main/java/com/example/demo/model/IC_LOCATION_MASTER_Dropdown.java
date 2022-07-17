package com.example.demo.model;

public class IC_LOCATION_MASTER_Dropdown
{
	String LOCATION_CODE, LOCATION_NAME;
	public String CIRCLE_CODE;

	public String getLOCATION_CODE() {
		return LOCATION_CODE;
	}

	public void setLOCATION_CODE(String lOCATION_CODE) {
		LOCATION_CODE = lOCATION_CODE;
	}

	public String getLOCATION_NAME() {
		return LOCATION_NAME;
	}

	public void setLOCATION_NAME(String lOCATION_NAME) {
		LOCATION_NAME = lOCATION_NAME;
	}
	
	

	public String getCIRCLE_CODE() {
		return CIRCLE_CODE;
	}

	public void setCIRCLE_CODE(String cIRCLE_CODE) {
		CIRCLE_CODE = cIRCLE_CODE;
	}

	public IC_LOCATION_MASTER_Dropdown(String lOCATION_CODE, String lOCATION_NAME, String cIRCLE_CODE) {
		super();
		LOCATION_CODE = lOCATION_CODE;
		LOCATION_NAME = lOCATION_NAME;
		CIRCLE_CODE = cIRCLE_CODE;
	}

	public IC_LOCATION_MASTER_Dropdown() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "IC_LOCATION_MASTER_Dropdown [LOCATION_CODE=" + LOCATION_CODE + ", LOCATION_NAME=" + LOCATION_NAME
				+ ", CIRCLE_CODE=" + CIRCLE_CODE + "]";
	}

	
	
}
