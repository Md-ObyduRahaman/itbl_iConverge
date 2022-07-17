package com.example.demo;

public class IC_MODULES_LIST {
	
	private String PARENT;	
	private String MOD_APP;
	private String EXT;
	private String ROOTLEAF;
	private String MOD_NAME;
	private String MTYPE;	
	private String MOD_CODE;
	private String PAGE_RANG;
	private String SHORT_NAME;
	private int MOD_ID;
	public IC_MODULES_LIST() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_MODULES_LIST(String pARENT, String mOD_APP, String eXT, String rOOTLEAF, String mOD_NAME, String mTYPE,
			String mOD_CODE, String pAGE_RANG, String sHORT_NAME, int mOD_ID) {
		super();
		PARENT = pARENT;
		MOD_APP = mOD_APP;
		EXT = eXT;
		ROOTLEAF = rOOTLEAF;
		MOD_NAME = mOD_NAME;
		MTYPE = mTYPE;
		MOD_CODE = mOD_CODE;
		PAGE_RANG = pAGE_RANG;
		SHORT_NAME = sHORT_NAME;
		MOD_ID = mOD_ID;
	}
	public String getPARENT() {
		return PARENT;
	}
	public void setPARENT(String pARENT) {
		PARENT = pARENT;
	}
	public String getMOD_APP() {
		return MOD_APP;
	}
	public void setMOD_APP(String mOD_APP) {
		MOD_APP = mOD_APP;
	}
	public String getEXT() {
		return EXT;
	}
	public void setEXT(String eXT) {
		EXT = eXT;
	}
	public String getROOTLEAF() {
		return ROOTLEAF;
	}
	public void setROOTLEAF(String rOOTLEAF) {
		ROOTLEAF = rOOTLEAF;
	}
	public String getMOD_NAME() {
		return MOD_NAME;
	}
	public void setMOD_NAME(String mOD_NAME) {
		MOD_NAME = mOD_NAME;
	}
	public String getMTYPE() {
		return MTYPE;
	}
	public void setMTYPE(String mTYPE) {
		MTYPE = mTYPE;
	}
	public String getMOD_CODE() {
		return MOD_CODE;
	}
	public void setMOD_CODE(String mOD_CODE) {
		MOD_CODE = mOD_CODE;
	}
	public String getPAGE_RANG() {
		return PAGE_RANG;
	}
	public void setPAGE_RANG(String pAGE_RANG) {
		PAGE_RANG = pAGE_RANG;
	}
	public String getSHORT_NAME() {
		return SHORT_NAME;
	}
	public void setSHORT_NAME(String sHORT_NAME) {
		SHORT_NAME = sHORT_NAME;
	}
	public int getMOD_ID() {
		return MOD_ID;
	}
	public void setMOD_ID(int mOD_ID) {
		MOD_ID = mOD_ID;
	}
	@Override
	public String toString() {
		return "IC_MODULE_LIST [PARENT=" + PARENT + ", MOD_APP=" + MOD_APP + ", EXT=" + EXT + ", ROOTLEAF=" + ROOTLEAF
				+ ", MOD_NAME=" + MOD_NAME + ", MTYPE=" + MTYPE + ", MOD_CODE=" + MOD_CODE + ", PAGE_RANG=" + PAGE_RANG
				+ ", SHORT_NAME=" + SHORT_NAME + ", MOD_ID=" + MOD_ID + "]";
	}

}
