package com.example.demo;

public class IC_ES_FORWARDING1_3 {
	
	private String  LDC_TYPE_CODE;
	private String  LDC_TYPE_NAME;
	private String  PM_LDC_DATE;
	
	private String   PM_LDC;
	private String CM_LDC_DATE;
	private String CM_LDC;
	
	private String UP_LDC_DATE;
	private String UP_LDC;
	public IC_ES_FORWARDING1_3() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_ES_FORWARDING1_3(String lDC_TYPE_CODE, String lDC_TYPE_NAME, String pM_LDC_DATE, String pM_LDC,
			String cM_LDC_DATE, String cM_LDC, String uP_LDC_DATE, String uP_LDC) {
		super();
		LDC_TYPE_CODE = lDC_TYPE_CODE;
		LDC_TYPE_NAME = lDC_TYPE_NAME;
		PM_LDC_DATE = pM_LDC_DATE;
		PM_LDC = pM_LDC;
		CM_LDC_DATE = cM_LDC_DATE;
		CM_LDC = cM_LDC;
		UP_LDC_DATE = uP_LDC_DATE;
		UP_LDC = uP_LDC;
	}
	public String getLDC_TYPE_CODE() {
		return LDC_TYPE_CODE;
	}
	public void setLDC_TYPE_CODE(String lDC_TYPE_CODE) {
		LDC_TYPE_CODE = lDC_TYPE_CODE;
	}
	public String getLDC_TYPE_NAME() {
		return LDC_TYPE_NAME;
	}
	public void setLDC_TYPE_NAME(String lDC_TYPE_NAME) {
		LDC_TYPE_NAME = lDC_TYPE_NAME;
	}
	public String getPM_LDC_DATE() {
		return PM_LDC_DATE;
	}
	public void setPM_LDC_DATE(String pM_LDC_DATE) {
		PM_LDC_DATE = pM_LDC_DATE;
	}
	public String getPM_LDC() {
		return PM_LDC;
	}
	public void setPM_LDC(String pM_LDC) {
		PM_LDC = pM_LDC;
	}
	public String getCM_LDC_DATE() {
		return CM_LDC_DATE;
	}
	public void setCM_LDC_DATE(String cM_LDC_DATE) {
		CM_LDC_DATE = cM_LDC_DATE;
	}
	public String getCM_LDC() {
		return CM_LDC;
	}
	public void setCM_LDC(String cM_LDC) {
		CM_LDC = cM_LDC;
	}
	public String getUP_LDC_DATE() {
		return UP_LDC_DATE;
	}
	public void setUP_LDC_DATE(String uP_LDC_DATE) {
		UP_LDC_DATE = uP_LDC_DATE;
	}
	public String getUP_LDC() {
		return UP_LDC;
	}
	public void setUP_LDC(String uP_LDC) {
		UP_LDC = uP_LDC;
	}
	@Override
	public String toString() {
		return "IC_ES_FORWARDING1_3 [LDC_TYPE_CODE=" + LDC_TYPE_CODE + ", LDC_TYPE_NAME=" + LDC_TYPE_NAME
				+ ", PM_LDC_DATE=" + PM_LDC_DATE + ", PM_LDC=" + PM_LDC + ", CM_LDC_DATE=" + CM_LDC_DATE + ", CM_LDC="
				+ CM_LDC + ", UP_LDC_DATE=" + UP_LDC_DATE + ", UP_LDC=" + UP_LDC + "]";
	}

	 
	

}
