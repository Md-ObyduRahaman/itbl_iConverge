package com.example.demo;

public class UnirmodEdit {
	private String ppUnitCode;
	private String ppUnitName;
	private String engrGen;
	private String engrConsSelf;
	private String fuelUsed;
	 String STATUS;
	private int ppUnitModId;
	public UnirmodEdit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UnirmodEdit(String ppUnitCode, String ppUnitName, String engrGen, String engrConsSelf, String fuelUsed,
			String sTATUS, int ppUnitModId) {
		super();
		this.ppUnitCode = ppUnitCode;
		this.ppUnitName = ppUnitName;
		this.engrGen = engrGen;
		this.engrConsSelf = engrConsSelf;
		this.fuelUsed = fuelUsed;
		this.STATUS = sTATUS;
		this.ppUnitModId = ppUnitModId;
	}
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
	public String getEngrGen() {
		return engrGen;
	}
	public void setEngrGen(String engrGen) {
		this.engrGen = engrGen;
	}
	public String getEngrConsSelf() {
		return engrConsSelf;
	}
	public void setEngrConsSelf(String engrConsSelf) {
		this.engrConsSelf = engrConsSelf;
	}
	public String getFuelUsed() {
		return fuelUsed;
	}
	public void setFuelUsed(String fuelUsed) {
		this.fuelUsed = fuelUsed;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public int getPpUnitModId() {
		return ppUnitModId;
	}
	public void setPpUnitModId(int ppUnitModId) {
		this.ppUnitModId = ppUnitModId;
	}
	@Override
	public String toString() {
		return "UnirmodEdit [ppUnitCode=" + ppUnitCode + ", ppUnitName=" + ppUnitName + ", engrGen=" + engrGen
				+ ", engrConsSelf=" + engrConsSelf + ", fuelUsed=" + fuelUsed + ", STATUS=" + STATUS + ", ppUnitModId="
				+ ppUnitModId + "]";
	}
	

}
