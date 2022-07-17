package com.example.demo;

public class DASHBOARD_DATA {
	
	private String ORD;
	private String USER_TYPE;
	private String MOD;
	@Override
	public String toString() {
		return "DASHBOARD_DATA [ORD=" + ORD + ", USER_TYPE=" + USER_TYPE + ", MOD=" + MOD + "]";
	}
	public String getORD() {
		return ORD;
	}
	public void setORD(String oRD) {
		ORD = oRD;
	}
	public String getUSER_TYPE() {
		return USER_TYPE;
	}
	public void setUSER_TYPE(String uSER_TYPE) {
		USER_TYPE = uSER_TYPE;
	}
	public String getMOD() {
		return MOD;
	}
	public void setMOD(String mOD) {
		MOD = mOD;
	}
	public DASHBOARD_DATA(String oRD, String uSER_TYPE, String mOD) {
		super();
		ORD = oRD;
		USER_TYPE = uSER_TYPE;
		MOD = mOD;
	}
	public DASHBOARD_DATA() {
		super();
		// TODO Auto-generated constructor stub
	}

}
