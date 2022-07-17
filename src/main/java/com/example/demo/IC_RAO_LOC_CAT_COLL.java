package com.example.demo;

public class IC_RAO_LOC_CAT_COLL {
	
	private String BILL_CYCLE_CODE;
	private String LOCATION_CODE;
	private String LOCATION_NAME;
	private String USAGE_CAT_CODE;
	private String USAGE_CAT_NAME;
	private String SYS_COLL;
	private String RAO_COLL;
	private String STATUS;
	private int RAO_LOC_ID;
	@Override
	public String toString() {
		return "IC_RAO_LOC_CAT_COLL [BILL_CYCLE_CODE=" + BILL_CYCLE_CODE + ", LOCATION_CODE=" + LOCATION_CODE
				+ ", LOCATION_NAME=" + LOCATION_NAME + ", USAGE_CAT_CODE=" + USAGE_CAT_CODE + ", USAGE_CAT_NAME="
				+ USAGE_CAT_NAME + ", SYS_COLL=" + SYS_COLL + ", RAO_COLL=" + RAO_COLL + ", STATUS=" + STATUS
				+ ", RAO_LOC_ID=" + RAO_LOC_ID + "]";
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
	public String getUSAGE_CAT_CODE() {
		return USAGE_CAT_CODE;
	}
	public void setUSAGE_CAT_CODE(String uSAGE_CAT_CODE) {
		USAGE_CAT_CODE = uSAGE_CAT_CODE;
	}
	public String getUSAGE_CAT_NAME() {
		return USAGE_CAT_NAME;
	}
	public void setUSAGE_CAT_NAME(String uSAGE_CAT_NAME) {
		USAGE_CAT_NAME = uSAGE_CAT_NAME;
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
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public int getRAO_LOC_ID() {
		return RAO_LOC_ID;
	}
	public void setRAO_LOC_ID(int rAO_LOC_ID) {
		RAO_LOC_ID = rAO_LOC_ID;
	}
	public IC_RAO_LOC_CAT_COLL(String bILL_CYCLE_CODE, String lOCATION_CODE, String lOCATION_NAME,
			String uSAGE_CAT_CODE, String uSAGE_CAT_NAME, String sYS_COLL, String rAO_COLL, String sTATUS,
			int rAO_LOC_ID) {
		super();
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
		LOCATION_CODE = lOCATION_CODE;
		LOCATION_NAME = lOCATION_NAME;
		USAGE_CAT_CODE = uSAGE_CAT_CODE;
		USAGE_CAT_NAME = uSAGE_CAT_NAME;
		SYS_COLL = sYS_COLL;
		RAO_COLL = rAO_COLL;
		STATUS = sTATUS;
		RAO_LOC_ID = rAO_LOC_ID;
	}
	public IC_RAO_LOC_CAT_COLL() {
		super();
		// TODO Auto-generated constructor stub
	}

}

