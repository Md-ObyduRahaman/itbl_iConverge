package com.example.demo;

public class LocationListModel {
	private int pLOCATION_ID;
	private String pLOCATION_CODE;
	private String pLOCATION_NAME;
	private String status;
	private String pZONE_DESC;
	private String pCIRCLE_DESC;
	private String pDIV_DESC;
	private String pCOMP_CNTR_NAME;

	public int getpLOCATION_ID() {
		return pLOCATION_ID;
	}

	public void setpLOCATION_ID(int pLOCATION_ID) {
		this.pLOCATION_ID = pLOCATION_ID;
	}

	public String getpLOCATION_CODE() {
		return pLOCATION_CODE;
	}

	public void setpLOCATION_CODE(String pLOCATION_CODE) {
		this.pLOCATION_CODE = pLOCATION_CODE;
	}

	public String getpLOCATION_NAME() {
		return pLOCATION_NAME;
	}

	public void setpLOCATION_NAME(String pLOCATION_NAME) {
		this.pLOCATION_NAME = pLOCATION_NAME;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getpZONE_DESC() {
		return pZONE_DESC;
	}

	public void setpZONE_DESC(String pZONE_DESC) {
		this.pZONE_DESC = pZONE_DESC;
	}

	public String getpCIRCLE_DESC() {
		return pCIRCLE_DESC;
	}

	public void setpCIRCLE_DESC(String pCIRCLE_DESC) {
		this.pCIRCLE_DESC = pCIRCLE_DESC;
	}

	public String getpDIV_DESC() {
		return pDIV_DESC;
	}

	public void setpDIV_DESC(String pDIV_DESC) {
		this.pDIV_DESC = pDIV_DESC;
	}

	public String getpCOMP_CNTR_NAME() {
		return pCOMP_CNTR_NAME;
	}

	public void setpCOMP_CNTR_NAME(String pCOMP_CNTR_NAME) {
		this.pCOMP_CNTR_NAME = pCOMP_CNTR_NAME;
	}

	@Override
	public String toString() {
		return "LocationListModel [pLOCATION_ID=" + pLOCATION_ID + ", pLOCATION_CODE=" + pLOCATION_CODE
				+ ", pLOCATION_NAME=" + pLOCATION_NAME + ", status=" + status + ", pZONE_DESC=" + pZONE_DESC
				+ ", pCIRCLE_DESC=" + pCIRCLE_DESC + ", pDIV_DESC=" + pDIV_DESC + ", pCOMP_CNTR_NAME=" + pCOMP_CNTR_NAME
				+ "]";
	}

	public LocationListModel(int pLOCATION_ID, String pLOCATION_CODE, String pLOCATION_NAME, String status,
			String pZONE_DESC, String pCIRCLE_DESC, String pDIV_DESC, String pCOMP_CNTR_NAME) {
		super();
		this.pLOCATION_ID = pLOCATION_ID;
		this.pLOCATION_CODE = pLOCATION_CODE;
		this.pLOCATION_NAME = pLOCATION_NAME;
		this.status = status;
		this.pZONE_DESC = pZONE_DESC;
		this.pCIRCLE_DESC = pCIRCLE_DESC;
		this.pDIV_DESC = pDIV_DESC;
		this.pCOMP_CNTR_NAME = pCOMP_CNTR_NAME;
	}

	public LocationListModel() {
		// TODO Auto-generated constructor stub
	}

}
