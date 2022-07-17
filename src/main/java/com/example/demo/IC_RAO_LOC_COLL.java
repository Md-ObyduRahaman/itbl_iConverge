package com.example.demo;

public class IC_RAO_LOC_COLL {
	
	private String RAO_CODE;
	private String RAO_NAME;
	private String BILL_CYCLE_CODE;
	private String LOCATION_CODE;
	private String LOCATION_NAME;
	private String SYS_COLL;
	private String RAO_COLL;
	private String SYS_VAT_COLL;
	private String RAO_VAT_COLL;
	private String STATUS;
	private int RLC_ID;
	public String getRAO_CODE() {
		return RAO_CODE;
	}
	public void setRAO_CODE(String rAO_CODE) {
		RAO_CODE = rAO_CODE;
	}
	public String getRAO_NAME() {
		return RAO_NAME;
	}
	public void setRAO_NAME(String rAO_NAME) {
		RAO_NAME = rAO_NAME;
	}
	public String getBILL_CYCLE_CODE() {
		return BILL_CYCLE_CODE;
	}
	public void setBILL_CYCLE_CODE(String bILL_CYCLE_CODE) {
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
	}
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
	public String getSYS_COLL() {
		return SYS_COLL;
	}
	public void setSYS_COLL(String sYS_COLL) {
		SYS_COLL = sYS_COLL;
	}
	public String getRAO_COLL() {
		return RAO_COLL;
	}
	public void setRAO_COLL(String rAO_COLL) {
		RAO_COLL = rAO_COLL;
	}
	public String getSYS_VAT_COLL() {
		return SYS_VAT_COLL;
	}
	public void setSYS_VAT_COLL(String sYS_VAT_COLL) {
		SYS_VAT_COLL = sYS_VAT_COLL;
	}
	public String getRAO_VAT_COLL() {
		return RAO_VAT_COLL;
	}
	public void setRAO_VAT_COLL(String rAO_VAT_COLL) {
		RAO_VAT_COLL = rAO_VAT_COLL;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public int getRLC_ID() {
		return RLC_ID;
	}
	public void setRLC_ID(int rLC_ID) {
		RLC_ID = rLC_ID;
	}
	@Override
	public String toString() {
		return "IC_RAO_LOC_COLL [RAO_CODE=" + RAO_CODE + ", RAO_NAME=" + RAO_NAME + ", BILL_CYCLE_CODE="
				+ BILL_CYCLE_CODE + ", LOCATION_CODE=" + LOCATION_CODE + ", LOCATION_NAME=" + LOCATION_NAME
				+ ", SYS_COLL=" + SYS_COLL + ", RAO_COLL=" + RAO_COLL + ", SYS_VAT_COLL=" + SYS_VAT_COLL
				+ ", RAO_VAT_COLL=" + RAO_VAT_COLL + ", STATUS=" + STATUS + ", RLC_ID=" + RLC_ID + "]";
	}
	public IC_RAO_LOC_COLL(String rAO_CODE, String rAO_NAME, String bILL_CYCLE_CODE, String lOCATION_CODE,
			String lOCATION_NAME, String sYS_COLL, String rAO_COLL, String sYS_VAT_COLL, String rAO_VAT_COLL,
			String sTATUS, int rLC_ID) {
		super();
		RAO_CODE = rAO_CODE;
		RAO_NAME = rAO_NAME;
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
		LOCATION_CODE = lOCATION_CODE;
		LOCATION_NAME = lOCATION_NAME;
		SYS_COLL = sYS_COLL;
		RAO_COLL = rAO_COLL;
		SYS_VAT_COLL = sYS_VAT_COLL;
		RAO_VAT_COLL = rAO_VAT_COLL;
		STATUS = sTATUS;
		RLC_ID = rLC_ID;
	}
	public IC_RAO_LOC_COLL() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
