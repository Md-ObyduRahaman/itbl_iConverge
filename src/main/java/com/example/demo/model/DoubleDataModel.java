package com.example.demo.model;

public class DoubleDataModel {
	
	String REMARKS,PR_USER;

	public DoubleDataModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DoubleDataModel(String rEMARKS, String pR_USER) {
		super();
		REMARKS = rEMARKS;
		PR_USER = pR_USER;
	}

	public String getREMARKS() {
		return REMARKS;
	}

	public void setREMARKS(String rEMARKS) {
		REMARKS = rEMARKS;
	}

	public String getPR_USER() {
		return PR_USER;
	}

	public void setPR_USER(String pR_USER) {
		PR_USER = pR_USER;
	}

	@Override
	public String toString() {
		return "DoubleDataModel [REMARKS=" + REMARKS + ", PR_USER=" + PR_USER + "]";
	}
	
	

}
