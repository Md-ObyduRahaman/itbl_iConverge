package com.example.demo;

public class IC_MODULE_ACCESS {
	private String MOD_CODE;	
	private String MOD_NAME;
	private String STATUS;
	private String ACTIVITY_CODE;
	private String ACTIVITY_NAME;
	private int MOD_ACS_ID;
	public IC_MODULE_ACCESS() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_MODULE_ACCESS(String mOD_CODE, String mOD_NAME, String sTATUS, String aCTIVITY_CODE, String aCTIVITY_NAME,
			int mOD_ACS_ID) {
		super();
		MOD_CODE = mOD_CODE;
		MOD_NAME = mOD_NAME;
		STATUS = sTATUS;
		ACTIVITY_CODE = aCTIVITY_CODE;
		ACTIVITY_NAME = aCTIVITY_NAME;
		MOD_ACS_ID = mOD_ACS_ID;
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
	public int getMOD_ACS_ID() {
		return MOD_ACS_ID;
	}
	public void setMOD_ACS_ID(int mOD_ACS_ID) {
		MOD_ACS_ID = mOD_ACS_ID;
	}
	@Override
	public String toString() {
		return "IC_MODULE_ACCESS [MOD_CODE=" + MOD_CODE + ", MOD_NAME=" + MOD_NAME + ", STATUS=" + STATUS
				+ ", ACTIVITY_CODE=" + ACTIVITY_CODE + ", ACTIVITY_NAME=" + ACTIVITY_NAME + ", MOD_ACS_ID=" + MOD_ACS_ID
				+ "]";
	}
	
}
