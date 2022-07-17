package com.example.demo;

public class IC_ES_FORWARDING {
	
	private String CURR_MONTH;
	private String  CURR_MONTH_NET_GEN;
	private String CURR_MONTH_ENRG_SALE;
	private String  CURR_MONTH_DIST_LOSS;
	
	private String PREV_MONTH;
	private String PREV_MONTH_NET_GEN;
	
	private String  MONTH_NET_GEN_DIFF;
	
	private String  ISOLATED_GEN;
	
	private String  SALES_INC;
	
	private String  CURR_YR;
	
	private String  PREV_YR;
	
	private String  CUR_YR_NET_GEN;
	
	private String  PREV_YR_NET_GEN;
	
	private String  PREV_YR_MONTH,TOT_NO_BULK_CUST,TOT_NO_REB_CUST,TOT_NO_RETAIL_CUST,TOT_NO_ACTIVE_CUST,REC_BULK_CUST,REC_DESA,
	REC_DPDC,DPDC_EQM,REC_BPDB_RETAIL,EQM_BPDB_RETAIL;
	
 

	public IC_ES_FORWARDING() {
		super();
		// TODO Auto-generated constructor stub
	}



	public IC_ES_FORWARDING(String cURR_MONTH, String cURR_MONTH_NET_GEN, String cURR_MONTH_ENRG_SALE,
			String cURR_MONTH_DIST_LOSS, String pREV_MONTH, String pREV_MONTH_NET_GEN, String mONTH_NET_GEN_DIFF,
			String iSOLATED_GEN, String sALES_INC, String cURR_YR, String pREV_YR, String cUR_YR_NET_GEN,
			String pREV_YR_NET_GEN, String pREV_YR_MONTH, String tOT_NO_BULK_CUST, String tOT_NO_REB_CUST,
			String tOT_NO_RETAIL_CUST, String tOT_NO_ACTIVE_CUST, String rEC_BULK_CUST, String rEC_DESA,
			String rEC_DPDC, String dPDC_EQM, String rEC_BPDB_RETAIL, String eQM_BPDB_RETAIL) {
		super();
		CURR_MONTH = cURR_MONTH;
		CURR_MONTH_NET_GEN = cURR_MONTH_NET_GEN;
		CURR_MONTH_ENRG_SALE = cURR_MONTH_ENRG_SALE;
		CURR_MONTH_DIST_LOSS = cURR_MONTH_DIST_LOSS;
		PREV_MONTH = pREV_MONTH;
		PREV_MONTH_NET_GEN = pREV_MONTH_NET_GEN;
		MONTH_NET_GEN_DIFF = mONTH_NET_GEN_DIFF;
		ISOLATED_GEN = iSOLATED_GEN;
		SALES_INC = sALES_INC;
		CURR_YR = cURR_YR;
		PREV_YR = pREV_YR;
		CUR_YR_NET_GEN = cUR_YR_NET_GEN;
		PREV_YR_NET_GEN = pREV_YR_NET_GEN;
		PREV_YR_MONTH = pREV_YR_MONTH;
		TOT_NO_BULK_CUST = tOT_NO_BULK_CUST;
		TOT_NO_REB_CUST = tOT_NO_REB_CUST;
		TOT_NO_RETAIL_CUST = tOT_NO_RETAIL_CUST;
		TOT_NO_ACTIVE_CUST = tOT_NO_ACTIVE_CUST;
		REC_BULK_CUST = rEC_BULK_CUST;
		REC_DESA = rEC_DESA;
		REC_DPDC = rEC_DPDC;
		DPDC_EQM = dPDC_EQM;
		REC_BPDB_RETAIL = rEC_BPDB_RETAIL;
		EQM_BPDB_RETAIL = eQM_BPDB_RETAIL;
	}



	public String getCURR_MONTH() {
		return CURR_MONTH;
	}



	public void setCURR_MONTH(String cURR_MONTH) {
		CURR_MONTH = cURR_MONTH;
	}



