package com.example.demo.model;

public class MOD_ACC_RECV_SECT_REPORT {
	private String BILL_MONTH;
	private String LOCATION_CODE;
	private String LOCATION_NAME;
	private String CIRCLE_NAME;
	private String RAO_NAME;
	private String SECT_NAME;
	private String AMT_RECV_PREV_MONTH;
	private String CUR_MONTH_BILLED_AMT;
	private String CUR_MONTH_COL_AMT;
	private String AMT_RECV_CUR_MONTH;
	private String EQM;
	
	@Override
	public String toString() {
		return "MOD_ACC_RECV_SECT_REPORT [BILL_MONTH=" + BILL_MONTH + ", LOCATION_CODE=" + LOCATION_CODE
				+ ", LOCATION_NAME=" + LOCATION_NAME + ", CIRCLE_NAME=" + CIRCLE_NAME + ", RAO_NAME=" + RAO_NAME
				+ ", SECT_NAME=" + SECT_NAME + ", AMT_RECV_PREV_MONTH=" + AMT_RECV_PREV_MONTH
				+ ", CUR_MONTH_BILLED_AMT=" + CUR_MONTH_BILLED_AMT + ", CUR_MONTH_COL_AMT=" + CUR_MONTH_COL_AMT
				+ ", AMT_RECV_CUR_MONTH=" + AMT_RECV_CUR_MONTH + ", EQM=" + EQM + "]";
	}

	public String getBILL_MONTH() {
		return BILL_MONTH;
	}

	public void setBILL_MONTH(String bILL_MONTH) {
		BILL_MONTH = bILL_MONTH;
	}

	public String getLOCATION_CODE() {
		return LOCATION_CODE;
	}

	public void setLOCATION_CODE(String lOCATION_CODE) {
		LOCATION_CODE = lOCATION_CODE;
	}

	public String getLOCATION_NAME() {
		return LOCATION_NAME;
	}

	public void setLOCATION_NAME(String lOCATION_NAME) {
		LOCATION_NAME = lOCATION_NAME;
	}

	public String getCIRCLE_NAME() {
		return CIRCLE_NAME;
	}

	public void setCIRCLE_NAME(String cIRCLE_NAME) {
		CIRCLE_NAME = cIRCLE_NAME;
	}

	public String getRAO_NAME() {
		return RAO_NAME;
	}

	public void setRAO_NAME(String rAO_NAME) {
		RAO_NAME = rAO_NAME;
	}

	public String getSECT_NAME() {
		return SECT_NAME;
	}

	public void setSECT_NAME(String sECT_NAME) {
		SECT_NAME = sECT_NAME;
	}

	public String getAMT_RECV_PREV_MONTH() {
		return AMT_RECV_PREV_MONTH;
	}

	public void setAMT_RECV_PREV_MONTH(String aMT_RECV_PREV_MONTH) {
		AMT_RECV_PREV_MONTH = aMT_RECV_PREV_MONTH;
	}

	public String getCUR_MONTH_BILLED_AMT() {
		return CUR_MONTH_BILLED_AMT;
	}

	public void setCUR_MONTH_BILLED_AMT(String cUR_MONTH_BILLED_AMT) {
		CUR_MONTH_BILLED_AMT = cUR_MONTH_BILLED_AMT;
	}

	public String getCUR_MONTH_COL_AMT() {
		return CUR_MONTH_COL_AMT;
	}

	public void setCUR_MONTH_COL_AMT(String cUR_MONTH_COL_AMT) {
		CUR_MONTH_COL_AMT = cUR_MONTH_COL_AMT;
	}

	public String getAMT_RECV_CUR_MONTH() {
		return AMT_RECV_CUR_MONTH;
	}

	public void setAMT_RECV_CUR_MONTH(String aMT_RECV_CUR_MONTH) {
		AMT_RECV_CUR_MONTH = aMT_RECV_CUR_MONTH;
	}

	public String getEQM() {
		return EQM;
	}

	public void setEQM(String eQM) {
		EQM = eQM;
	}

	public MOD_ACC_RECV_SECT_REPORT(String bILL_MONTH, String lOCATION_CODE, String lOCATION_NAME, String cIRCLE_NAME,
			String rAO_NAME, String sECT_NAME, String aMT_RECV_PREV_MONTH, String cUR_MONTH_BILLED_AMT,
			String cUR_MONTH_COL_AMT, String aMT_RECV_CUR_MONTH, String eQM) {
		super();
		BILL_MONTH = bILL_MONTH;
		LOCATION_CODE = lOCATION_CODE;
		LOCATION_NAME = lOCATION_NAME;
		CIRCLE_NAME = cIRCLE_NAME;
		RAO_NAME = rAO_NAME;
		SECT_NAME = sECT_NAME;
		AMT_RECV_PREV_MONTH = aMT_RECV_PREV_MONTH;
		CUR_MONTH_BILLED_AMT = cUR_MONTH_BILLED_AMT;
		CUR_MONTH_COL_AMT = cUR_MONTH_COL_AMT;
		AMT_RECV_CUR_MONTH = aMT_RECV_CUR_MONTH;
		EQM = eQM;
	}

	public MOD_ACC_RECV_SECT_REPORT() {
		super();
		// TODO Auto-generated constructor stub
	}

}
