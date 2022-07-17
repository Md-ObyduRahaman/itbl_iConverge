package com.example.demo;

public class PP_GEN_DASHBOARD
{
	String PERIOD_CODE, PERIOD_DESC, PP_CODE, PP_NAME;

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
		return "PP_GEN_DASHBOARD [PERIOD_CODE=" + PERIOD_CODE + ", PERIOD_DESC=" + PERIOD_DESC + ", PP_CODE=" + PP_CODE
				+ ", PP_NAME=" + PP_NAME + "]";
	}

	public PP_GEN_DASHBOARD(String pERIOD_CODE, String pERIOD_DESC, String pP_CODE, String pP_NAME) {
		super();
		PERIOD_CODE = pERIOD_CODE;
		PERIOD_DESC = pERIOD_DESC;
		PP_CODE = pP_CODE;
		PP_NAME = pP_NAME;
	}
	
	
	public PP_GEN_DASHBOARD(String pERIOD_CODE, String pP_CODE) {
		super();
		PERIOD_CODE = pERIOD_CODE;
		PP_CODE = pP_CODE;
	}

	public PP_GEN_DASHBOARD() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
