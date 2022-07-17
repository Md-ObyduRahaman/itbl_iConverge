package com.example.demo.model;

public class TotalSumModel {
	
	String SYS_COLL,RAO_COLL, SYS_VAT_COLL, RAO_VAT_COLL;

	public TotalSumModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TotalSumModel(String sYS_COLL, String rAO_COLL) {
		super();
		SYS_COLL = sYS_COLL;
		RAO_COLL = rAO_COLL;
	}
	
	
	public TotalSumModel(String sYS_COLL, String rAO_COLL, String sYS_VAT_COLL, String rAO_VAT_COLL) {
		super();
		SYS_COLL = sYS_COLL;
		RAO_COLL = rAO_COLL;
		SYS_VAT_COLL = sYS_VAT_COLL;
		RAO_VAT_COLL = rAO_VAT_COLL;
	}

	public String getSYS_VAT_COLL() {
		return SYS_VAT_COLL;
	}

	public void setSYS_VAT_COLL(String sYS_VAT_COLL) {
		SYS_VAT_COLL = sYS_VAT_COLL;
	}

	public String getRAO_VAT_COLL() {
		return RAO_VAT_COLL;
	}

	public void setRAO_VAT_COLL(String rAO_VAT_COLL) {
		RAO_VAT_COLL = rAO_VAT_COLL;
	}

	public String getSYS_COLL() {
		return SYS_COLL;
	}

	public void setSYS_COLL(String sYS_COLL) {
		SYS_COLL = sYS_COLL;
	}

	public String getRAO_COLL() {
		return RAO_COLL;
	}

	public void setRAO_COLL(String rAO_COLL) {
		RAO_COLL = rAO_COLL;
	}

	@Override
	public String toString() {
		return "TotalSumModel [SYS_COLL=" + SYS_COLL + ", RAO_COLL=" + RAO_COLL + ", SYS_VAT_COLL=" + SYS_VAT_COLL
				+ ", RAO_VAT_COLL=" + RAO_VAT_COLL + "]";
	}

	
	
	

}
