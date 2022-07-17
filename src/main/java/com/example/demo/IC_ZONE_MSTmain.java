package com.example.demo;

public class IC_ZONE_MSTmain {
	
	private String ZONE_ID;	
	private String ZONE_CODE;
	private String ZONE_DESC;
	private String ZONE_TYPE;
	private String REC_STATUS;
	@Override
	public String toString() {
		return "IC_ZONE_MST [ZONE_ID=" + ZONE_ID + ", ZONE_CODE=" + ZONE_CODE + ", ZONE_DESC=" + ZONE_DESC
				+ ", ZONE_TYPE=" + ZONE_TYPE + ", REC_STATUS=" + REC_STATUS + "]";
	}
	public String getZONE_ID() {
		return ZONE_ID;
	}
	public void setZONE_ID(String zONE_ID) {
		ZONE_ID = zONE_ID;
	}
	public String getZONE_CODE() {
		return ZONE_CODE;
	}
	public void setZONE_CODE(String zONE_CODE) {
		ZONE_CODE = zONE_CODE;
	}
	public String getZONE_DESC() {
		return ZONE_DESC;
	}
	public void setZONE_DESC(String zONE_DESC) {
		ZONE_DESC = zONE_DESC;
	}
	public String getZONE_TYPE() {
		return ZONE_TYPE;
	}
	public void setZONE_TYPE(String zONE_TYPE) {
		ZONE_TYPE = zONE_TYPE;
	}
	public String getREC_STATUS() {
		return REC_STATUS;
	}
	public void setREC_STATUS(String rEC_STATUS) {
		REC_STATUS = rEC_STATUS;
	}
	public IC_ZONE_MSTmain(String zONE_ID, String zONE_CODE, String zONE_DESC, String zONE_TYPE, String rEC_STATUS) {
		super();
		ZONE_ID = zONE_ID;
		ZONE_CODE = zONE_CODE;
		ZONE_DESC = zONE_DESC;
		ZONE_TYPE = zONE_TYPE;
		REC_STATUS = rEC_STATUS;
	}
	public IC_ZONE_MSTmain() {
		super();
		// TODO Auto-generated constructor stub
	}

}
