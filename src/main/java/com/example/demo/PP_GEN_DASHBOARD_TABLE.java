package com.example.demo;

public class PP_GEN_DASHBOARD_TABLE
{
	String BILL_CYCLE_CODE,PP_UNIT_NAME, ENRG_GEN,  UPDATE_DATE;

	public String getBILL_CYCLE_CODE() {
		return BILL_CYCLE_CODE;
	}

	public void setBILL_CYCLE_CODE(String bILL_CYCLE_CODE) {
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
	}

	public String getPP_UNIT_NAME() {
		return PP_UNIT_NAME;
	}

	public void setPP_UNIT_NAME(String pP_UNIT_NAME) {
		PP_UNIT_NAME = pP_UNIT_NAME;
	}

	public String getENRG_GEN() {
		return ENRG_GEN;
	}

	public void setENRG_GEN(String eNRG_GEN) {
		ENRG_GEN = eNRG_GEN;
	}

	public String getUPDATE_DATE() {
		return UPDATE_DATE;
	}

	public void setUPDATE_DATE(String uPDATE_DATE) {
		UPDATE_DATE = uPDATE_DATE;
	}

	@Override
	public String toString() {
		return "PP_GEN_DASHBOARD_TABLE [BILL_CYCLE_CODE=" + BILL_CYCLE_CODE + ", PP_UNIT_NAME=" + PP_UNIT_NAME
				+ ", ENRG_GEN=" + ENRG_GEN + ", UPDATE_DATE=" + UPDATE_DATE + "]";
	}

	public PP_GEN_DASHBOARD_TABLE(String bILL_CYCLE_CODE, String pP_UNIT_NAME, String eNRG_GEN, String uPDATE_DATE) {
		super();
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
		PP_UNIT_NAME = pP_UNIT_NAME;
		ENRG_GEN = eNRG_GEN;
		UPDATE_DATE = uPDATE_DATE;
	}

	public PP_GEN_DASHBOARD_TABLE() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
