package com.example.demo;

public class Dpd_Rc_Dc_St {
	
	private String pMON;
	private String pNO_OF_DC_LINE;
	private String pCOLL_AGAINST_DC;
	private String pNO_OF_RC_LINE;
	private String pCOLL_AGAINST_RC;
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
	public String getpCOLL_AGAINST_DC() {
		return pCOLL_AGAINST_DC;
	}
	public void setpCOLL_AGAINST_DC(String pCOLL_AGAINST_DC) {
		this.pCOLL_AGAINST_DC = pCOLL_AGAINST_DC;
	}
	public String getpNO_OF_RC_LINE() {
		return pNO_OF_RC_LINE;
	}
	public void setpNO_OF_RC_LINE(String pNO_OF_RC_LINE) {
		this.pNO_OF_RC_LINE = pNO_OF_RC_LINE;
	}
	public String getpCOLL_AGAINST_RC() {
		return pCOLL_AGAINST_RC;
	}
	public void setpCOLL_AGAINST_RC(String pCOLL_AGAINST_RC) {
		this.pCOLL_AGAINST_RC = pCOLL_AGAINST_RC;
	}
	@Override
	public String toString() {
		return "Dpd_Rc_Dc_St [pMON=" + pMON + ", pNO_OF_DC_LINE=" + pNO_OF_DC_LINE + ", pCOLL_AGAINST_DC="
				+ pCOLL_AGAINST_DC + ", pNO_OF_RC_LINE=" + pNO_OF_RC_LINE + ", pCOLL_AGAINST_RC=" + pCOLL_AGAINST_RC
				+ "]";
	}
	public Dpd_Rc_Dc_St(String pMON, String pNO_OF_DC_LINE, String pCOLL_AGAINST_DC, String pNO_OF_RC_LINE,
			String pCOLL_AGAINST_RC) {
		super();
		this.pMON = pMON;
		this.pNO_OF_DC_LINE = pNO_OF_DC_LINE;
		this.pCOLL_AGAINST_DC = pCOLL_AGAINST_DC;
		this.pNO_OF_RC_LINE = pNO_OF_RC_LINE;
		this.pCOLL_AGAINST_RC = pCOLL_AGAINST_RC;
	}
	public Dpd_Rc_Dc_St() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
