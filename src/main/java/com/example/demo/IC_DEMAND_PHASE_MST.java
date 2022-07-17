package com.example.demo;

public class IC_DEMAND_PHASE_MST {
	private String DP_CODE;
	private String DEMAND_PHASE;
	private int SRL_NO;
	private String STATUS;
	private int DP_ID;
	public IC_DEMAND_PHASE_MST() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_DEMAND_PHASE_MST(String dP_CODE, String dEMAND_PHASE, int sRL_NO, String sTATUS, int dP_ID) {
		super();
		DP_CODE = dP_CODE;
		DEMAND_PHASE = dEMAND_PHASE;
		SRL_NO = sRL_NO;
		STATUS = sTATUS;
		DP_ID = dP_ID;
	}
	public String getDP_CODE() {
		return DP_CODE;
	}
	public void setDP_CODE(String dP_CODE) {
		DP_CODE = dP_CODE;
	}
	public String getDEMAND_PHASE() {
		return DEMAND_PHASE;
	}
	public void setDEMAND_PHASE(String dEMAND_PHASE) {
		DEMAND_PHASE = dEMAND_PHASE;
	}
	public int getSRL_NO() {
		return SRL_NO;
	}
	public void setSRL_NO(int sRL_NO) {
		SRL_NO = sRL_NO;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public int getDP_ID() {
		return DP_ID;
	}
	public void setDP_ID(int dP_ID) {
		DP_ID = dP_ID;
	}
	@Override
	public String toString() {
		return "IC_DEMAND_PHASE_MST [DP_CODE=" + DP_CODE + ", DEMAND_PHASE=" + DEMAND_PHASE + ", SRL_NO=" + SRL_NO
				+ ", STATUS=" + STATUS + ", DP_ID=" + DP_ID + "]";
	}
	
}
