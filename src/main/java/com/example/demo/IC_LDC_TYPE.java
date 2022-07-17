package com.example.demo;

public class IC_LDC_TYPE {
	
	String LDC_TYPE_CODE, LDC_TYPE_NAME;

	@Override
	public String toString() {
		return "IC_LDC_TYPE [LDC_TYPE_CODE=" + LDC_TYPE_CODE + ", LDC_TYPE_NAME=" + LDC_TYPE_NAME + "]";
	}

	public String getLDC_TYPE_CODE() {
		return LDC_TYPE_CODE;
	}

	public void setLDC_TYPE_CODE(String lDC_TYPE_CODE) {
		LDC_TYPE_CODE = lDC_TYPE_CODE;
	}

	public String getLDC_TYPE_NAME() {
		return LDC_TYPE_NAME;
	}

	public void setLDC_TYPE_NAME(String lDC_TYPE_NAME) {
		LDC_TYPE_NAME = lDC_TYPE_NAME;
	}

	public IC_LDC_TYPE(String lDC_TYPE_CODE, String lDC_TYPE_NAME) {
		super();
		LDC_TYPE_CODE = lDC_TYPE_CODE;
		LDC_TYPE_NAME = lDC_TYPE_NAME;
	}

	public IC_LDC_TYPE() {
		super();
		// TODO Auto-generated constructor stub
	}

}
