package com.example.demo;

public class OfficeDrop {
	private String officeCode;
	private String officeDesc;

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getOfficeDesc() {
		return officeDesc;
	}

	public void setOfficeDesc(String officeDesc) {
		this.officeDesc = officeDesc;
	}

	@Override
	public String toString() {
		return "OfficeDrop [officeCode=" + officeCode + ", officeDesc=" + officeDesc + "]";
	}

	public OfficeDrop(String officeCode, String officeDesc) {
		super();
		this.officeCode = officeCode;
		this.officeDesc = officeDesc;
	}

	public OfficeDrop() {
		super();
		// TODO Auto-generated constructor stub
	}

}
