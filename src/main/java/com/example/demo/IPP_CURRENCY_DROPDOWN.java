package com.example.demo;

public class IPP_CURRENCY_DROPDOWN
{
	String CURR_CODE, CURR_NAME;

	public String getCURR_CODE() {
		return CURR_CODE;
	}

	public void setCURR_CODE(String cURR_CODE) {
		CURR_CODE = cURR_CODE;
	}

	public String getCURR_NAME() {
		return CURR_NAME;
	}

	public void setCURR_NAME(String cURR_NAME) {
		CURR_NAME = cURR_NAME;
	}

	@Override
	public String toString() {
		return "IPP_CURRENCY_DROPDOWN [CURR_CODE=" + CURR_CODE + ", CURR_NAME=" + CURR_NAME + "]";
	}

	public IPP_CURRENCY_DROPDOWN(String cURR_CODE, String cURR_NAME) {
		super();
		CURR_CODE = cURR_CODE;
		CURR_NAME = cURR_NAME;
	}

	public IPP_CURRENCY_DROPDOWN() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
