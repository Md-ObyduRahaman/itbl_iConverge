package com.example.demo;

public class DPD_DF_report {
	
	private int LOC_MOD_ID;
	private String BILL_CYCLE_CODE;
	private String lOCATION_CODE;
	private String LOCATION_NAME;
	private String FROM_USER;
	private String FROM_USER_TYPE;
	private String TO_USER;
	private String TO_USER_TYPE;
	private String COMMENTS;
	private String RECEIVED_AT;
	public DPD_DF_report() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DPD_DF_report(int lOC_MOD_ID, String bILL_CYCLE_CODE, String lOCATION_CODE, String lOCATION_NAME,
			String fROM_USER, String fROM_USER_TYPE, String tO_USER, String tO_USER_TYPE, String cOMMENTS,
			String rECEIVED_AT) {
		super();
		LOC_MOD_ID = lOC_MOD_ID;
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
		this.lOCATION_CODE = lOCATION_CODE;
		LOCATION_NAME = lOCATION_NAME;
		FROM_USER = fROM_USER;
		FROM_USER_TYPE = fROM_USER_TYPE;
		TO_USER = tO_USER;
		TO_USER_TYPE = tO_USER_TYPE;
		COMMENTS = cOMMENTS;
		RECEIVED_AT = rECEIVED_AT;
	}
	public int getLOC_MOD_ID() {
		return LOC_MOD_ID;
	}
	public void setLOC_MOD_ID(int lOC_MOD_ID) {
		LOC_MOD_ID = lOC_MOD_ID;
	}
	public String getBILL_CYCLE_CODE() {
		return BILL_CYCLE_CODE;
	}
	public void setBILL_CYCLE_CODE(String bILL_CYCLE_CODE) {
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
	}
	public String getlOCATION_CODE() {
		return lOCATION_CODE;
	}
	public void setlOCATION_CODE(String lOCATION_CODE) {
		this.lOCATION_CODE = lOCATION_CODE;
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
	@Override
	public String toString() {
		return "DPD_DF_report [LOC_MOD_ID=" + LOC_MOD_ID + ", BILL_CYCLE_CODE=" + BILL_CYCLE_CODE + ", lOCATION_CODE="
				+ lOCATION_CODE + ", LOCATION_NAME=" + LOCATION_NAME + ", FROM_USER=" + FROM_USER + ", FROM_USER_TYPE="
				+ FROM_USER_TYPE + ", TO_USER=" + TO_USER + ", TO_USER_TYPE=" + TO_USER_TYPE + ", COMMENTS=" + COMMENTS
				+ ", RECEIVED_AT=" + RECEIVED_AT + "]";
	}

}
