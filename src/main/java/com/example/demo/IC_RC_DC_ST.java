package com.example.demo;

public class IC_RC_DC_ST
{
	 String NO_OF_DC_LINE, COLL_AGAINST_DC, NO_OF_RC_LINE, COLL_AGAINST_RC;

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

	@Override
	public String toString() {
		return "IC_RC_DC_ST [NO_OF_DC_LINE=" + NO_OF_DC_LINE + ", COLL_AGAINST_DC=" + COLL_AGAINST_DC
				+ ", NO_OF_RC_LINE=" + NO_OF_RC_LINE + ", COLL_AGAINST_RC=" + COLL_AGAINST_RC + "]";
	}

	public IC_RC_DC_ST(String nO_OF_DC_LINE, String cOLL_AGAINST_DC, String nO_OF_RC_LINE, String cOLL_AGAINST_RC) {
		super();
		NO_OF_DC_LINE = nO_OF_DC_LINE;
		COLL_AGAINST_DC = cOLL_AGAINST_DC;
		NO_OF_RC_LINE = nO_OF_RC_LINE;
		COLL_AGAINST_RC = cOLL_AGAINST_RC;
	}

	public IC_RC_DC_ST() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	 
	 
	
	
}
