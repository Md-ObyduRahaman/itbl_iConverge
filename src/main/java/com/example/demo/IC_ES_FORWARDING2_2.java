package com.example.demo;

public class IC_ES_FORWARDING2_2 {

	private String TP;
	private String  UC_TYPE;
	private String  PREV_YR_SALES;
	private String  CURR_YR_UPTO_SALES;
	private String  PREV_MONTH_SALES;
	private String  PREV_YR_MONTH_SALES;
	private String  CURR_MONTH_SALES;
	public IC_ES_FORWARDING2_2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_ES_FORWARDING2_2(String tP, String uC_TYPE, String pREV_YR_SALES, String cURR_YR_UPTO_SALES,
			String pREV_MONTH_SALES, String pREV_YR_MONTH_SALES, String cURR_MONTH_SALES) {
		super();
		TP = tP;
		UC_TYPE = uC_TYPE;
		PREV_YR_SALES = pREV_YR_SALES;
		CURR_YR_UPTO_SALES = cURR_YR_UPTO_SALES;
		PREV_MONTH_SALES = pREV_MONTH_SALES;
		PREV_YR_MONTH_SALES = pREV_YR_MONTH_SALES;
		CURR_MONTH_SALES = cURR_MONTH_SALES;
	}
	public String getTP() {
		return TP;
	}
	public void setTP(String tP) {
		TP = tP;
	}
	public String getUC_TYPE() {
		return UC_TYPE;
	}
	public void setUC_TYPE(String uC_TYPE) {
		UC_TYPE = uC_TYPE;
	}
	public String getPREV_YR_SALES() {
		return PREV_YR_SALES;
	}
	public void setPREV_YR_SALES(String pREV_YR_SALES) {
		PREV_YR_SALES = pREV_YR_SALES;
	}
	public String getCURR_YR_UPTO_SALES() {
		return CURR_YR_UPTO_SALES;
	}
	public void setCURR_YR_UPTO_SALES(String cURR_YR_UPTO_SALES) {
		CURR_YR_UPTO_SALES = cURR_YR_UPTO_SALES;
	}
	public String getPREV_MONTH_SALES() {
		return PREV_MONTH_SALES;
	}
	public void setPREV_MONTH_SALES(String pREV_MONTH_SALES) {
		PREV_MONTH_SALES = pREV_MONTH_SALES;
	}
	public String getPREV_YR_MONTH_SALES() {
		return PREV_YR_MONTH_SALES;
	}
	public void setPREV_YR_MONTH_SALES(String pREV_YR_MONTH_SALES) {
		PREV_YR_MONTH_SALES = pREV_YR_MONTH_SALES;
	}
	public String getCURR_MONTH_SALES() {
		return CURR_MONTH_SALES;
	}
	public void setCURR_MONTH_SALES(String cURR_MONTH_SALES) {
		CURR_MONTH_SALES = cURR_MONTH_SALES;
	}
	@Override
	public String toString() {
		return "IC_ES_FORWARDING2_2 [TP=" + TP + ", UC_TYPE=" + UC_TYPE + ", PREV_YR_SALES=" + PREV_YR_SALES
				+ ", CURR_YR_UPTO_SALES=" + CURR_YR_UPTO_SALES + ", PREV_MONTH_SALES=" + PREV_MONTH_SALES
				+ ", PREV_YR_MONTH_SALES=" + PREV_YR_MONTH_SALES + ", CURR_MONTH_SALES=" + CURR_MONTH_SALES + "]";
	}
	
	
}
