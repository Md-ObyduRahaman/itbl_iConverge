package com.example.demo;

public class IC_POWER_PLANTmain {
	private String PP_CODE;
	private String PP_NAME;
	private String NO_OF_UNIT;
	private double INSTALLED_CAPACITY;
	private double MAX_CAPACITY;
	private String GRID_CODE;
	private String GRID_DESC;
	private String STATUS;
	private String OWNER_CODE;
	private String OWNER_NAME;
	private String SHORT_NAME;
	private String GEN_AREA_CODE;
	private String GEN_AREA_NAME;
	private int PP_ID;
	@Override
	public String toString() {
		return "IC_POWER_PLANTmain [PP_CODE=" + PP_CODE + ", PP_NAME=" + PP_NAME + ", NO_OF_UNIT=" + NO_OF_UNIT
				+ ", INSTALLED_CAPACITY=" + INSTALLED_CAPACITY + ", MAX_CAPACITY=" + MAX_CAPACITY + ", GRID_CODE="
				+ GRID_CODE + ", GRID_DESC=" + GRID_DESC + ", STATUS=" + STATUS + ", OWNER_CODE=" + OWNER_CODE
				+ ", OWNER_NAME=" + OWNER_NAME + ", SHORT_NAME=" + SHORT_NAME + ", GEN_AREA_CODE=" + GEN_AREA_CODE
				+ ", GEN_AREA_NAME=" + GEN_AREA_NAME + ", PP_ID=" + PP_ID + "]";
	}
	public String getPP_CODE() {
		return PP_CODE;
	}
	public void setPP_CODE(String pP_CODE) {
		PP_CODE = pP_CODE;
	}
	public String getPP_NAME() {
		return PP_NAME;
	}
	public void setPP_NAME(String pP_NAME) {
		PP_NAME = pP_NAME;
	}
	public String getNO_OF_UNIT() {
		return NO_OF_UNIT;
	}
	public void setNO_OF_UNIT(String nO_OF_UNIT) {
		NO_OF_UNIT = nO_OF_UNIT;
	}
	public double getINSTALLED_CAPACITY() {
		return INSTALLED_CAPACITY;
	}
	public void setINSTALLED_CAPACITY(double iNSTALLED_CAPACITY) {
		INSTALLED_CAPACITY = iNSTALLED_CAPACITY;
	}
	public double getMAX_CAPACITY() {
		return MAX_CAPACITY;
	}
	public void setMAX_CAPACITY(double mAX_CAPACITY) {
		MAX_CAPACITY = mAX_CAPACITY;
	}
	public String getGRID_CODE() {
		return GRID_CODE;
	}
	public void setGRID_CODE(String gRID_CODE) {
		GRID_CODE = gRID_CODE;
	}
	public String getGRID_DESC() {
		return GRID_DESC;
	}
	public void setGRID_DESC(String gRID_DESC) {
		GRID_DESC = gRID_DESC;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getOWNER_CODE() {
		return OWNER_CODE;
	}
	public void setOWNER_CODE(String oWNER_CODE) {
		OWNER_CODE = oWNER_CODE;
	}
	public String getOWNER_NAME() {
		return OWNER_NAME;
	}
	public void setOWNER_NAME(String oWNER_NAME) {
		OWNER_NAME = oWNER_NAME;
	}
	public String getSHORT_NAME() {
		return SHORT_NAME;
	}
	public void setSHORT_NAME(String sHORT_NAME) {
		SHORT_NAME = sHORT_NAME;
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
	public int getPP_ID() {
		return PP_ID;
	}
	public void setPP_ID(int pP_ID) {
		PP_ID = pP_ID;
	}
	public IC_POWER_PLANTmain(String pP_CODE, String pP_NAME, String nO_OF_UNIT, double iNSTALLED_CAPACITY,
			double mAX_CAPACITY, String gRID_CODE, String gRID_DESC, String sTATUS, String oWNER_CODE,
			String oWNER_NAME, String sHORT_NAME, String gEN_AREA_CODE, String gEN_AREA_NAME, int pP_ID) {
		super();
		PP_CODE = pP_CODE;
		PP_NAME = pP_NAME;
		NO_OF_UNIT = nO_OF_UNIT;
		INSTALLED_CAPACITY = iNSTALLED_CAPACITY;
		MAX_CAPACITY = mAX_CAPACITY;
		GRID_CODE = gRID_CODE;
		GRID_DESC = gRID_DESC;
		STATUS = sTATUS;
		OWNER_CODE = oWNER_CODE;
		OWNER_NAME = oWNER_NAME;
		SHORT_NAME = sHORT_NAME;
		GEN_AREA_CODE = gEN_AREA_CODE;
		GEN_AREA_NAME = gEN_AREA_NAME;
		PP_ID = pP_ID;
	}
	public IC_POWER_PLANTmain() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
