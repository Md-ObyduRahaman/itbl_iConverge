package com.example.demo.model;

public class IC_CIRCLE_MST_Dropdown
{
	String CIRCLE_CODE, CIRCLE_DESC;

	public String getCIRCLE_CODE() {
		return CIRCLE_CODE;
	}

	public void setCIRCLE_CODE(String cIRCLE_CODE) {
		CIRCLE_CODE = cIRCLE_CODE;
	}

	public String getCIRCLE_DESC() {
		return CIRCLE_DESC;
	}

	public void setCIRCLE_DESC(String cIRCLE_DESC) {
		CIRCLE_DESC = cIRCLE_DESC;
	}

	public IC_CIRCLE_MST_Dropdown(String cIRCLE_CODE, String cIRCLE_DESC) {
		super();
		CIRCLE_CODE = cIRCLE_CODE;
		CIRCLE_DESC = cIRCLE_DESC;
	}

	public IC_CIRCLE_MST_Dropdown() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "IC_CIRCLE_MST_Dropdown [CIRCLE_CODE=" + CIRCLE_CODE + ", CIRCLE_DESC=" + CIRCLE_DESC + "]";
	}
	
	
}
