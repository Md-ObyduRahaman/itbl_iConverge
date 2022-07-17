package com.example.demo;

public class IC_VOLT_CAT_MST {
 
	private String VOLT_CAT_CODE;
	private String VOLT_CAT_NAME;
	@Override
	public String toString() {
		return "IC_VOLT_CAT_MST [VOLT_CAT_CODE=" + VOLT_CAT_CODE + ", VOLT_CAT_NAME=" + VOLT_CAT_NAME + "]";
	}
	public String getVOLT_CAT_CODE() {
		return VOLT_CAT_CODE;
	}
	public void setVOLT_CAT_CODE(String vOLT_CAT_CODE) {
		VOLT_CAT_CODE = vOLT_CAT_CODE;
	}
	public String getVOLT_CAT_NAME() {
		return VOLT_CAT_NAME;
	}
	public void setVOLT_CAT_NAME(String vOLT_CAT_NAME) {
		VOLT_CAT_NAME = vOLT_CAT_NAME;
	}
	public IC_VOLT_CAT_MST(String vOLT_CAT_CODE, String vOLT_CAT_NAME) {
		super();
		VOLT_CAT_CODE = vOLT_CAT_CODE;
		VOLT_CAT_NAME = vOLT_CAT_NAME;
	}
	public IC_VOLT_CAT_MST() {
		super();
		// TODO Auto-generated constructor stub
	}
}
