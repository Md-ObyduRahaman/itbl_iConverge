package com.example.demo;

public class MOD_REPORT {
	
	private String ZONE_CODE;
	private String ZONE_NAME;
	private String CIRCLE_CODE;
	private String CIRCLE_NAME;
	private String DIV_CODE;
	private String DIV_NAME;
	private String LOCATION_CODE;
	private String BILL_CYCLE_CODE;
	@Override
	public String toString() {
		return "MOD_REPORT [ZONE_CODE=" + ZONE_CODE + ", ZONE_NAME=" + ZONE_NAME + ", CIRCLE_CODE=" + CIRCLE_CODE
				+ ", CIRCLE_NAME=" + CIRCLE_NAME + ", DIV_CODE=" + DIV_CODE + ", DIV_NAME=" + DIV_NAME
				+ ", LOCATION_CODE=" + LOCATION_CODE + ", BILL_CYCLE_CODE=" + BILL_CYCLE_CODE + "]";
	}
	public String getZONE_CODE() {
		return ZONE_CODE;
	}
	public void setZONE_CODE(String zONE_CODE) {
		ZONE_CODE = zONE_CODE;
	}
	public String getZONE_NAME() {
		return ZONE_NAME;
	}
	public void setZONE_NAME(String zONE_NAME) {
		ZONE_NAME = zONE_NAME;
	}
	public String getCIRCLE_CODE() {
		return CIRCLE_CODE;
	}
	public void setCIRCLE_CODE(String cIRCLE_CODE) {
		CIRCLE_CODE = cIRCLE_CODE;
	}
	public String getCIRCLE_NAME() {
		return CIRCLE_NAME;
	}
	public void setCIRCLE_NAME(String cIRCLE_NAME) {
		CIRCLE_NAME = cIRCLE_NAME;
	}
	public String getDIV_CODE() {
		return DIV_CODE;
	}
	public void setDIV_CODE(String dIV_CODE) {
		DIV_CODE = dIV_CODE;
	}
	public String getDIV_NAME() {
		return DIV_NAME;
	}
	public void setDIV_NAME(String dIV_NAME) {
		DIV_NAME = dIV_NAME;
	}
	public String getLOCATION_CODE() {
		return LOCATION_CODE;
	}
	public void setLOCATION_CODE(String lOCATION_CODE) {
		LOCATION_CODE = lOCATION_CODE;
	}
	public String getBILL_CYCLE_CODE() {
		return BILL_CYCLE_CODE;
	}
	public void setBILL_CYCLE_CODE(String bILL_CYCLE_CODE) {
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
	}
	public MOD_REPORT(String zONE_CODE, String zONE_NAME, String cIRCLE_CODE, String cIRCLE_NAME, String dIV_CODE,
			String dIV_NAME, String lOCATION_CODE, String bILL_CYCLE_CODE) {
		super();
		ZONE_CODE = zONE_CODE;
		ZONE_NAME = zONE_NAME;
		CIRCLE_CODE = cIRCLE_CODE;
		CIRCLE_NAME = cIRCLE_NAME;
		DIV_CODE = dIV_CODE;
		DIV_NAME = dIV_NAME;
		LOCATION_CODE = lOCATION_CODE;
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
	}
	public MOD_REPORT() {
		super();
		// TODO Auto-generated constructor stub
	}

}
