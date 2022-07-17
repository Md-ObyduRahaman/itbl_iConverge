package com.example.demo;

public class IC_GEN_AREAmain {
	private String GEN_AREA_CODE;
	private String GEN_AREA_NAME;
	private String STATUS;
	private int GEN_AREA_ID;
	public IC_GEN_AREAmain() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_GEN_AREAmain(String gEN_AREA_CODE, String gEN_AREA_NAME, String sTATUS, int gEN_AREA_ID) {
		super();
		GEN_AREA_CODE = gEN_AREA_CODE;
		GEN_AREA_NAME = gEN_AREA_NAME;
		STATUS = sTATUS;
		GEN_AREA_ID = gEN_AREA_ID;
	}
	public String getGEN_AREA_CODE() {
		return GEN_AREA_CODE;
	}
	public void setGEN_AREA_CODE(String gEN_AREA_CODE) {
		GEN_AREA_CODE = gEN_AREA_CODE;
	}
	public String getGEN_AREA_NAME() {
		return GEN_AREA_NAME;
	}
	public void setGEN_AREA_NAME(String gEN_AREA_NAME) {
		GEN_AREA_NAME = gEN_AREA_NAME;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public int getGEN_AREA_ID() {
		return GEN_AREA_ID;
	}
	public void setGEN_AREA_ID(int gEN_AREA_ID) {
		GEN_AREA_ID = gEN_AREA_ID;
	}
	@Override
	public String toString() {
		return "IC_GEN_AREAmain [GEN_AREA_CODE=" + GEN_AREA_CODE + ", GEN_AREA_NAME=" + GEN_AREA_NAME + ", STATUS="
				+ STATUS + ", GEN_AREA_ID=" + GEN_AREA_ID + "]";
	}

}
