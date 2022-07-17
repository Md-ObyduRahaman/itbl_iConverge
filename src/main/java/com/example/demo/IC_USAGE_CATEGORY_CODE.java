package com.example.demo;

public class IC_USAGE_CATEGORY_CODE {
	private String USAGE_CAT_CODE;
	private String USAGE_CAT_NAME;
	private String USAGE_TYPE;
	private String LINE_TYPE;
	private String LINE_TYPE_NAME;
	private String AREA_CODE;
	private String AREA_NAME;
	private int USAGE_CAT_ID;
	public IC_USAGE_CATEGORY_CODE() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_USAGE_CATEGORY_CODE(String uSAGE_CAT_CODE, String uSAGE_CAT_NAME, String uSAGE_TYPE,
			String lINE_TYPE, String lINE_TYPE_NAME, String aREA_CODE, String aREA_NAME, int uSAGE_CAT_ID) {
		super();
		USAGE_CAT_CODE = uSAGE_CAT_CODE;
		USAGE_CAT_NAME = uSAGE_CAT_NAME;
		USAGE_TYPE = uSAGE_TYPE;
		LINE_TYPE = lINE_TYPE;
		LINE_TYPE_NAME = lINE_TYPE_NAME;
		AREA_CODE = aREA_CODE;
		AREA_NAME = aREA_NAME;
		USAGE_CAT_ID = uSAGE_CAT_ID;
	}
	public String getUSAGE_CAT_CODE() {
		return USAGE_CAT_CODE;
	}
	public void setUSAGE_CAT_CODE(String uSAGE_CAT_CODE) {
		USAGE_CAT_CODE = uSAGE_CAT_CODE;
	}
	public String getUSAGE_CAT_NAME() {
		return USAGE_CAT_NAME;
	}
	public void setUSAGE_CAT_NAME(String uSAGE_CAT_NAME) {
		USAGE_CAT_NAME = uSAGE_CAT_NAME;
	}
	
	public String getUSAGE_TYPE() {
		return USAGE_TYPE;
	}
	public void setUSAGE_TYPE(String uSAGE_TYPE) {
		USAGE_TYPE = uSAGE_TYPE;
	}
	public String getLINE_TYPE() {
		return LINE_TYPE;
	}
	public void setLINE_TYPE(String lINE_TYPE) {
		LINE_TYPE = lINE_TYPE;
	}
	public String getLINE_TYPE_NAME() {
		return LINE_TYPE_NAME;
	}
	public void setLINE_TYPE_NAME(String lINE_TYPE_NAME) {
		LINE_TYPE_NAME = lINE_TYPE_NAME;
	}
	public String getAREA_CODE() {
		return AREA_CODE;
	}
	public void setAREA_CODE(String aREA_CODE) {
		AREA_CODE = aREA_CODE;
	}
	public String getAREA_NAME() {
		return AREA_NAME;
	}
	public void setAREA_NAME(String aREA_NAME) {
		AREA_NAME = aREA_NAME;
	}
	public int getUSAGE_CAT_ID() {
		return USAGE_CAT_ID;
	}
	public void setUSAGE_CAT_ID(int uSAGE_CAT_ID) {
		USAGE_CAT_ID = uSAGE_CAT_ID;
	}
	@Override
	public String toString() {
		return "IC_USAGE_CATEGORY_CODE [USAGE_CAT_CODE=" + USAGE_CAT_CODE + ", USAGE_CAT_NAME=" + USAGE_CAT_NAME
				+ USAGE_TYPE + ", LINE_TYPE=" + LINE_TYPE + ", LINE_TYPE_NAME="
				+ LINE_TYPE_NAME + ", AREA_CODE=" + AREA_CODE + ", AREA_NAME=" + AREA_NAME + ", USAGE_CAT_ID="
				+ USAGE_CAT_ID + "]";
	}

}
