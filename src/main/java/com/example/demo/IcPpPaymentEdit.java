package com.example.demo;

public class IcPpPaymentEdit {
	private String billCycleCode;
	private String ppName;
	private String COUNTRY_CODE;
	private String CONTRY_NAME;
	private String enrgPuchansed;
	private String payAmount;
	private String CURR_CODE;
	private String CURR_NAME;
	private String status;
	public String getBillCycleCode() {
		return billCycleCode;
	}
	public void setBillCycleCode(String billCycleCode) {
		this.billCycleCode = billCycleCode;
	}
	public String getPpName() {
		return ppName;
	}
	public void setPpName(String ppName) {
		this.ppName = ppName;
	}
	public String getCOUNTRY_CODE() {
		return COUNTRY_CODE;
	}
	public void setCOUNTRY_CODE(String cOUNTRY_CODE) {
		COUNTRY_CODE = cOUNTRY_CODE;
	}
	public String getCONTRY_NAME() {
		return CONTRY_NAME;
	}
	public void setCONTRY_NAME(String cONTRY_NAME) {
		CONTRY_NAME = cONTRY_NAME;
	}
	public String getEnrgPuchansed() {
		return enrgPuchansed;
	}
	public void setEnrgPuchansed(String enrgPuchansed) {
		this.enrgPuchansed = enrgPuchansed;
	}
	
	public String getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getCURR_CODE() {
		return CURR_CODE;
	}
	public void setCURR_CODE(String cURR_CODE) {
		CURR_CODE = cURR_CODE;
	}
	public String getCURR_NAME() {
		return CURR_NAME;
	}
	public void setCURR_NAME(String cURR_NAME) {
		CURR_NAME = cURR_NAME;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "IcPpPaymentEdit [billCycleCode=" + billCycleCode + ", ppName=" + ppName + ", COUNTRY_CODE="
				+ COUNTRY_CODE + ", CONTRY_NAME=" + CONTRY_NAME + ", enrgPuchansed=" + enrgPuchansed + ", payAmount="
				+ payAmount + ", CURR_CODE=" + CURR_CODE + ", CURR_NAME=" + CURR_NAME + ", status=" + status + "]";
	}
	public IcPpPaymentEdit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IcPpPaymentEdit(String billCycleCode, String ppName, String cOUNTRY_CODE, String cONTRY_NAME,
			String enrgPuchansed, String payAmount, String cURR_CODE, String cURR_NAME, String status) {
		super();
		this.billCycleCode = billCycleCode;
		this.ppName = ppName;
		this.COUNTRY_CODE = cOUNTRY_CODE;
		this.CONTRY_NAME = cONTRY_NAME;
		this.enrgPuchansed = enrgPuchansed;
		this.payAmount = payAmount;
		this.CURR_CODE = cURR_CODE;
		this.CURR_NAME = cURR_NAME;
		this.status = status;
	}
	
	
	
	
	
	
}
