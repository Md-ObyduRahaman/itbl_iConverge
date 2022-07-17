package com.example.demo;

public class PpUnitDtlDrop {
	private String ppUnitCode;
	private String ppUnitName;
	public String getPpUnitCode() {
		return ppUnitCode;
	}
	public void setPpUnitCode(String ppUnitCode) {
		this.ppUnitCode = ppUnitCode;
	}
	public String getPpUnitName() {
		return ppUnitName;
	}
	public void setPpUnitName(String ppUnitName) {
		this.ppUnitName = ppUnitName;
	}
	@Override
	public String toString() {
		return "PpUnitDtlDrop [ppUnitCode=" + ppUnitCode + ", ppUnitName=" + ppUnitName + "]";
	}
	public PpUnitDtlDrop(String ppUnitCode, String ppUnitName) {
		super();
		this.ppUnitCode = ppUnitCode;
		this.ppUnitName = ppUnitName;
	}
	public PpUnitDtlDrop() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
