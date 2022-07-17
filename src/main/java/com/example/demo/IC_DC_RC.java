package com.example.demo;

public class IC_DC_RC {

	private String BILL_CYCLE_CODE;
	private String NO_OF_DC_LINE;
	private String COLL_AGAINST_DC;
	private String NO_OF_RC_LINE;
	private String COLL_AGAINST_RC;
	private String RC_DC_ID;
	private String STATUS;
	
	
	
	public String getBILL_CYCLE_CODE() {
		return BILL_CYCLE_CODE;
	}

	public void setBILL_CYCLE_CODE(String bILL_CYCLE_CODE) {
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
	}

	public String getNO_OF_DC_LINE() {
		return NO_OF_DC_LINE;
	}

	public void setNO_OF_DC_LINE(String nO_OF_DC_LINE) {
		NO_OF_DC_LINE = nO_OF_DC_LINE;
	}

	public String getCOLL_AGAINST_DC() {
		return COLL_AGAINST_DC;
	}

	public void setCOLL_AGAINST_DC(String cOLL_AGAINST_DC) {
		COLL_AGAINST_DC = cOLL_AGAINST_DC;
	}

	public String getNO_OF_RC_LINE() {
		return NO_OF_RC_LINE;
	}

	public void setNO_OF_RC_LINE(String nO_OF_RC_LINE) {
		NO_OF_RC_LINE = nO_OF_RC_LINE;
	}

	public String getCOLL_AGAINST_RC() {
		return COLL_AGAINST_RC;
	}

	public void setCOLL_AGAINST_RC(String cOLL_AGAINST_RC) {
		COLL_AGAINST_RC = cOLL_AGAINST_RC;
	}

	public String getRC_DC_ID() {
		return RC_DC_ID;
	}

	public void setRC_DC_ID(String rC_DC_ID) {
		RC_DC_ID = rC_DC_ID;
	}

	public String getSTATUS() {
		return STATUS;
	}


	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	@Override
	public String toString() {
		return "IC_DC_RC [BILL_CYCLE_CODE=" + BILL_CYCLE_CODE + ", NO_OF_DC_LINE=" + NO_OF_DC_LINE
				+ ", COLL_AGAINST_DC=" + COLL_AGAINST_DC + ", NO_OF_RC_LINE=" + NO_OF_RC_LINE + ", COLL_AGAINST_RC="
				+ COLL_AGAINST_RC + ", RC_DC_ID=" + RC_DC_ID + ", STATUS=" + STATUS + "]";
	}

	public IC_DC_RC(String bILL_CYCLE_CODE, String nO_OF_DC_LINE, String cOLL_AGAINST_DC, String nO_OF_RC_LINE,
			String cOLL_AGAINST_RC, String rC_DC_ID, String sTATUS) {
		super();
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
		NO_OF_DC_LINE = nO_OF_DC_LINE;
		COLL_AGAINST_DC = cOLL_AGAINST_DC;
		NO_OF_RC_LINE = nO_OF_RC_LINE;
		COLL_AGAINST_RC = cOLL_AGAINST_RC;
		RC_DC_ID = rC_DC_ID;
		STATUS = sTATUS;
	}

	public IC_DC_RC() {
		super();
		// TODO Auto-generated constructor stub
	}

}
