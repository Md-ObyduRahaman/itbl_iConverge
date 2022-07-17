package com.example.demo;

public class DASHBOARD_DIST {

	private String HDR;
	private String LINEX;
	private String SYS_LOSS;
	private String CI_RATIO;
	private String CB_RATIO;
	private String NET_IMPORT_KWH;
	private String COLL_AMT;
	private String BILLED_AMT;
	private String BILLED_UNIT;
	private String EQ_MONTH;
	private String REC_AMT;
	public DASHBOARD_DIST() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DASHBOARD_DIST(String hDR, String lINEX, String sYS_LOSS, String cI_RATIO, String cB_RATIO,
			String nET_IMPORT_KWH, String cOLL_AMT, String bILLED_AMT, String bILLED_UNIT, String eQ_MONTH,
			String rEC_AMT) {
		super();
		HDR = hDR;
		LINEX = lINEX;
		SYS_LOSS = sYS_LOSS;
		CI_RATIO = cI_RATIO;
		CB_RATIO = cB_RATIO;
		NET_IMPORT_KWH = nET_IMPORT_KWH;
		COLL_AMT = cOLL_AMT;
		BILLED_AMT = bILLED_AMT;
		BILLED_UNIT = bILLED_UNIT;
		EQ_MONTH = eQ_MONTH;
		REC_AMT = rEC_AMT;
	}
	public String getHDR() {
		return HDR;
	}
	public void setHDR(String hDR) {
		HDR = hDR;
	}
	public String getLINEX() {
		return LINEX;
	}
	public void setLINEX(String lINEX) {
		LINEX = lINEX;
	}
	public String getSYS_LOSS() {
		return SYS_LOSS;
	}
	public void setSYS_LOSS(String sYS_LOSS) {
		SYS_LOSS = sYS_LOSS;
	}
	public String getCI_RATIO() {
		return CI_RATIO;
	}
	public void setCI_RATIO(String cI_RATIO) {
		CI_RATIO = cI_RATIO;
	}
	public String getCB_RATIO() {
		return CB_RATIO;
	}
	public void setCB_RATIO(String cB_RATIO) {
		CB_RATIO = cB_RATIO;
	}
	public String getNET_IMPORT_KWH() {
		return NET_IMPORT_KWH;
	}
	public void setNET_IMPORT_KWH(String nET_IMPORT_KWH) {
		NET_IMPORT_KWH = nET_IMPORT_KWH;
	}
	public String getCOLL_AMT() {
		return COLL_AMT;
	}
	public void setCOLL_AMT(String cOLL_AMT) {
		COLL_AMT = cOLL_AMT;
	}
	public String getBILLED_AMT() {
		return BILLED_AMT;
	}
	public void setBILLED_AMT(String bILLED_AMT) {
		BILLED_AMT = bILLED_AMT;
	}
	public String getBILLED_UNIT() {
		return BILLED_UNIT;
	}
	public void setBILLED_UNIT(String bILLED_UNIT) {
		BILLED_UNIT = bILLED_UNIT;
	}
	public String getEQ_MONTH() {
		return EQ_MONTH;
	}
	public void setEQ_MONTH(String eQ_MONTH) {
		EQ_MONTH = eQ_MONTH;
	}
	public String getREC_AMT() {
		return REC_AMT;
	}
	public void setREC_AMT(String rEC_AMT) {
		REC_AMT = rEC_AMT;
	}
	@Override
	public String toString() {
		return "DASHBOARD_DIST [HDR=" + HDR + ", LINEX=" + LINEX + ", SYS_LOSS=" + SYS_LOSS + ", CI_RATIO=" + CI_RATIO
				+ ", CB_RATIO=" + CB_RATIO + ", NET_IMPORT_KWH=" + NET_IMPORT_KWH + ", COLL_AMT=" + COLL_AMT
				+ ", BILLED_AMT=" + BILLED_AMT + ", BILLED_UNIT=" + BILLED_UNIT + ", EQ_MONTH=" + EQ_MONTH
				+ ", REC_AMT=" + REC_AMT + "]";
	}
	
	
	
}
