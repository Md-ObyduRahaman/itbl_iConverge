package com.example.demo.model;

public class SingleDataModel {
	
	String outFlag="";

	public SingleDataModel(String outFlag) {
		super();
		this.outFlag = outFlag;
	}

	public SingleDataModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getOutFlag() {
		return outFlag;
	}

	public void setOutFlag(String outFlag) {
		this.outFlag = outFlag;
	}

	@Override
	public String toString() {
		return "SingleDataModel [outFlag=" + outFlag + "]";
	}
	
	

}
