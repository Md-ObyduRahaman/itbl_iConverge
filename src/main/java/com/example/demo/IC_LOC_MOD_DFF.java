package com.example.demo;

public class IC_LOC_MOD_DFF {
	
	private String BILL_CYCLE_CODE,LOCATION_CODE,LOC_MOD_ID,PR_USER,PR_OFFICE_CODE,NEXT_USER;

	public IC_LOC_MOD_DFF() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IC_LOC_MOD_DFF(String bILL_CYCLE_CODE, String lOCATION_CODE, String lOC_MOD_ID, String pR_USER,
			String pR_OFFICE_CODE, String nEXT_USER) {
		super();
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
		LOCATION_CODE = lOCATION_CODE;
		LOC_MOD_ID = lOC_MOD_ID;
		PR_USER = pR_USER;
		PR_OFFICE_CODE = pR_OFFICE_CODE;
		NEXT_USER = nEXT_USER;
	}

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

	public String getLOC_MOD_ID() {
		return LOC_MOD_ID;
	}

	public void setLOC_MOD_ID(String lOC_MOD_ID) {
		LOC_MOD_ID = lOC_MOD_ID;
	}

	public String getPR_USER() {
		return PR_USER;
	}

	public void setPR_USER(String pR_USER) {
		PR_USER = pR_USER;
	}

	public String getPR_OFFICE_CODE() {
		return PR_OFFICE_CODE;
	}

	public void setPR_OFFICE_CODE(String pR_OFFICE_CODE) {
		PR_OFFICE_CODE = pR_OFFICE_CODE;
	}



	public String getNEXT_USER() {
		return NEXT_USER;
	}

	public void setNEXT_USER(String nEXT_USER) {
		NEXT_USER = nEXT_USER;
	}

	@Override
	public String toString() {
		return "IC_LOC_MOD_DFF [BILL_CYCLE_CODE=" + BILL_CYCLE_CODE + ", LOCATION_CODE=" + LOCATION_CODE
				+ ", LOC_MOD_ID=" + LOC_MOD_ID + ", PR_USER=" + PR_USER + ", PR_OFFICE_CODE=" + PR_OFFICE_CODE
				+ ", NEXT_USER=" + NEXT_USER + "]";
	}

	
	

	
	
	

}
