package com.example.demo;

public class InsertIppPayment {
	private String billCycleCode;
	private String ppCode;
	private String COUNTRY_CODE;
	private String CONTRY_NAME;
	private String engrPurchased;
	private String CURR_CODE;
	private String CURR_NAME;
	private String payAmount;
	private String payDate;
	private String status;
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
	public String getEngrPurchased() {
		return engrPurchased;
	}
	public void setEngrPurchased(String engrPurchased) {
		this.engrPurchased = engrPurchased;
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
	public String getPayAmount() {
		return payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayDate() {
		return payDate;
	}
	public void setPayDate(String payDate) {
		this.payDate = payDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "InsertIppPayment [billCycleCode=" + billCycleCode + ", ppCode=" + ppCode + ", COUNTRY_CODE="
				+ COUNTRY_CODE + ", CONTRY_NAME=" + CONTRY_NAME + ", engrPurchased=" + engrPurchased + ", CURR_CODE="
				+ CURR_CODE + ", CURR_NAME=" + CURR_NAME + ", payAmount=" + payAmount + ", payDate=" + payDate
				+ ", status=" + status + "]";
	}
	public InsertIppPayment(String billCycleCode, String ppCode, String cOUNTRY_CODE, String cONTRY_NAME,
			String engrPurchased, String cURR_CODE, String cURR_NAME, String payAmount, String payDate, String status) {
		super();
		this.billCycleCode = billCycleCode;
		this.ppCode = ppCode;
		COUNTRY_CODE = cOUNTRY_CODE;
		CONTRY_NAME = cONTRY_NAME;
		this.engrPurchased = engrPurchased;
		CURR_CODE = cURR_CODE;
		CURR_NAME = cURR_NAME;
		this.payAmount = payAmount;
		this.payDate = payDate;
		this.status = status;
	}
	public InsertIppPayment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
