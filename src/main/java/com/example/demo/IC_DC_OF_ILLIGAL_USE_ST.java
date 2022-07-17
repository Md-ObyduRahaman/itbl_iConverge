package com.example.demo;

public class IC_DC_OF_ILLIGAL_USE_ST {

	String BILL_CYCLE_CODE, NO_OF_DC_LINE, NO_OF_CASE_FILED, FINE_REALISE, ILL_DC_ID, STATUS;

	public IC_DC_OF_ILLIGAL_USE_ST(String bILL_CYCLE_CODE, String nO_OF_DC_LINE, String nO_OF_CASE_FILED,
			String fINE_REALISE, String iLL_DC_ID, String sTATUS) {
		super();
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
		NO_OF_DC_LINE = nO_OF_DC_LINE;
		NO_OF_CASE_FILED = nO_OF_CASE_FILED;
		FINE_REALISE = fINE_REALISE;
		ILL_DC_ID = iLL_DC_ID;
		STATUS = sTATUS;
	}

	public IC_DC_OF_ILLIGAL_USE_ST() {
		// TODO Auto-generated constructor stub
	}

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

	public String getNO_OF_CASE_FILED() {
		return NO_OF_CASE_FILED;
	}

	public void setNO_OF_CASE_FILED(String nO_OF_CASE_FILED) {
		NO_OF_CASE_FILED = nO_OF_CASE_FILED;
	}

	public String getFINE_REALISE() {
		return FINE_REALISE;
	}

	public void setFINE_REALISE(String fINE_REALISE) {
		FINE_REALISE = fINE_REALISE;
	}

	public String getILL_DC_ID() {
		return ILL_DC_ID;
	}

	public void setILL_DC_ID(String iLL_DC_ID) {
		ILL_DC_ID = iLL_DC_ID;
	}

	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	@Override
	public String toString() {
		return "IC_DC_OF_ILLIGAL_USE_ST [BILL_CYCLE_CODE=" + BILL_CYCLE_CODE + ", NO_OF_DC_LINE=" + NO_OF_DC_LINE
				+ ", NO_OF_CASE_FILED=" + NO_OF_CASE_FILED + ", FINE_REALISE=" + FINE_REALISE + ", ILL_DC_ID="
				+ ILL_DC_ID + ", STATUS=" + STATUS + "]";
	}

}
