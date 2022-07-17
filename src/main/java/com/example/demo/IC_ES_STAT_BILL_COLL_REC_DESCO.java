package com.example.demo;

public class IC_ES_STAT_BILL_COLL_REC_DESCO {
  
	String YRMON,Enrg_Sale,Bill_AMT,Coll,Rec_Enrg_Pfc,Rec_Lps,Rec_Tot;

	public IC_ES_STAT_BILL_COLL_REC_DESCO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IC_ES_STAT_BILL_COLL_REC_DESCO(String yRMON, String enrg_Sale, String bill_AMT, String coll,
			String rec_Enrg_Pfc, String rec_Lps, String rec_Tot) {
		super();
		YRMON = yRMON;
		Enrg_Sale = enrg_Sale;
		Bill_AMT = bill_AMT;
		Coll = coll;
		Rec_Enrg_Pfc = rec_Enrg_Pfc;
		Rec_Lps = rec_Lps;
		Rec_Tot = rec_Tot;
	}

	public String getYRMON() {
		return YRMON;
	}

	public void setYRMON(String yRMON) {
		YRMON = yRMON;
	}

	public String getEnrg_Sale() {
		return Enrg_Sale;
	}

	public void setEnrg_Sale(String enrg_Sale) {
		Enrg_Sale = enrg_Sale;
	}

	public String getBill_AMT() {
		return Bill_AMT;
	}

	public void setBill_AMT(String bill_AMT) {
		Bill_AMT = bill_AMT;
	}

	public String getColl() {
		return Coll;
	}

	public void setColl(String coll) {
		Coll = coll;
	}

	public String getRec_Enrg_Pfc() {
		return Rec_Enrg_Pfc;
	}

	public void setRec_Enrg_Pfc(String rec_Enrg_Pfc) {
		Rec_Enrg_Pfc = rec_Enrg_Pfc;
	}

	public String getRec_Lps() {
		return Rec_Lps;
	}

	public void setRec_Lps(String rec_Lps) {
		Rec_Lps = rec_Lps;
	}

	public String getRec_Tot() {
		return Rec_Tot;
	}

	public void setRec_Tot(String rec_Tot) {
		Rec_Tot = rec_Tot;
	}

	@Override
	public String toString() {
		return "IC_ES_STAT_BILL_COLL_REC_DESCO [YRMON=" + YRMON + ", Enrg_Sale=" + Enrg_Sale + ", Bill_AMT=" + Bill_AMT
				+ ", Coll=" + Coll + ", Rec_Enrg_Pfc=" + Rec_Enrg_Pfc + ", Rec_Lps=" + Rec_Lps + ", Rec_Tot=" + Rec_Tot
				+ "]";
	}

	
}
