package com.example.demo;

public class IC_POWER_PLANT {
	
	private String PP_CODE;
	private String PP_NAME;
	public IC_POWER_PLANT() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_POWER_PLANT(String pP_CODE, String pP_NAME) {
		super();
		PP_CODE = pP_CODE;
		PP_NAME = pP_NAME;
	}
	public String getPP_CODE() {
		return PP_CODE;
	}
	public void setPP_CODE(String pP_CODE) {
		PP_CODE = pP_CODE;
	}
	public String getPP_NAME() {
		return PP_NAME;
	}
	public void setPP_NAME(String pP_NAME) {
		PP_NAME = pP_NAME;
	}
	@Override
	public String toString() {
		return "IC_POWER_PLANT [PP_CODE=" + PP_CODE + ", PP_NAME=" + PP_NAME + "]";
	}
	
	

}
