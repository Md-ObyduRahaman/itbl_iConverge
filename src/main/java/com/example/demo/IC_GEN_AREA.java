package com.example.demo;

public class IC_GEN_AREA {

	
	private String GEN_AREA_CODE;
	
	private String GEN_AREA_NAME;

	public IC_GEN_AREA() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IC_GEN_AREA(String gEN_AREA_CODE, String gEN_AREA_NAME) {
		super();
		GEN_AREA_CODE = gEN_AREA_CODE;
		GEN_AREA_NAME = gEN_AREA_NAME;
	}

	public String getGEN_AREA_CODE() {
		return GEN_AREA_CODE;
	}

	public void setGEN_AREA_CODE(String gEN_AREA_CODE) {
		GEN_AREA_CODE = gEN_AREA_CODE;
	}

	public String getGEN_AREA_NAME() {
		return GEN_AREA_NAME;
	}

	public void setGEN_AREA_NAME(String gEN_AREA_NAME) {
		GEN_AREA_NAME = gEN_AREA_NAME;
	}

	@Override
	public String toString() {
		return "IC_GEN_AREA [GEN_AREA_CODE=" + GEN_AREA_CODE + ", GEN_AREA_NAME=" + GEN_AREA_NAME + "]";
	}

	
	
}
