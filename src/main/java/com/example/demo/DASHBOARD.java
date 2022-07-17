package com.example.demo;

public class DASHBOARD {
	private String HDR;
	private String LINEX;
	private String NET_GEN;
	public DASHBOARD() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DASHBOARD(String hDR, String lINEX, String nET_GEN) {
		super();
		HDR = hDR;
		LINEX = lINEX;
		NET_GEN = nET_GEN;
	}
	public String getHDR() {
		return HDR;
	}
	public void setHDR(String hDR) {
		HDR = hDR;
	}
	public String getLINEX() {
		return LINEX;
	}
	public void setLINEX(String lINEX) {
		LINEX = lINEX;
	}
	public String getNET_GEN() {
		return NET_GEN;
	}
	public void setNET_GEN(String nET_GEN) {
		NET_GEN = nET_GEN;
	}
	@Override
	public String toString() {
		return "DASHBOARD [HDR=" + HDR + ", LINEX=" + LINEX + ", NET_GEN=" + NET_GEN + "]";
	}
	
	
}
