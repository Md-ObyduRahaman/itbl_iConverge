package com.example.demo;

public class ReportIndex {
	
	String MOD_APP,MOD_NAME,PAGE_RANG;

	public ReportIndex(String mOD_APP, String mOD_NAME, String pAGE_RANG) {
		super();
		MOD_APP = mOD_APP;
		MOD_NAME = mOD_NAME;
		PAGE_RANG = pAGE_RANG;
	}

	public ReportIndex() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getMOD_APP() {
		return MOD_APP;
	}

	public void setMOD_APP(String mOD_APP) {
		MOD_APP = mOD_APP;
	}

	public String getMOD_NAME() {
		return MOD_NAME;
	}

	public void setMOD_NAME(String mOD_NAME) {
		MOD_NAME = mOD_NAME;
	}

	public String getPAGE_RANG() {
		return PAGE_RANG;
	}

	public void setPAGE_RANG(String pAGE_RANG) {
		PAGE_RANG = pAGE_RANG;
	}

	@Override
	public String toString() {
		return "ReportIndex [MOD_APP=" + MOD_APP + ", MOD_NAME=" + MOD_NAME + ", PAGE_RANG=" + PAGE_RANG + "]";
	}
	
	

}
