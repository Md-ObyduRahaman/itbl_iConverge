package com.example.demo;

public class IC_RAO_LOC_MISC_COLL 
{
	String BILL_CYCLE_CODE, LOCATION_CODE,LOCATION_NAME, MSC_TYPE_CODE,MSC_BILL_TYPE_NAME, SYS_COLL, RAO_COLL, STATUS, UPDATE_BY, RAO_LOC_MISC_ID;

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

	public String getMSC_TYPE_CODE() {
		return MSC_TYPE_CODE;
	}

	public void setMSC_TYPE_CODE(String mSC_TYPE_CODE) {
		MSC_TYPE_CODE = mSC_TYPE_CODE;
	}

	public String getMSC_BILL_TYPE_NAME() {
		return MSC_BILL_TYPE_NAME;
	}

	public void setMSC_BILL_TYPE_NAME(String mSC_BILL_TYPE_NAME) {
		MSC_BILL_TYPE_NAME = mSC_BILL_TYPE_NAME;
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

	public String getUPDATE_BY() {
		return UPDATE_BY;
	}

	public void setUPDATE_BY(String uPDATE_BY) {
		UPDATE_BY = uPDATE_BY;
	}

	public String getRAO_LOC_MISC_ID() {
		return RAO_LOC_MISC_ID;
	}

	public void setRAO_LOC_MISC_ID(String rAO_LOC_MISC_ID) {
		RAO_LOC_MISC_ID = rAO_LOC_MISC_ID;
	}

	public IC_RAO_LOC_MISC_COLL(String bILL_CYCLE_CODE, String lOCATION_CODE, String lOCATION_NAME,
			String mSC_TYPE_CODE, String mSC_BILL_TYPE_NAME, String sYS_COLL, String rAO_COLL, String sTATUS,
			String uPDATE_BY, String rAO_LOC_MISC_ID) {
		super();
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
		LOCATION_CODE = lOCATION_CODE;
		LOCATION_NAME = lOCATION_NAME;
		MSC_TYPE_CODE = mSC_TYPE_CODE;
		MSC_BILL_TYPE_NAME = mSC_BILL_TYPE_NAME;
		SYS_COLL = sYS_COLL;
		RAO_COLL = rAO_COLL;
		STATUS = sTATUS;
		UPDATE_BY = uPDATE_BY;
		RAO_LOC_MISC_ID = rAO_LOC_MISC_ID;
	}

	public IC_RAO_LOC_MISC_COLL() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "IC_RAO_LOC_MISC_COLL [BILL_CYCLE_CODE=" + BILL_CYCLE_CODE + ", LOCATION_CODE=" + LOCATION_CODE
				+ ", LOCATION_NAME=" + LOCATION_NAME + ", MSC_TYPE_CODE=" + MSC_TYPE_CODE + ", MSC_BILL_TYPE_NAME="
				+ MSC_BILL_TYPE_NAME + ", SYS_COLL=" + SYS_COLL + ", RAO_COLL=" + RAO_COLL + ", STATUS=" + STATUS
				+ ", UPDATE_BY=" + UPDATE_BY + ", RAO_LOC_MISC_ID=" + RAO_LOC_MISC_ID + "]";
	}

	

	
	
	
}
