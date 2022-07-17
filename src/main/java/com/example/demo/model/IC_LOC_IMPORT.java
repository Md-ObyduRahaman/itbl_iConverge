package com.example.demo.model;

public class IC_LOC_IMPORT
{
	public String BILL_CYCLE_CODE;
	public String LOCATION_CODE;
	String KWH;
	String KVARH;
	String STATUS;
	String IMP_ID;
	String LOCATION_NAME;

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

	public String getKWH() {
		return KWH;
	}

	public void setKWH(String kWH) {
		KWH = kWH;
	}

	public String getKVARH() {
		return KVARH;
	}

	public void setKVARH(String kVARH) {
		KVARH = kVARH;
	}

	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	

	public String getIMP_ID() {
		return IMP_ID;
	}

	public void setIMP_ID(String iMP_ID) {
		IMP_ID = iMP_ID;
	}

	public String getLOCATION_NAME() {
		return LOCATION_NAME;
	}

	public void setLOCATION_NAME(String lOCATION_NAME) {
		LOCATION_NAME = lOCATION_NAME;
	}

	public IC_LOC_IMPORT() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IC_LOC_IMPORT(String bILL_CYCLE_CODE, String lOCATION_CODE, String kWH, String kVARH, String sTATUS,
			String iMP_ID, String lOCATION_NAME) {
		super();
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
		LOCATION_CODE = lOCATION_CODE;
		KWH = kWH;
		KVARH = kVARH;
		STATUS = sTATUS;
		IMP_ID = iMP_ID;
		LOCATION_NAME = lOCATION_NAME;
	}

	@Override
	public String toString() {
		return "IC_LOC_IMPORT [BILL_CYCLE_CODE=" + BILL_CYCLE_CODE + ", LOCATION_CODE=" + LOCATION_CODE + ", KWH=" + KWH
				+ ", KVARH=" + KVARH + ", STATUS=" + STATUS + ", IMP_ID=" + IMP_ID + ", LOCATION_NAME=" + LOCATION_NAME
				+ "]";
	}

	
	
	
	
}
