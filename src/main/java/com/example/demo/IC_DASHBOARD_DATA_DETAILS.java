package com.example.demo;

public class IC_DASHBOARD_DATA_DETAILS 
{
	String LOC_MOD_DF_ID, BILL_CYCLE_CODE, LOCATION_CODE, LOCATION_NAME, FROM_USER, FROM_USER_TYPE, TO_USER,
			TO_USER_TYPE, COMMENTS, RECEIVED_AT, SEND_AT, STAY_TIME;

	public String getLOC_MOD_DF_ID() {
		return LOC_MOD_DF_ID;
	}

	public void setLOC_MOD_DF_ID(String lOC_MOD_DF_ID) {
		LOC_MOD_DF_ID = lOC_MOD_DF_ID;
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

	public String getFROM_USER() {
		return FROM_USER;
	}

	public void setFROM_USER(String fROM_USER) {
		FROM_USER = fROM_USER;
	}

	public String getFROM_USER_TYPE() {
		return FROM_USER_TYPE;
	}

	public void setFROM_USER_TYPE(String fROM_USER_TYPE) {
		FROM_USER_TYPE = fROM_USER_TYPE;
	}

	public String getTO_USER() {
		return TO_USER;
	}

	public void setTO_USER(String tO_USER) {
		TO_USER = tO_USER;
	}

	public String getTO_USER_TYPE() {
		return TO_USER_TYPE;
	}

	public void setTO_USER_TYPE(String tO_USER_TYPE) {
		TO_USER_TYPE = tO_USER_TYPE;
	}

	public String getCOMMENTS() {
		return COMMENTS;
	}

	public void setCOMMENTS(String cOMMENTS) {
		COMMENTS = cOMMENTS;
	}

	public String getRECEIVED_AT() {
		return RECEIVED_AT;
	}

	public void setRECEIVED_AT(String rECEIVED_AT) {
		RECEIVED_AT = rECEIVED_AT;
	}

	public String getSEND_AT() {
		return SEND_AT;
	}

	public void setSEND_AT(String sEND_AT) {
		SEND_AT = sEND_AT;
	}

	public String getSTAY_TIME() {
		return STAY_TIME;
	}

	public void setSTAY_TIME(String sTAY_TIME) {
		STAY_TIME = sTAY_TIME;
	}

	public IC_DASHBOARD_DATA_DETAILS(String lOC_MOD_DF_ID, String bILL_CYCLE_CODE, String lOCATION_CODE,
			String lOCATION_NAME, String fROM_USER, String fROM_USER_TYPE, String tO_USER, String tO_USER_TYPE,
			String cOMMENTS, String rECEIVED_AT, String sEND_AT, String sTAY_TIME) {
		super();
		LOC_MOD_DF_ID = lOC_MOD_DF_ID;
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
		LOCATION_CODE = lOCATION_CODE;
		LOCATION_NAME = lOCATION_NAME;
		FROM_USER = fROM_USER;
		FROM_USER_TYPE = fROM_USER_TYPE;
		TO_USER = tO_USER;
		TO_USER_TYPE = tO_USER_TYPE;
		COMMENTS = cOMMENTS;
		RECEIVED_AT = rECEIVED_AT;
		SEND_AT = sEND_AT;
		STAY_TIME = sTAY_TIME;
	}

	public IC_DASHBOARD_DATA_DETAILS() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "IC_DASHBOARD_DATA_DETAILS [LOC_MOD_DF_ID=" + LOC_MOD_DF_ID + ", BILL_CYCLE_CODE=" + BILL_CYCLE_CODE
				+ ", LOCATION_CODE=" + LOCATION_CODE + ", LOCATION_NAME=" + LOCATION_NAME + ", FROM_USER=" + FROM_USER
				+ ", FROM_USER_TYPE=" + FROM_USER_TYPE + ", TO_USER=" + TO_USER + ", TO_USER_TYPE=" + TO_USER_TYPE
				+ ", COMMENTS=" + COMMENTS + ", RECEIVED_AT=" + RECEIVED_AT + ", SEND_AT=" + SEND_AT + ", STAY_TIME="
				+ STAY_TIME + "]";
	}
	
	
	
}
