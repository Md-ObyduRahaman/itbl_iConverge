package com.example.demo;

public class IC_PERIOD_MST1 {

	private String YEAR_CODE;
	private String BILL_CYCLE_CODE ;
	private String BILL_CYCLE_DESC;
	private String PR_ID;
	public IC_PERIOD_MST1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_PERIOD_MST1(String yEAR_CODE, String bILL_CYCLE_CODE, String bILL_CYCLE_DESC, String pR_ID) {
		super();
		YEAR_CODE = yEAR_CODE;
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
		BILL_CYCLE_DESC = bILL_CYCLE_DESC;
		PR_ID = pR_ID;
	}
	public String getYEAR_CODE() {
		return YEAR_CODE;
	}
	public void setYEAR_CODE(String yEAR_CODE) {
		YEAR_CODE = yEAR_CODE;
	}
	public String getBILL_CYCLE_CODE() {
		return BILL_CYCLE_CODE;
	}
	public void setBILL_CYCLE_CODE(String bILL_CYCLE_CODE) {
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
	}
	public String getBILL_CYCLE_DESC() {
		return BILL_CYCLE_DESC;
	}
	public void setBILL_CYCLE_DESC(String bILL_CYCLE_DESC) {
		BILL_CYCLE_DESC = bILL_CYCLE_DESC;
	}
	public String getPR_ID() {
		return PR_ID;
	}
	public void setPR_ID(String pR_ID) {
		PR_ID = pR_ID;
	}
	@Override
	public String toString() {
		return "IC_PERIOD_MST1 [YEAR_CODE=" + YEAR_CODE + ", BILL_CYCLE_CODE=" + BILL_CYCLE_CODE + ", BILL_CYCLE_DESC="
				+ BILL_CYCLE_DESC + ", PR_ID=" + PR_ID + "]";
	}
	
}
