package com.example.demo;

public class IC_GROUP_ACCESS {
	
	private String GRP_CODE;
	private String GRP_NAME;
	private String MOD_CODE;
	private String MOD_NAME;
	private String STATUS;
	private String ACTIVITY_CODE;
	private String ACTIVITY_NAME;
	private int GRP_ACS_ID;
	public IC_GROUP_ACCESS() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_GROUP_ACCESS(String gRP_CODE, String gRP_NAME, String mOD_CODE, String mOD_NAME, String sTATUS,
			String aCTIVITY_CODE, String aCTIVITY_NAME, int gRP_ACS_ID) {
		super();
		GRP_CODE = gRP_CODE;
		GRP_NAME = gRP_NAME;
		MOD_CODE = mOD_CODE;
		MOD_NAME = mOD_NAME;
		STATUS = sTATUS;
		ACTIVITY_CODE = aCTIVITY_CODE;
		ACTIVITY_NAME = aCTIVITY_NAME;
		GRP_ACS_ID = gRP_ACS_ID;
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
	public int getGRP_ACS_ID() {
		return GRP_ACS_ID;
	}
	public void setGRP_ACS_ID(int gRP_ACS_ID) {
		GRP_ACS_ID = gRP_ACS_ID;
	}
	@Override
	public String toString() {
		return "IC_GROUP_ACCESS [GRP_CODE=" + GRP_CODE + ", GRP_NAME=" + GRP_NAME + ", MOD_CODE=" + MOD_CODE
				+ ", MOD_NAME=" + MOD_NAME + ", STATUS=" + STATUS + ", ACTIVITY_CODE=" + ACTIVITY_CODE
				+ ", ACTIVITY_NAME=" + ACTIVITY_NAME + ", GRP_ACS_ID=" + GRP_ACS_ID + "]";
	}
	
	
}
