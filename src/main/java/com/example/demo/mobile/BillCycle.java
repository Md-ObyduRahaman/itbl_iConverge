package com.example.demo.mobile;

public class BillCycle {
	private String billCode, billName;

	public BillCycle(String billCode, String billName) {
		super();
		this.billCode = billCode;
		this.billName = billName;
	}

	public String getBillCode() {
		return billCode;
	}

	public void setBillCode(String billCode) {
		this.billCode = billCode;
	}

	public String getBillName() {
		return billName;
	}

	public void setBillName(String billName) {
		this.billName = billName;
	}
	
	

}
