package com.example.demo;

public class IC_ES_STAT_BILL_COLL_REC_DPDC {

	String YRMON, TOTENRGSALE, TOTBILLAMT, COLL, REC_ENRG_PFC, REC_PFC_132KV, REC_ENRG,REMARKS;

	public IC_ES_STAT_BILL_COLL_REC_DPDC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IC_ES_STAT_BILL_COLL_REC_DPDC(String yRMON, String tOTENRGSALE, String tOTBILLAMT, String cOLL,
			String rEC_ENRG_PFC, String rEC_PFC_132KV, String rEC_ENRG, String rEMARKS) {
		super();
		YRMON = yRMON;
		TOTENRGSALE = tOTENRGSALE;
		TOTBILLAMT = tOTBILLAMT;
		COLL = cOLL;
		REC_ENRG_PFC = rEC_ENRG_PFC;
		REC_PFC_132KV = rEC_PFC_132KV;
		REC_ENRG = rEC_ENRG;
		REMARKS = rEMARKS;
	}

	public String getYRMON() {
		return YRMON;
	}

	public void setYRMON(String yRMON) {
		YRMON = yRMON;
	}

	public String getTOTENRGSALE() {
		return TOTENRGSALE;
	}

	public void setTOTENRGSALE(String tOTENRGSALE) {
		TOTENRGSALE = tOTENRGSALE;
	}

	public String getTOTBILLAMT() {
		return TOTBILLAMT;
	}

	public void setTOTBILLAMT(String tOTBILLAMT) {
		TOTBILLAMT = tOTBILLAMT;
	}

	public String getCOLL() {
		return COLL;
	}

	public void setCOLL(String cOLL) {
		COLL = cOLL;
	}

	public String getREC_ENRG_PFC() {
		return REC_ENRG_PFC;
	}

	public void setREC_ENRG_PFC(String rEC_ENRG_PFC) {
		REC_ENRG_PFC = rEC_ENRG_PFC;
	}

	public String getREC_PFC_132KV() {
		return REC_PFC_132KV;
	}

	public void setREC_PFC_132KV(String rEC_PFC_132KV) {
		REC_PFC_132KV = rEC_PFC_132KV;
	}

	public String getREC_ENRG() {
		return REC_ENRG;
	}

	public void setREC_ENRG(String rEC_ENRG) {
		REC_ENRG = rEC_ENRG;
	}

	public String getREMARKS() {
		return REMARKS;
	}

	public void setREMARKS(String rEMARKS) {
		REMARKS = rEMARKS;
	}

	@Override
	public String toString() {
		return "IC_ES_STAT_BILL_COLL_REC_DPDC [YRMON=" + YRMON + ", TOTENRGSALE=" + TOTENRGSALE + ", TOTBILLAMT="
				+ TOTBILLAMT + ", COLL=" + COLL + ", REC_ENRG_PFC=" + REC_ENRG_PFC + ", REC_PFC_132KV=" + REC_PFC_132KV
				+ ", REC_ENRG=" + REC_ENRG + ", REMARKS=" + REMARKS + "]";
	}

	

}
