package com.example.demo;

public class DPD_REV_REPORT_GRAPH_MON
{
	String REPORT_LEVEL, BILL_CYCLE_CODE, MONTH_DESC, IMPORT_MKWH, SALE_MKWH, DIST_SYS_LOSS, NET_BILL_MTK, NET_COLL_MTK, CB_RATIO, CI_RATIO;

	
	
	public String getREPORT_LEVEL() {
		return REPORT_LEVEL;
	}

	public void setREPORT_LEVEL(String rEPORT_LEVEL) {
		REPORT_LEVEL = rEPORT_LEVEL;
	}

	public String getBILL_CYCLE_CODE() {
		return BILL_CYCLE_CODE;
	}

	public void setBILL_CYCLE_CODE(String bILL_CYCLE_CODE) {
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
	}

	public String getMONTH_DESC() {
		return MONTH_DESC;
	}

	public void setMONTH_DESC(String mONTH_DESC) {
		MONTH_DESC = mONTH_DESC;
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

	@Override
	public String toString() {
		return "DPD_REV_REPORT_GRAPH_MON [REPORT_LEVEL=" + REPORT_LEVEL + ", BILL_CYCLE_CODE=" + BILL_CYCLE_CODE
				+ ", MONTH_DESC=" + MONTH_DESC + ", IMPORT_MKWH=" + IMPORT_MKWH + ", SALE_MKWH=" + SALE_MKWH
				+ ", DIST_SYS_LOSS=" + DIST_SYS_LOSS + ", NET_BILL_MTK=" + NET_BILL_MTK + ", NET_COLL_MTK="
				+ NET_COLL_MTK + ", CB_RATIO=" + CB_RATIO + ", CI_RATIO=" + CI_RATIO + "]";
	}

	public DPD_REV_REPORT_GRAPH_MON(String rEPORT_LEVEL, String bILL_CYCLE_CODE, String mONTH_DESC, String iMPORT_MKWH,
			String sALE_MKWH, String dIST_SYS_LOSS, String nET_BILL_MTK, String nET_COLL_MTK, String cB_RATIO,
			String cI_RATIO) {
		super();
		REPORT_LEVEL = rEPORT_LEVEL;
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
		MONTH_DESC = mONTH_DESC;
		IMPORT_MKWH = iMPORT_MKWH;
		SALE_MKWH = sALE_MKWH;
		DIST_SYS_LOSS = dIST_SYS_LOSS;
		NET_BILL_MTK = nET_BILL_MTK;
		NET_COLL_MTK = nET_COLL_MTK;
		CB_RATIO = cB_RATIO;
		CI_RATIO = cI_RATIO;
	}

	public DPD_REV_REPORT_GRAPH_MON() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
