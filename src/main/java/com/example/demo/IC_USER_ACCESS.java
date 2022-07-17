package com.example.demo;

public class IC_USER_ACCESS {
	
	private String USER_NAME;
	private String MOD_CODE;
	private String MOD_NAME;
	private String STATUS;
	private String ACTIVITY_CODE;
	private String ACTIVITY_NAME;
	private int USER_ACS_ID;
	private String GRP_CODE;
	private String GRP_NAME;
	public IC_USER_ACCESS() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_USER_ACCESS(String uSER_NAME, String mOD_CODE, String mOD_NAME, String sTATUS, String aCTIVITY_CODE,
			String aCTIVITY_NAME, int uSER_ACS_ID, String gRP_CODE, String gRP_NAME) {
		super();
		USER_NAME = uSER_NAME;
		MOD_CODE = mOD_CODE;
		MOD_NAME = mOD_NAME;
		STATUS = sTATUS;
		ACTIVITY_CODE = aCTIVITY_CODE;
		ACTIVITY_NAME = aCTIVITY_NAME;
		USER_ACS_ID = uSER_ACS_ID;
		GRP_CODE = gRP_CODE;
		GRP_NAME = gRP_NAME;
	}
	public String getUSER_NAME() {
		return USER_NAME;
	}
	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
	public String getMOD_CODE() {
		return MOD_CODE;
	}
	public void setMOD_CODE(String mOD_CODE) {
		MOD_CODE = mOD_CODE;
	}
	public String getMOD_NAME() {
		return MOD_NAME;
	}
	public void setMOD_NAME(String mOD_NAME) {
		MOD_NAME = mOD_NAME;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getACTIVITY_CODE() {
		return ACTIVITY_CODE;
	}
	public void setACTIVITY_CODE(String aCTIVITY_CODE) {
		ACTIVITY_CODE = aCTIVITY_CODE;
	}
	public String getACTIVITY_NAME() {
		return ACTIVITY_NAME;
	}
	public void setACTIVITY_NAME(String aCTIVITY_NAME) {
		ACTIVITY_NAME = aCTIVITY_NAME;
	}
	public int getUSER_ACS_ID() {
		return USER_ACS_ID;
	}
	public void setUSER_ACS_ID(int uSER_ACS_ID) {
		USER_ACS_ID = uSER_ACS_ID;
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
		return "IC_USER_ACCESS [USER_NAME=" + USER_NAME + ", MOD_CODE=" + MOD_CODE + ", MOD_NAME=" + MOD_NAME
				+ ", STATUS=" + STATUS + ", ACTIVITY_CODE=" + ACTIVITY_CODE + ", ACTIVITY_NAME=" + ACTIVITY_NAME
				+ ", USER_ACS_ID=" + USER_ACS_ID + ", GRP_CODE=" + GRP_CODE + ", GRP_NAME=" + GRP_NAME + "]";
	}

}
