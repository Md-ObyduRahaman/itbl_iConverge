package com.example.demo;

public class IC_ES_FORWARDING1_1 {
	
	private String  MONTH_YR;
	private String GROSS_GEN;
	private String  STATION_USE;
	private String  NET_GEN;
	private String JV;
	private String IPP;
	private String  RENTAL;
	private String  IMPORTED;
	private String  OTHER;
	private String  NET_TOTAL;
	public IC_ES_FORWARDING1_1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_ES_FORWARDING1_1(String mONTH_YR, String gROSS_GEN, String sTATION_USE, String nET_GEN, String jV,
			String iPP, String rENTAL, String iMPORTED, String oTHER, String nET_TOTAL) {
		super();
		MONTH_YR = mONTH_YR;
		GROSS_GEN = gROSS_GEN;
		STATION_USE = sTATION_USE;
		NET_GEN = nET_GEN;
		JV = jV;
		IPP = iPP;
		RENTAL = rENTAL;
		IMPORTED = iMPORTED;
		OTHER = oTHER;
		NET_TOTAL = nET_TOTAL;
	}
	public String getMONTH_YR() {
		return MONTH_YR;
	}
	public void setMONTH_YR(String mONTH_YR) {
		MONTH_YR = mONTH_YR;
	}
	public String getGROSS_GEN() {
		return GROSS_GEN;
	}
	public void setGROSS_GEN(String gROSS_GEN) {
		GROSS_GEN = gROSS_GEN;
	}
	public String getSTATION_USE() {
		return STATION_USE;
	}
	public void setSTATION_USE(String sTATION_USE) {
		STATION_USE = sTATION_USE;
	}
	public String getNET_GEN() {
		return NET_GEN;
	}
	public void setNET_GEN(String nET_GEN) {
		NET_GEN = nET_GEN;
	}
	public String getJV() {
		return JV;
	}
	public void setJV(String jV) {
		JV = jV;
	}
	public String getIPP() {
		return IPP;
	}
	public void setIPP(String iPP) {
		IPP = iPP;
	}
	public String getRENTAL() {
		return RENTAL;
	}
	public void setRENTAL(String rENTAL) {
		RENTAL = rENTAL;
	}
	public String getIMPORTED() {
		return IMPORTED;
	}
	public void setIMPORTED(String iMPORTED) {
		IMPORTED = iMPORTED;
	}
	public String getOTHER() {
		return OTHER;
	}
	public void setOTHER(String oTHER) {
		OTHER = oTHER;
	}
	public String getNET_TOTAL() {
		return NET_TOTAL;
	}
	public void setNET_TOTAL(String nET_TOTAL) {
		NET_TOTAL = nET_TOTAL;
	}
	@Override
	public String toString() {
		return "IC_ES_FORWARDING1_1 [MONTH_YR=" + MONTH_YR + ", GROSS_GEN=" + GROSS_GEN + ", STATION_USE=" + STATION_USE
				+ ", NET_GEN=" + NET_GEN + ", JV=" + JV + ", IPP=" + IPP + ", RENTAL=" + RENTAL + ", IMPORTED="
				+ IMPORTED + ", OTHER=" + OTHER + ", NET_TOTAL=" + NET_TOTAL + "]";
	}
	
	
	
	
	

}