	public String getCURR_MONTH_NET_GEN() {
		return CURR_MONTH_NET_GEN;
	}



	public void setCURR_MONTH_NET_GEN(String cURR_MONTH_NET_GEN) {
		CURR_MONTH_NET_GEN = cURR_MONTH_NET_GEN;
	}



	public String getCURR_MONTH_ENRG_SALE() {
		return CURR_MONTH_ENRG_SALE;
	}



	public void setCURR_MONTH_ENRG_SALE(String cURR_MONTH_ENRG_SALE) {
		CURR_MONTH_ENRG_SALE = cURR_MONTH_ENRG_SALE;
	}



	public String getCURR_MONTH_DIST_LOSS() {
		return CURR_MONTH_DIST_LOSS;
	}



	public void setCURR_MONTH_DIST_LOSS(String cURR_MONTH_DIST_LOSS) {
		CURR_MONTH_DIST_LOSS = cURR_MONTH_DIST_LOSS;
	}



	public String getPREV_MONTH() {
		return PREV_MONTH;
	}



	public void setPREV_MONTH(String pREV_MONTH) {
		PREV_MONTH = pREV_MONTH;
	}



	public String getPREV_MONTH_NET_GEN() {
		return PREV_MONTH_NET_GEN;
	}



	public void setPREV_MONTH_NET_GEN(String pREV_MONTH_NET_GEN) {
		PREV_MONTH_NET_GEN = pREV_MONTH_NET_GEN;
	}



	public String getMONTH_NET_GEN_DIFF() {
		return MONTH_NET_GEN_DIFF;
	}



	public void setMONTH_NET_GEN_DIFF(String mONTH_NET_GEN_DIFF) {
		MONTH_NET_GEN_DIFF = mONTH_NET_GEN_DIFF;
	}



	public String getISOLATED_GEN() {
		return ISOLATED_GEN;
	}



	public void setISOLATED_GEN(String iSOLATED_GEN) {
		ISOLATED_GEN = iSOLATED_GEN;
	}



	public String getSALES_INC() {
		return SALES_INC;
	}



	public void setSALES_INC(String sALES_INC) {
		SALES_INC = sALES_INC;
	}



	public String getCURR_YR() {
		return CURR_YR;
	}



	public void setCURR_YR(String cURR_YR) {
		CURR_YR = cURR_YR;
	}



	public String getPREV_YR() {
		return PREV_YR;
	}



	public void setPREV_YR(String pREV_YR) {
		PREV_YR = pREV_YR;
	}



	public String getCUR_YR_NET_GEN() {
		return CUR_YR_NET_GEN;
	}



	public void setCUR_YR_NET_GEN(String cUR_YR_NET_GEN) {
		CUR_YR_NET_GEN = cUR_YR_NET_GEN;
	}



	public String getPREV_YR_NET_GEN() {
		return PREV_YR_NET_GEN;
	}



	public void setPREV_YR_NET_GEN(String pREV_YR_NET_GEN) {
		PREV_YR_NET_GEN = pREV_YR_NET_GEN;
	}



	public String getPREV_YR_MONTH() {
		return PREV_YR_MONTH;
	}



	public void setPREV_YR_MONTH(String pREV_YR_MONTH) {
		PREV_YR_MONTH = pREV_YR_MONTH;
	}



	public String getTOT_NO_BULK_CUST() {
		return TOT_NO_BULK_CUST;
	}



	public void setTOT_NO_BULK_CUST(String tOT_NO_BULK_CUST) {
		TOT_NO_BULK_CUST = tOT_NO_BULK_CUST;
	}



	public String getTOT_NO_REB_CUST() {
		return TOT_NO_REB_CUST;
	}



	public void setTOT_NO_REB_CUST(String tOT_NO_REB_CUST) {
		TOT_NO_REB_CUST = tOT_NO_REB_CUST;
	}



