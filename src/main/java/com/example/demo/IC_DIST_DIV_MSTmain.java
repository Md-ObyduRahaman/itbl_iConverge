package com.example.demo;

public class IC_DIST_DIV_MSTmain {
	private String ZONE_CODE;
	private String CIRCLE_CODE;
	private String DIV_CODE;
	private String DIV_DESC;
	private String STATUS;
	private String DIST_DIV_ID;
	public IC_DIST_DIV_MSTmain() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_DIST_DIV_MSTmain(String zONE_CODE, String cIRCLE_CODE, String dIV_CODE, String dIV_DESC, String sTATUS,
			String dIST_DIV_ID) {
		super();
		ZONE_CODE = zONE_CODE;
		CIRCLE_CODE = cIRCLE_CODE;
		DIV_CODE = dIV_CODE;
		DIV_DESC = dIV_DESC;
		STATUS = sTATUS;
		DIST_DIV_ID = dIST_DIV_ID;
	}
	public String getZONE_CODE() {
		return ZONE_CODE;
	}
	public void setZONE_CODE(String zONE_CODE) {
		ZONE_CODE = zONE_CODE;
	}
	public String getCIRCLE_CODE() {
		return CIRCLE_CODE;
	}
	public void setCIRCLE_CODE(String cIRCLE_CODE) {
		CIRCLE_CODE = cIRCLE_CODE;
	}
	public String getDIV_CODE() {
		return DIV_CODE;
	}
	public void setDIV_CODE(String dIV_CODE) {
		DIV_CODE = dIV_CODE;
	}
	public String getDIV_DESC() {
		return DIV_DESC;
	}
	public void setDIV_DESC(String dIV_DESC) {
		DIV_DESC = dIV_DESC;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getDIST_DIV_ID() {
		return DIST_DIV_ID;
	}
	public void setDIST_DIV_ID(String dIST_DIV_ID) {
		DIST_DIV_ID = dIST_DIV_ID;
	}
	@Override
	public String toString() {
		return "IC_DIST_DIV_MST [ZONE_CODE=" + ZONE_CODE + ", CIRCLE_CODE=" + CIRCLE_CODE + ", DIV_CODE=" + DIV_CODE
				+ ", DIV_DESC=" + DIV_DESC + ", STATUS=" + STATUS + ", DIST_DIV_ID=" + DIST_DIV_ID + "]";
	}
	
	
}
