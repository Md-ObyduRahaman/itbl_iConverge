package com.example.demo;

public class UnitModList {
	private String billCycleCode;
	private String ppCode;
	private String ppName;
	private String ppUnitCode;
	private String ppUnitName;
	private String enrgGen;
	private String enrgConsSelf;
	private String fuelUsed;
	private String STATUS;
	private int ppUnitModId;
	public UnitModList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UnitModList(String billCycleCode, String ppCode, String ppName, String ppUnitCode, String ppUnitName,
			String enrgGen, String enrgConsSelf, String fuelUsed, String sTATUS, int ppUnitModId) {
		super();
		this.billCycleCode = billCycleCode;
		this.ppCode = ppCode;
		this.ppName = ppName;
		this.ppUnitCode = ppUnitCode;
		this.ppUnitName = ppUnitName;
		this.enrgGen = enrgGen;
		this.enrgConsSelf = enrgConsSelf;
		this.fuelUsed = fuelUsed;
		STATUS = sTATUS;
		this.ppUnitModId = ppUnitModId;
	}
	public String getBillCycleCode() {
		return billCycleCode;
	}
	public void setBillCycleCode(String billCycleCode) {
		this.billCycleCode = billCycleCode;
	}
	public String getPpCode() {
		return ppCode;
	}
	public void setPpCode(String ppCode) {
		this.ppCode = ppCode;
	}
	public String getPpName() {
		return ppName;
	}
	public void setPpName(String ppName) {
		this.ppName = ppName;
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
		return "UnitModList [billCycleCode=" + billCycleCode + ", ppCode=" + ppCode + ", ppName=" + ppName
				+ ", ppUnitCode=" + ppUnitCode + ", ppUnitName=" + ppUnitName + ", enrgGen=" + enrgGen
				+ ", enrgConsSelf=" + enrgConsSelf + ", fuelUsed=" + fuelUsed + ", STATUS=" + STATUS + ", ppUnitModId="
				+ ppUnitModId + "]";
	}

	

}
