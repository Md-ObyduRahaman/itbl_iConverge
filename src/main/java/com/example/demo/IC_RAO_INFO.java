package com.example.demo;

public class IC_RAO_INFO {
	private String RAO_CODE;
	private String RAO_NAME;
	private String STATUS;
	private String RAO_ID;
	@Override
	public String toString() {
		return "IC_RAO_INFO [RAO_CODE=" + RAO_CODE + ", RAO_NAME=" + RAO_NAME + ", STATUS=" + STATUS + ", RAO_ID="
				+ RAO_ID + "]";
	}
	public String getRAO_CODE() {
		return RAO_CODE;
	}
	public void setRAO_CODE(String rAO_CODE) {
		RAO_CODE = rAO_CODE;
	}
	public String getRAO_NAME() {
		return RAO_NAME;
	}
	public void setRAO_NAME(String rAO_NAME) {
		RAO_NAME = rAO_NAME;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getRAO_ID() {
		return RAO_ID;
	}
	public void setRAO_ID(String rAO_ID) {
		RAO_ID = rAO_ID;
	}
	public IC_RAO_INFO(String rAO_CODE, String rAO_NAME, String sTATUS, String rAO_ID) {
		super();
		RAO_CODE = rAO_CODE;
		RAO_NAME = rAO_NAME;
		STATUS = sTATUS;
		RAO_ID = rAO_ID;
	}
	public IC_RAO_INFO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_RAO_INFO(String rAO_CODE, String rAO_NAME) {
		super();
		RAO_CODE = rAO_CODE;
		RAO_NAME = rAO_NAME;
	}
	
}
