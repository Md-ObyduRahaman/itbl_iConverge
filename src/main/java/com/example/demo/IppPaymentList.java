package com.example.demo;

public class IppPaymentList {
	private String billCycleCode;
	private String ppCode;
	private String ppName;
	private String engrPurchased;
	private String payAmount;
	private String payDate;
	private String ppPayId;
	private String COUNTRY_CODE;
	private String CONTRY_NAME;
	private String CURR_CODE;
	private String CURR_NAME;
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
	public String getPpName() {
		return ppName;
	}
	public void setPpName(String ppName) {
		this.ppName = ppName;
	}
	public String getEngrPurchased() {
		return engrPurchased;
	}
	public void setEngrPurchased(String engrPurchased) {
		this.engrPurchased = engrPurchased;
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
	public String getPpPayId() {
		return ppPayId;
	}
	public void setPpPayId(String ppPayId) {
		this.ppPayId = ppPayId;
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
	public IppPaymentList(String billCycleCode, String ppCode, String ppName, String engrPurchased, String payAmount,
			String payDate, String ppPayId, String cOUNTRY_CODE, String cONTRY_NAME, String cURR_CODE, String cURR_NAME,
			String status) {
		super();
		this.billCycleCode = billCycleCode;
		this.ppCode = ppCode;
		this.ppName = ppName;
		this.engrPurchased = engrPurchased;
		this.payAmount = payAmount;
		this.payDate = payDate;
		this.ppPayId = ppPayId;
		this.COUNTRY_CODE = cOUNTRY_CODE;
		this.CONTRY_NAME = cONTRY_NAME;
		this.CURR_CODE = cURR_CODE;
		this.CURR_NAME = cURR_NAME;
		this.status = status;
	}
	public IppPaymentList() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "IppPaymentList [billCycleCode=" + billCycleCode + ", ppCode=" + ppCode + ", ppName=" + ppName
				+ ", engrPurchased=" + engrPurchased + ", payAmount=" + payAmount + ", payDate=" + payDate
				+ ", ppPayId=" + ppPayId + ", COUNTRY_CODE=" + COUNTRY_CODE + ", CONTRY_NAME=" + CONTRY_NAME
				+ ", CURR_CODE=" + CURR_CODE + ", CURR_NAME=" + CURR_NAME + ", status=" + status + "]";
	}
	
	
	
}
