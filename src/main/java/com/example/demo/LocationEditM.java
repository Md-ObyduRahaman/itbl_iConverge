package com.example.demo;

public class LocationEditM {
	private int pLOCATION_ID;
	private String pLOCATION_CODE;
	private String pLOCATION_NAME;
	private String status;
	private String pZONE_DESC;
	private String pCIRCLE_DESC;
	private String pDIV_DESC;
	private String pCOMP_CNTR_NAME;
	private String pZONE_CODE;
	private String pCIRCLE_CODE;
	private String pDIV_CODE;
	private String pSUB_DIV_CODE;
	private String pCOMP_CNTR_CODE;
	private String pOFFICE_CODE;

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

	public String getpZONE_CODE() {
		return pZONE_CODE;
	}

	public void setpZONE_CODE(String pZONE_CODE) {
		this.pZONE_CODE = pZONE_CODE;
	}

	public String getpCIRCLE_CODE() {
		return pCIRCLE_CODE;
	}

	public void setpCIRCLE_CODE(String pCIRCLE_CODE) {
		this.pCIRCLE_CODE = pCIRCLE_CODE;
	}

	public String getpDIV_CODE() {
		return pDIV_CODE;
	}

	public void setpDIV_CODE(String pDIV_CODE) {
		this.pDIV_CODE = pDIV_CODE;
	}

	public String getpSUB_DIV_CODE() {
		return pSUB_DIV_CODE;
	}

	public void setpSUB_DIV_CODE(String pSUB_DIV_CODE) {
		this.pSUB_DIV_CODE = pSUB_DIV_CODE;
	}

	public String getpCOMP_CNTR_CODE() {
		return pCOMP_CNTR_CODE;
	}

	public void setpCOMP_CNTR_CODE(String pCOMP_CNTR_CODE) {
		this.pCOMP_CNTR_CODE = pCOMP_CNTR_CODE;
	}

	public String getpOFFICE_CODE() {
		return pOFFICE_CODE;
	}

	public void setpOFFICE_CODE(String pOFFICE_CODE) {
		this.pOFFICE_CODE = pOFFICE_CODE;
	}

	@Override
	public String toString() {
		return "LocationEditM [pLOCATION_ID=" + pLOCATION_ID + ", pLOCATION_CODE=" + pLOCATION_CODE
				+ ", pLOCATION_NAME=" + pLOCATION_NAME + ", status=" + status + ", pZONE_DESC=" + pZONE_DESC
				+ ", pCIRCLE_DESC=" + pCIRCLE_DESC + ", pDIV_DESC=" + pDIV_DESC + ", pCOMP_CNTR_NAME=" + pCOMP_CNTR_NAME
				+ ", pZONE_CODE=" + pZONE_CODE + ", pCIRCLE_CODE=" + pCIRCLE_CODE + ", pDIV_CODE=" + pDIV_CODE
				+ ", pSUB_DIV_CODE=" + pSUB_DIV_CODE + ", pCOMP_CNTR_CODE=" + pCOMP_CNTR_CODE + ", pOFFICE_CODE="
				+ pOFFICE_CODE + "]";
	}

	public LocationEditM(int pLOCATION_ID, String pLOCATION_CODE, String pLOCATION_NAME, String status,
			String pZONE_DESC, String pCIRCLE_DESC, String pDIV_DESC, String pCOMP_CNTR_NAME, String pZONE_CODE,
			String pCIRCLE_CODE, String pDIV_CODE, String pSUB_DIV_CODE, String pCOMP_CNTR_CODE, String pOFFICE_CODE) {
		super();
		this.pLOCATION_ID = pLOCATION_ID;
		this.pLOCATION_CODE = pLOCATION_CODE;
		this.pLOCATION_NAME = pLOCATION_NAME;
		this.status = status;
		this.pZONE_DESC = pZONE_DESC;
		this.pCIRCLE_DESC = pCIRCLE_DESC;
		this.pDIV_DESC = pDIV_DESC;
		this.pCOMP_CNTR_NAME = pCOMP_CNTR_NAME;
		this.pZONE_CODE = pZONE_CODE;
		this.pCIRCLE_CODE = pCIRCLE_CODE;
		this.pDIV_CODE = pDIV_CODE;
		this.pSUB_DIV_CODE = pSUB_DIV_CODE;
		this.pCOMP_CNTR_CODE = pCOMP_CNTR_CODE;
		this.pOFFICE_CODE = pOFFICE_CODE;
	}

	public LocationEditM() {
		super();
		// TODO Auto-generated constructor stub
	}

}
