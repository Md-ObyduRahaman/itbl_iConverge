package com.example.demo;

public class IC_CIRCLE_MSTmain {
	
	private String ZONE_CODE;
//	private String ZONE_DESC;
	private String CIRCLE_CODE;
	private String CIRCLE_DESC;
	private String STATUS;
	private String CIRCLE_ID;
	public IC_CIRCLE_MSTmain() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_CIRCLE_MSTmain(String zONE_CODE, String cIRCLE_CODE, String cIRCLE_DESC, String sTATUS, String cIRCLE_ID) {
		super();
		ZONE_CODE = zONE_CODE;
		CIRCLE_CODE = cIRCLE_CODE;
		CIRCLE_DESC = cIRCLE_DESC;
		STATUS = sTATUS;
		CIRCLE_ID = cIRCLE_ID;
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
	public String getCIRCLE_DESC() {
		return CIRCLE_DESC;
	}
	public void setCIRCLE_DESC(String cIRCLE_DESC) {
		CIRCLE_DESC = cIRCLE_DESC;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getCIRCLE_ID() {
		return CIRCLE_ID;
	}
	public void setCIRCLE_ID(String cIRCLE_ID) {
		CIRCLE_ID = cIRCLE_ID;
	}
	@Override
	public String toString() {
		return "IC_CIRCLE_MST [ZONE_CODE=" + ZONE_CODE + ", CIRCLE_CODE=" + CIRCLE_CODE + ", CIRCLE_DESC=" + CIRCLE_DESC
				+ ", STATUS=" + STATUS + ", CIRCLE_ID=" + CIRCLE_ID + "]";
	}
	
	
}

