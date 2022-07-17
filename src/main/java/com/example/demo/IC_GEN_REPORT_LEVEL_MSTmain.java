package com.example.demo;

public class IC_GEN_REPORT_LEVEL_MSTmain {
	
	private String REPORT_LEVEL_CODE;
	private String REPORT_LEVEL_DESC;
	private String STATUS;
	private String GEN_REPORT_LV_ID;
	public IC_GEN_REPORT_LEVEL_MSTmain() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_GEN_REPORT_LEVEL_MSTmain(String rEPORT_LEVEL_CODE, String rEPORT_LEVEL_DESC, String sTATUS,
			String gEN_REPORT_LV_ID) {
		super();
		REPORT_LEVEL_CODE = rEPORT_LEVEL_CODE;
		REPORT_LEVEL_DESC = rEPORT_LEVEL_DESC;
		STATUS = sTATUS;
		GEN_REPORT_LV_ID = gEN_REPORT_LV_ID;
	}
	public String getREPORT_LEVEL_CODE() {
		return REPORT_LEVEL_CODE;
	}
	public void setREPORT_LEVEL_CODE(String rEPORT_LEVEL_CODE) {
		REPORT_LEVEL_CODE = rEPORT_LEVEL_CODE;
	}
	public String getREPORT_LEVEL_DESC() {
		return REPORT_LEVEL_DESC;
	}
	public void setREPORT_LEVEL_DESC(String rEPORT_LEVEL_DESC) {
		REPORT_LEVEL_DESC = rEPORT_LEVEL_DESC;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getGEN_REPORT_LV_ID() {
		return GEN_REPORT_LV_ID;
	}
	public void setGEN_REPORT_LV_ID(String gEN_REPORT_LV_ID) {
		GEN_REPORT_LV_ID = gEN_REPORT_LV_ID;
	}
	@Override
	public String toString() {
		return "IC_GEN_REPORT_LEVEL_MST [REPORT_LEVEL_CODE=" + REPORT_LEVEL_CODE + ", REPORT_LEVEL_DESC="
				+ REPORT_LEVEL_DESC + ", STATUS=" + STATUS + ", GEN_REPORT_LV_ID=" + GEN_REPORT_LV_ID + "]";
	}

}
