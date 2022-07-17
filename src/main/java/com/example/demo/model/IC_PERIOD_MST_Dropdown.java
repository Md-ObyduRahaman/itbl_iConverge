package com.example.demo.model;

public class IC_PERIOD_MST_Dropdown
{
	String PERIOD_CODE, PERIOD_DESC;

	public String getPERIOD_CODE() {
		return PERIOD_CODE;
	}

	public void setPERIOD_CODE(String pERIOD_CODE) {
		PERIOD_CODE = pERIOD_CODE;
	}

	public String getPERIOD_DESC() {
		return PERIOD_DESC;
	}

	public void setPERIOD_DESC(String pERIOD_DESC) {
		PERIOD_DESC = pERIOD_DESC;
	}

	public IC_PERIOD_MST_Dropdown(String pERIOD_CODE, String pERIOD_DESC) {
		super();
		PERIOD_CODE = pERIOD_CODE;
		PERIOD_DESC = pERIOD_DESC;
	}

	public IC_PERIOD_MST_Dropdown() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "IC_PERIOD_MST_Dropdown [PERIOD_CODE=" + PERIOD_CODE + ", PERIOD_DESC=" + PERIOD_DESC + "]";
	}
	
	
}
