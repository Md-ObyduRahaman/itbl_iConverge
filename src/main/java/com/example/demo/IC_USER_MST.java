package com.example.demo;

public class IC_USER_MST {
	
	private String USER_ID;
	private String NAME;
	private String USER_NAME;
	private String USER_PASSWORD;
	private String MOBILE;
	private String EMAIL;
	private String USER_TYPE;
	private String USER_TYPE_DESC;
	private String STATUS;
	private String GRP_CODE;
	private String GRP_NAME;
	public IC_USER_MST() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_USER_MST(String uSER_ID, String nAME, String uSER_NAME, String uSER_PASSWORD, String mOBILE, String eMAIL,
			String uSER_TYPE, String uSER_TYPE_DESC, String sTATUS, String gRP_CODE, String gRP_NAME) {
		super();
		USER_ID = uSER_ID;
		NAME = nAME;
		USER_NAME = uSER_NAME;
		USER_PASSWORD = uSER_PASSWORD;
		MOBILE = mOBILE;
		EMAIL = eMAIL;
		USER_TYPE = uSER_TYPE;
		USER_TYPE_DESC = uSER_TYPE_DESC;
		STATUS = sTATUS;
		GRP_CODE = gRP_CODE;
		GRP_NAME = gRP_NAME;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String uSER_ID) {
		USER_ID = uSER_ID;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
	public String getUSER_PASSWORD() {
		return USER_PASSWORD;
	}
	public void setUSER_PASSWORD(String uSER_PASSWORD) {
		USER_PASSWORD = uSER_PASSWORD;
	}
	public String getMOBILE() {
		return MOBILE;
	}
	public void setMOBILE(String mOBILE) {
		MOBILE = mOBILE;
	}
	public String getEMAIL() {
		return EMAIL;
	}
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	public String getUSER_TYPE() {
		return USER_TYPE;
	}
	public void setUSER_TYPE(String uSER_TYPE) {
		USER_TYPE = uSER_TYPE;
	}
	public String getUSER_TYPE_DESC() {
		return USER_TYPE_DESC;
	}
	public void setUSER_TYPE_DESC(String uSER_TYPE_DESC) {
		USER_TYPE_DESC = uSER_TYPE_DESC;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getGRP_CODE() {
		return GRP_CODE;
	}
	public void setGRP_CODE(String gRP_CODE) {
		GRP_CODE = gRP_CODE;
	}
	public String getGRP_NAME() {
		return GRP_NAME;
	}
	public void setGRP_NAME(String gRP_NAME) {
		GRP_NAME = gRP_NAME;
	}
	@Override
	public String toString() {
		return "IC_USER_MST [USER_ID=" + USER_ID + ", NAME=" + NAME + ", USER_NAME=" + USER_NAME + ", USER_PASSWORD="
				+ USER_PASSWORD + ", MOBILE=" + MOBILE + ", EMAIL=" + EMAIL + ", USER_TYPE=" + USER_TYPE
				+ ", USER_TYPE_DESC=" + USER_TYPE_DESC + ", STATUS=" + STATUS + ", GRP_CODE=" + GRP_CODE + ", GRP_NAME="
				+ GRP_NAME + "]";
	}
	
}
