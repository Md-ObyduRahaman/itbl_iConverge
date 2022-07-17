package com.example.demo;

public class Dpd_Illigal_Use {
	
	private String pMON;
	private String pNO_OF_DC_LINE;
	private String pNO_OF_CASE_FILED;
	private String pFINE_REALISE;
	public String getpMON() {
		return pMON;
	}
	public void setpMON(String pMON) {
		this.pMON = pMON;
	}
	public String getpNO_OF_DC_LINE() {
		return pNO_OF_DC_LINE;
	}
	public void setpNO_OF_DC_LINE(String pNO_OF_DC_LINE) {
		this.pNO_OF_DC_LINE = pNO_OF_DC_LINE;
	}
	public String getpNO_OF_CASE_FILED() {
		return pNO_OF_CASE_FILED;
	}
	public void setpNO_OF_CASE_FILED(String pNO_OF_CASE_FILED) {
		this.pNO_OF_CASE_FILED = pNO_OF_CASE_FILED;
	}
	public String getpFINE_REALISE() {
		return pFINE_REALISE;
	}
	public void setpFINE_REALISE(String pFINE_REALISE) {
		this.pFINE_REALISE = pFINE_REALISE;
	}
	@Override
	public String toString() {
		return "Dpd_Illigal_Use [pMON=" + pMON + ", pNO_OF_DC_LINE=" + pNO_OF_DC_LINE + ", pNO_OF_CASE_FILED="
				+ pNO_OF_CASE_FILED + ", pFINE_REALISE=" + pFINE_REALISE + "]";
	}
	public Dpd_Illigal_Use(String pMON, String pNO_OF_DC_LINE, String pNO_OF_CASE_FILED, String pFINE_REALISE) {
		super();
		this.pMON = pMON;
		this.pNO_OF_DC_LINE = pNO_OF_DC_LINE;
		this.pNO_OF_CASE_FILED = pNO_OF_CASE_FILED;
		this.pFINE_REALISE = pFINE_REALISE;
	}
	public Dpd_Illigal_Use() {
		super();
		// TODO Auto-generated constructor stub
	}

}
