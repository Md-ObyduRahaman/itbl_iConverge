package com.example.demo;

public class PpModEdit {
	private String ppModId,billCycleCode;
	private String ppCode;
	private String ppName;
	
	@Override
	public String toString() {
		return "PpModEdit [ppModId=" + ppModId + ", billCycleCode=" + billCycleCode + ", ppCode=" + ppCode + ", ppName="
				+ ppName + "]";
	}

	public String getPpModId() {
		return ppModId;
	}

	public void setPpModId(String ppModId) {
		this.ppModId = ppModId;
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

	public PpModEdit(String ppModId, String billCycleCode, String ppCode, String ppName) {
		super();
		this.ppModId = ppModId;
		this.billCycleCode = billCycleCode;
		this.ppCode = ppCode;
		this.ppName = ppName;
	}

	public PpModEdit() {
		super();
		// TODO Auto-generated constructor stub
	}
}