	public String getTOT_NO_RETAIL_CUST() {
		return TOT_NO_RETAIL_CUST;
	}



	public void setTOT_NO_RETAIL_CUST(String tOT_NO_RETAIL_CUST) {
		TOT_NO_RETAIL_CUST = tOT_NO_RETAIL_CUST;
	}



	public String getTOT_NO_ACTIVE_CUST() {
		return TOT_NO_ACTIVE_CUST;
	}



	public void setTOT_NO_ACTIVE_CUST(String tOT_NO_ACTIVE_CUST) {
		TOT_NO_ACTIVE_CUST = tOT_NO_ACTIVE_CUST;
	}



	public String getREC_BULK_CUST() {
		return REC_BULK_CUST;
	}



	public void setREC_BULK_CUST(String rEC_BULK_CUST) {
		REC_BULK_CUST = rEC_BULK_CUST;
	}



	public String getREC_DESA() {
		return REC_DESA;
	}



	public void setREC_DESA(String rEC_DESA) {
		REC_DESA = rEC_DESA;
	}



	public String getREC_DPDC() {
		return REC_DPDC;
	}



	public void setREC_DPDC(String rEC_DPDC) {
		REC_DPDC = rEC_DPDC;
	}



	public String getDPDC_EQM() {
		return DPDC_EQM;
	}



	public void setDPDC_EQM(String dPDC_EQM) {
		DPDC_EQM = dPDC_EQM;
	}



	public String getREC_BPDB_RETAIL() {
		return REC_BPDB_RETAIL;
	}



	public void setREC_BPDB_RETAIL(String rEC_BPDB_RETAIL) {
		REC_BPDB_RETAIL = rEC_BPDB_RETAIL;
	}



	public String getEQM_BPDB_RETAIL() {
		return EQM_BPDB_RETAIL;
	}



	public void setEQM_BPDB_RETAIL(String eQM_BPDB_RETAIL) {
		EQM_BPDB_RETAIL = eQM_BPDB_RETAIL;
	}



	@Override
	public String toString() {
		return "IC_ES_FORWARDING [CURR_MONTH=" + CURR_MONTH + ", CURR_MONTH_NET_GEN=" + CURR_MONTH_NET_GEN
				+ ", CURR_MONTH_ENRG_SALE=" + CURR_MONTH_ENRG_SALE + ", CURR_MONTH_DIST_LOSS=" + CURR_MONTH_DIST_LOSS
				+ ", PREV_MONTH=" + PREV_MONTH + ", PREV_MONTH_NET_GEN=" + PREV_MONTH_NET_GEN + ", MONTH_NET_GEN_DIFF="
				+ MONTH_NET_GEN_DIFF + ", ISOLATED_GEN=" + ISOLATED_GEN + ", SALES_INC=" + SALES_INC + ", CURR_YR="
				+ CURR_YR + ", PREV_YR=" + PREV_YR + ", CUR_YR_NET_GEN=" + CUR_YR_NET_GEN + ", PREV_YR_NET_GEN="
				+ PREV_YR_NET_GEN + ", PREV_YR_MONTH=" + PREV_YR_MONTH + ", TOT_NO_BULK_CUST=" + TOT_NO_BULK_CUST
				+ ", TOT_NO_REB_CUST=" + TOT_NO_REB_CUST + ", TOT_NO_RETAIL_CUST=" + TOT_NO_RETAIL_CUST
				+ ", TOT_NO_ACTIVE_CUST=" + TOT_NO_ACTIVE_CUST + ", REC_BULK_CUST=" + REC_BULK_CUST + ", REC_DESA="
				+ REC_DESA + ", REC_DPDC=" + REC_DPDC + ", DPDC_EQM=" + DPDC_EQM + ", REC_BPDB_RETAIL="
				+ REC_BPDB_RETAIL + ", EQM_BPDB_RETAIL=" + EQM_BPDB_RETAIL + "]";
	}

	

}
