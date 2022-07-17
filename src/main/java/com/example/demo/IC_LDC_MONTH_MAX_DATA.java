package com.example.demo;

import org.springframework.format.annotation.DateTimeFormat;

public class IC_LDC_MONTH_MAX_DATA {
	
	private String BILL_CYCLE_CODE;
	private String LDC_CODE;
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private String LDC_DATE;
	private double LDC;
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private String UPTO_DATE;
	private int UPTO_LDC;
	private String STATUS;
	private int LDC_ID;
	public IC_LDC_MONTH_MAX_DATA() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_LDC_MONTH_MAX_DATA(String bILL_CYCLE_CODE, String lDC_CODE, String lDC_DATE, double lDC, String uPTO_DATE,
			int uPTO_LDC, String sTATUS, int lDC_ID) {
		super();
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
		LDC_CODE = lDC_CODE;
		LDC_DATE = lDC_DATE;
		LDC = lDC;
		UPTO_DATE = uPTO_DATE;
		UPTO_LDC = uPTO_LDC;
		STATUS = sTATUS;
		LDC_ID = lDC_ID;
	}
	public String getBILL_CYCLE_CODE() {
		return BILL_CYCLE_CODE;
	}
	public void setBILL_CYCLE_CODE(String bILL_CYCLE_CODE) {
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
	}
	public String getLDC_CODE() {
		return LDC_CODE;
	}
	public void setLDC_CODE(String lDC_CODE) {
		LDC_CODE = lDC_CODE;
	}
	public String getLDC_DATE() {
		return LDC_DATE;
	}
	public void setLDC_DATE(String lDC_DATE) {
		LDC_DATE = lDC_DATE;
	}
	public double getLDC() {
		return LDC;
	}
	public void setLDC(double lDC) {
		LDC = lDC;
	}
	public String getUPTO_DATE() {
		return UPTO_DATE;
	}
	public void setUPTO_DATE(String uPTO_DATE) {
		UPTO_DATE = uPTO_DATE;
	}
	public int getUPTO_LDC() {
		return UPTO_LDC;
	}
	public void setUPTO_LDC(int uPTO_LDC) {
		UPTO_LDC = uPTO_LDC;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public int getLDC_ID() {
		return LDC_ID;
	}
	public void setLDC_ID(int lDC_ID) {
		LDC_ID = lDC_ID;
	}
	@Override
	public String toString() {
		return "IC_LDC_MONTH_MAX_DATA [BILL_CYCLE_CODE=" + BILL_CYCLE_CODE + ", LDC_CODE=" + LDC_CODE + ", LDC_DATE="
				+ LDC_DATE + ", LDC=" + LDC + ", UPTO_DATE=" + UPTO_DATE + ", UPTO_LDC=" + UPTO_LDC + ", STATUS="
				+ STATUS + ", LDC_ID=" + LDC_ID + "]";
	}
	
	
}
