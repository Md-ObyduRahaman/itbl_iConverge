package com.example.demo;

import org.springframework.format.annotation.DateTimeFormat;

public class IC_PP_UNIT_DTL {

	private String PP_UNIT_CODE;
	private String PP_UNIT_NAME;
	private double INSTALLED_CAPACITY;
	private double MAX_CAPACITY;
	private String FUEL_CODE;
	private String FUEL_NAME;
	private String COMM_DATE;
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private String PP_CODE;
	private String PP_NAME;
	private String STATUS;
	private String VOLT_CAT_CODE;
	private String VOLT_CAT_NAME;
	private String SL_NO;
	private int PP_UNIT_ID;
	public IC_PP_UNIT_DTL() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_PP_UNIT_DTL(String pP_UNIT_CODE, String pP_UNIT_NAME, double iNSTALLED_CAPACITY, double mAX_CAPACITY,
			String fUEL_CODE, String fUEL_NAME, String cOMM_DATE, String pP_CODE, String pP_NAME, String sTATUS,
			String vOLT_CAT_CODE, String vOLT_CAT_NAME, String sL_NO, int pP_UNIT_ID) {
		super();
		PP_UNIT_CODE = pP_UNIT_CODE;
		PP_UNIT_NAME = pP_UNIT_NAME;
		INSTALLED_CAPACITY = iNSTALLED_CAPACITY;
		MAX_CAPACITY = mAX_CAPACITY;
		FUEL_CODE = fUEL_CODE;
		FUEL_NAME = fUEL_NAME;
		COMM_DATE = cOMM_DATE;
		PP_CODE = pP_CODE;
		PP_NAME = pP_NAME;
		STATUS = sTATUS;
		VOLT_CAT_CODE = vOLT_CAT_CODE;
		VOLT_CAT_NAME = vOLT_CAT_NAME;
		SL_NO = sL_NO;
		PP_UNIT_ID = pP_UNIT_ID;
	}
	public String getPP_UNIT_CODE() {
		return PP_UNIT_CODE;
	}
	public void setPP_UNIT_CODE(String pP_UNIT_CODE) {
		PP_UNIT_CODE = pP_UNIT_CODE;
	}
	public String getPP_UNIT_NAME() {
		return PP_UNIT_NAME;
	}
	public void setPP_UNIT_NAME(String pP_UNIT_NAME) {
		PP_UNIT_NAME = pP_UNIT_NAME;
	}
	public double getINSTALLED_CAPACITY() {
		return INSTALLED_CAPACITY;
	}
	public void setINSTALLED_CAPACITY(double iNSTALLED_CAPACITY) {
		INSTALLED_CAPACITY = iNSTALLED_CAPACITY;
	}
	public double getMAX_CAPACITY() {
		return MAX_CAPACITY;
	}
	public void setMAX_CAPACITY(double mAX_CAPACITY) {
		MAX_CAPACITY = mAX_CAPACITY;
	}
	public String getFUEL_CODE() {
		return FUEL_CODE;
	}
	public void setFUEL_CODE(String fUEL_CODE) {
		FUEL_CODE = fUEL_CODE;
	}
	public String getFUEL_NAME() {
		return FUEL_NAME;
	}
	public void setFUEL_NAME(String fUEL_NAME) {
		FUEL_NAME = fUEL_NAME;
	}
	public String getCOMM_DATE() {
		return COMM_DATE;
	}
	public void setCOMM_DATE(String cOMM_DATE) {
		COMM_DATE = cOMM_DATE;
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
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
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
	public String getSL_NO() {
		return SL_NO;
	}
	public void setSL_NO(String sL_NO) {
		SL_NO = sL_NO;
	}
	public int getPP_UNIT_ID() {
		return PP_UNIT_ID;
	}
	public void setPP_UNIT_ID(int pP_UNIT_ID) {
		PP_UNIT_ID = pP_UNIT_ID;
	}
	@Override
	public String toString() {
		return "IC_PP_UNIT_DTL [PP_UNIT_CODE=" + PP_UNIT_CODE + ", PP_UNIT_NAME=" + PP_UNIT_NAME
				+ ", INSTALLED_CAPACITY=" + INSTALLED_CAPACITY + ", MAX_CAPACITY=" + MAX_CAPACITY + ", FUEL_CODE="
				+ FUEL_CODE + ", FUEL_NAME=" + FUEL_NAME + ", COMM_DATE=" + COMM_DATE + ", PP_CODE=" + PP_CODE
				+ ", PP_NAME=" + PP_NAME + ", STATUS=" + STATUS + ", VOLT_CAT_CODE=" + VOLT_CAT_CODE
				+ ", VOLT_CAT_NAME=" + VOLT_CAT_NAME + ", SL_NO=" + SL_NO + ", PP_UNIT_ID=" + PP_UNIT_ID + "]";
	}

}
