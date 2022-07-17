package com.example.demo;

public class IC_ACTIVITY_MST {
	private int ACTIVITY_ID;
	private String ACTIVITY_CODE;
	private String ACTIVITY_NAME;
	private String STATUS;
	public int getACTIVITY_ID() {
		return ACTIVITY_ID;
	}
	public void setACTIVITY_ID(int aCTIVITY_ID) {
		ACTIVITY_ID = aCTIVITY_ID;
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
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public IC_ACTIVITY_MST(int aCTIVITY_ID, String aCTIVITY_CODE, String aCTIVITY_NAME, String sTATUS) {
		super();
		ACTIVITY_ID = aCTIVITY_ID;
		ACTIVITY_CODE = aCTIVITY_CODE;
		ACTIVITY_NAME = aCTIVITY_NAME;
		STATUS = sTATUS;
	}
	public IC_ACTIVITY_MST() {
		super();
		// TODO Auto-generated constructor stub
	}
}
