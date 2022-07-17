package com.example.demo;

public class InsertPpMod {
	private String ppModId,FUEL_CODE,billCycleCode;
	private String ppCode;
	private String status;
	
	public InsertPpMod() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InsertPpMod(String ppModId, String fUEL_CODE, String billCycleCode, String ppCode, String status) {
		super();
		this.ppModId = ppModId;
		FUEL_CODE = fUEL_CODE;
		this.billCycleCode = billCycleCode;
		this.ppCode = ppCode;
		this.status = status;
	}

	public String getPpModId() {
		return ppModId;
	}

	public void setPpModId(String ppModId) {
		this.ppModId = ppModId;
	}

	public String getFUEL_CODE() {
		return FUEL_CODE;
	}

	public void setFUEL_CODE(String fUEL_CODE) {
		FUEL_CODE = fUEL_CODE;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "InsertPpMod [ppModId=" + ppModId + ", FUEL_CODE=" + FUEL_CODE + ", billCycleCode=" + billCycleCode
				+ ", ppCode=" + ppCode + ", status=" + status + "]";
	}
	
	
}
