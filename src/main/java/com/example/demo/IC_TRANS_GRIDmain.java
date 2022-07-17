package com.example.demo;

public class IC_TRANS_GRIDmain {
	
	private String  GRID_CODE;

	private String  GRID_DESC;
	
	private String AREA_CODE;
	
	private String AREA_NAME;
	
	private String STATUS;
	
	@Override
	public String toString() {
		return "IC_TRANS_GRIDmain [GRID_CODE=" + GRID_CODE + ", GRID_DESC=" + GRID_DESC + ", AREA_CODE=" + AREA_CODE
				+ ", AREA_NAME=" + AREA_NAME + ", STATUS=" + STATUS + ", GRID_ID=" + GRID_ID + "]";
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

	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	public String getGRID_ID() {
		return GRID_ID;
	}

	public void setGRID_ID(String gRID_ID) {
		GRID_ID = gRID_ID;
	}

	public IC_TRANS_GRIDmain(String gRID_CODE, String gRID_DESC, String aREA_CODE, String aREA_NAME, String sTATUS,
			String gRID_ID) {
		super();
		GRID_CODE = gRID_CODE;
		GRID_DESC = gRID_DESC;
		AREA_CODE = aREA_CODE;
		AREA_NAME = aREA_NAME;
		STATUS = sTATUS;
		GRID_ID = gRID_ID;
	}

	private String GRID_ID;

	public IC_TRANS_GRIDmain() {
		super();
		// TODO Auto-generated constructor stub
	}

}
