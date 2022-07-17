package com.example.demo;

public class UnitModInset {
	private String billCycleCode;
	private String ppUnitCode;
	private String enrgGen;
	private String enrgConsSelf;
	private String STATUS;
	private String fuelUsed;
	private String ppCode;
	public UnitModInset() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UnitModInset(String billCycleCode, String ppUnitCode, String enrgGen, String enrgConsSelf, String sTATUS,
			String fuelUsed, String ppCode) {
		super();
		this.billCycleCode = billCycleCode;
		this.ppUnitCode = ppUnitCode;
		this.enrgGen = enrgGen;
		this.enrgConsSelf = enrgConsSelf;
		STATUS = sTATUS;
		this.fuelUsed = fuelUsed;
		this.ppCode = ppCode;
	}
	public String getBillCycleCode() {
		return billCycleCode;
	}
	public void setBillCycleCode(String billCycleCode) {
		this.billCycleCode = billCycleCode;
	}
	public String getPpUnitCode() {
		return ppUnitCode;
	}
	public void setPpUnitCode(String ppUnitCode) {
		this.ppUnitCode = ppUnitCode;
	}
	public String getEnrgGen() {
		return enrgGen;
	}
	public void setEnrgGen(String enrgGen) {
		this.enrgGen = enrgGen;
	}
	public String getEnrgConsSelf() {
		return enrgConsSelf;
	}
	public void setEnrgConsSelf(String enrgConsSelf) {
		this.enrgConsSelf = enrgConsSelf;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getFuelUsed() {
		return fuelUsed;
	}
	public void setFuelUsed(String fuelUsed) {
		this.fuelUsed = fuelUsed;
	}
	public String getPpCode() {
		return ppCode;
	}
	public void setPpCode(String ppCode) {
		this.ppCode = ppCode;
	}
	@Override
	public String toString() {
		return "UnitModInset [billCycleCode=" + billCycleCode + ", ppUnitCode=" + ppUnitCode + ", enrgGen=" + enrgGen
				+ ", enrgConsSelf=" + enrgConsSelf + ", STATUS=" + STATUS + ", fuelUsed=" + fuelUsed + ", ppCode="
				+ ppCode + "]";
	}


}
