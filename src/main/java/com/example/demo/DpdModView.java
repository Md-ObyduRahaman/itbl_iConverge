package com.example.demo;

public class DpdModView {
	String SL_NO, ITEM_NAME,CURR_MONTH, UPTO_MONTH,one, two;

	public DpdModView() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DpdModView(String sL_NO, String iTEM_NAME, String cURR_MONTH, String uPTO_MONTH, String one, String two) {
		super();
		SL_NO = sL_NO;
		ITEM_NAME = iTEM_NAME;
		CURR_MONTH = cURR_MONTH;
		UPTO_MONTH = uPTO_MONTH;
		this.one = one;
		this.two = two;
	}

	public String getSL_NO() {
		return SL_NO;
	}

	public void setSL_NO(String sL_NO) {
		SL_NO = sL_NO;
	}

	public String getITEM_NAME() {
		return ITEM_NAME;
	}

	public void setITEM_NAME(String iTEM_NAME) {
		ITEM_NAME = iTEM_NAME;
	}

	public String getCURR_MONTH() {
		return CURR_MONTH;
	}

	public void setCURR_MONTH(String cURR_MONTH) {
		CURR_MONTH = cURR_MONTH;
	}

	public String getUPTO_MONTH() {
		return UPTO_MONTH;
	}

	public void setUPTO_MONTH(String uPTO_MONTH) {
		UPTO_MONTH = uPTO_MONTH;
	}

	public String getOne() {
		return one;
	}

	public void setOne(String one) {
		this.one = one;
	}

	public String getTwo() {
		return two;
	}

	public void setTwo(String two) {
		this.two = two;
	}

	@Override
	public String toString() {
		return "DpdModView [SL_NO=" + SL_NO + ", ITEM_NAME=" + ITEM_NAME + ", CURR_MONTH=" + CURR_MONTH
				+ ", UPTO_MONTH=" + UPTO_MONTH + ", one=" + one + ", two=" + two + "]";
	}
	
}
