package com.example.demo;

public class MIS_LOC_CAT_WISE_SUMMARY
{
	String ZONE_NAME, CIRCLE_NAME, LOCATION_NAME, NO_OF_ACTIVE_CONS, IMPORT_MKWH, SALE_MKWH, DIST_SYS_LOSS,
	NET_BILL_MTK, NET_COLL_MTK, CB_RATIO, CI_RATIO, BILL_RATE, REC_AMT, EQM;

	public String getZONE_NAME() {
		return ZONE_NAME;
	}

	public void setZONE_NAME(String zONE_NAME) {
		ZONE_NAME = zONE_NAME;
	}

	public String getCIRCLE_NAME() {
		return CIRCLE_NAME;
	}

	public void setCIRCLE_NAME(String cIRCLE_NAME) {
		CIRCLE_NAME = cIRCLE_NAME;
	}

	public String getLOCATION_NAME() {
		return LOCATION_NAME;
	}

	public void setLOCATION_NAME(String lOCATION_NAME) {
		LOCATION_NAME = lOCATION_NAME;
	}

	public String getNO_OF_ACTIVE_CONS() {
		return NO_OF_ACTIVE_CONS;
	}

	public void setNO_OF_ACTIVE_CONS(String nO_OF_ACTIVE_CONS) {
		NO_OF_ACTIVE_CONS = nO_OF_ACTIVE_CONS;
	}

	public String getIMPORT_MKWH() {
		return IMPORT_MKWH;
	}

	public void setIMPORT_MKWH(String iMPORT_MKWH) {
		IMPORT_MKWH = iMPORT_MKWH;
	}

	public String getSALE_MKWH() {
		return SALE_MKWH;
	}

	public void setSALE_MKWH(String sALE_MKWH) {
		SALE_MKWH = sALE_MKWH;
	}

	public String getDIST_SYS_LOSS() {
		return DIST_SYS_LOSS;
	}

	public void setDIST_SYS_LOSS(String dIST_SYS_LOSS) {
		DIST_SYS_LOSS = dIST_SYS_LOSS;
	}

	public String getNET_BILL_MTK() {
		return NET_BILL_MTK;
	}

	public void setNET_BILL_MTK(String nET_BILL_MTK) {
		NET_BILL_MTK = nET_BILL_MTK;
	}

	public String getNET_COLL_MTK() {
		return NET_COLL_MTK;
	}

	public void setNET_COLL_MTK(String nET_COLL_MTK) {
		NET_COLL_MTK = nET_COLL_MTK;
	}

	public String getCB_RATIO() {
		return CB_RATIO;
	}

	public void setCB_RATIO(String cB_RATIO) {
		CB_RATIO = cB_RATIO;
	}

	public String getCI_RATIO() {
		return CI_RATIO;
	}

	public void setCI_RATIO(String cI_RATIO) {
		CI_RATIO = cI_RATIO;
	}

	public String getBILL_RATE() {
		return BILL_RATE;
	}

	public void setBILL_RATE(String bILL_RATE) {
		BILL_RATE = bILL_RATE;
	}

	public String getREC_AMT() {
		return REC_AMT;
	}

	public void setREC_AMT(String rEC_AMT) {
		REC_AMT = rEC_AMT;
	}

	public String getEQM() {
		return EQM;
	}

	public void setEQM(String eQM) {
		EQM = eQM;
	}

	@Override
	public String toString() {
		return "MIS_LOC_CAT_WISE_SUMMARY [ZONE_NAME=" + ZONE_NAME + ", CIRCLE_NAME=" + CIRCLE_NAME + ", LOCATION_NAME="
				+ LOCATION_NAME + ", NO_OF_ACTIVE_CONS=" + NO_OF_ACTIVE_CONS + ", IMPORT_MKWH=" + IMPORT_MKWH
				+ ", SALE_MKWH=" + SALE_MKWH + ", DIST_SYS_LOSS=" + DIST_SYS_LOSS + ", NET_BILL_MTK=" + NET_BILL_MTK
				+ ", NET_COLL_MTK=" + NET_COLL_MTK + ", CB_RATIO=" + CB_RATIO + ", CI_RATIO=" + CI_RATIO
				+ ", BILL_RATE=" + BILL_RATE + ", REC_AMT=" + REC_AMT + ", EQM=" + EQM + "]";
	}

	public MIS_LOC_CAT_WISE_SUMMARY(String zONE_NAME, String cIRCLE_NAME, String lOCATION_NAME,
			String nO_OF_ACTIVE_CONS, String iMPORT_MKWH, String sALE_MKWH, String dIST_SYS_LOSS, String nET_BILL_MTK,
			String nET_COLL_MTK, String cB_RATIO, String cI_RATIO, String bILL_RATE, String rEC_AMT, String eQM) {
		super();
		ZONE_NAME = zONE_NAME;
		CIRCLE_NAME = cIRCLE_NAME;
		LOCATION_NAME = lOCATION_NAME;
		NO_OF_ACTIVE_CONS = nO_OF_ACTIVE_CONS;
		IMPORT_MKWH = iMPORT_MKWH;
		SALE_MKWH = sALE_MKWH;
		DIST_SYS_LOSS = dIST_SYS_LOSS;
		NET_BILL_MTK = nET_BILL_MTK;
		NET_COLL_MTK = nET_COLL_MTK;
		CB_RATIO = cB_RATIO;
		CI_RATIO = cI_RATIO;
		BILL_RATE = bILL_RATE;
		REC_AMT = rEC_AMT;
		EQM = eQM;
	}

	public MIS_LOC_CAT_WISE_SUMMARY() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
