package com.example.demo;

public class IC_ES_STAT_BILL_COLL_REC_WZPDCL {
	
	String YRMON,ENRGSALE,PFCSALE,TOTENRGSALE,ENRGBILLAMT,PFCBILLAMT,TOTBILLAMT,COLL,REC_ENRG_PFC,REC_LPS,REC_TOT;

	@Override
	public String toString() {
		return "IC_ES_STAT_BILL_COLL_REC_WZPDCL [YRMON=" + YRMON + ", ENRGSALE=" + ENRGSALE + ", PFCSALE=" + PFCSALE
				+ ", TOTENRGSALE=" + TOTENRGSALE + ", ENRGBILLAMT=" + ENRGBILLAMT + ", PFCBILLAMT=" + PFCBILLAMT
				+ ", TOTBILLAMT=" + TOTBILLAMT + ", COLL=" + COLL + ", REC_ENRG_PFC=" + REC_ENRG_PFC + ", REC_LPS="
				+ REC_LPS + ", REC_TOT=" + REC_TOT + "]";
	}

	public String getYRMON() {
		return YRMON;
	}

	public void setYRMON(String yRMON) {
		YRMON = yRMON;
	}

	public String getENRGSALE() {
		return ENRGSALE;
	}

	public void setENRGSALE(String eNRGSALE) {
		ENRGSALE = eNRGSALE;
	}

	public String getPFCSALE() {
		return PFCSALE;
	}

	public void setPFCSALE(String pFCSALE) {
		PFCSALE = pFCSALE;
	}

	public String getTOTENRGSALE() {
		return TOTENRGSALE;
	}

	public void setTOTENRGSALE(String tOTENRGSALE) {
		TOTENRGSALE = tOTENRGSALE;
	}

	public String getENRGBILLAMT() {
		return ENRGBILLAMT;
	}

	public void setENRGBILLAMT(String eNRGBILLAMT) {
		ENRGBILLAMT = eNRGBILLAMT;
	}

	public String getPFCBILLAMT() {
		return PFCBILLAMT;
	}

	public void setPFCBILLAMT(String pFCBILLAMT) {
		PFCBILLAMT = pFCBILLAMT;
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

	public String getREC_LPS() {
		return REC_LPS;
	}

	public void setREC_LPS(String rEC_LPS) {
		REC_LPS = rEC_LPS;
	}

	public String getREC_TOT() {
		return REC_TOT;
	}

	public void setREC_TOT(String rEC_TOT) {
		REC_TOT = rEC_TOT;
	}

	public IC_ES_STAT_BILL_COLL_REC_WZPDCL(String yRMON, String eNRGSALE, String pFCSALE, String tOTENRGSALE,
			String eNRGBILLAMT, String pFCBILLAMT, String tOTBILLAMT, String cOLL, String rEC_ENRG_PFC, String rEC_LPS,
			String rEC_TOT) {
		super();
		YRMON = yRMON;
		ENRGSALE = eNRGSALE;
		PFCSALE = pFCSALE;
		TOTENRGSALE = tOTENRGSALE;
		ENRGBILLAMT = eNRGBILLAMT;
		PFCBILLAMT = pFCBILLAMT;
		TOTBILLAMT = tOTBILLAMT;
		COLL = cOLL;
		REC_ENRG_PFC = rEC_ENRG_PFC;
		REC_LPS = rEC_LPS;
		REC_TOT = rEC_TOT;
	}

	public IC_ES_STAT_BILL_COLL_REC_WZPDCL() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
