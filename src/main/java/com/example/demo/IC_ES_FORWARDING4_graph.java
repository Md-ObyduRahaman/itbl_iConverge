package com.example.demo;

public class IC_ES_FORWARDING4_graph {

	private String  YEAR_CODE;
	private String  IMPORT_MKWH;
	private String  SALE_MKWH;
	private String  DIST_SYS_LOSS;
	private String  NET_BILL_MTK;
	private String  NET_COLL_MTK;
	private String  CB_RATIO;
	private String  CI_RATIO;
	public IC_ES_FORWARDING4_graph() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_ES_FORWARDING4_graph(String yEAR_CODE, String iMPORT_MKWH, String sALE_MKWH, String dIST_SYS_LOSS,
			String nET_BILL_MTK, String nET_COLL_MTK, String cB_RATIO, String cI_RATIO) {
		super();
		YEAR_CODE = yEAR_CODE;
		IMPORT_MKWH = iMPORT_MKWH;
		SALE_MKWH = sALE_MKWH;
		DIST_SYS_LOSS = dIST_SYS_LOSS;
		NET_BILL_MTK = nET_BILL_MTK;
		NET_COLL_MTK = nET_COLL_MTK;
		CB_RATIO = cB_RATIO;
		CI_RATIO = cI_RATIO;
	}
	public String getYEAR_CODE() {
		return YEAR_CODE;
	}
	public void setYEAR_CODE(String yEAR_CODE) {
		YEAR_CODE = yEAR_CODE;
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
		return "IC_ES_FORWARDING4_graph [YEAR_CODE=" + YEAR_CODE + ", IMPORT_MKWH=" + IMPORT_MKWH + ", SALE_MKWH="
				+ SALE_MKWH + ", DIST_SYS_LOSS=" + DIST_SYS_LOSS + ", NET_BILL_MTK=" + NET_BILL_MTK + ", NET_COLL_MTK="
				+ NET_COLL_MTK + ", CB_RATIO=" + CB_RATIO + ", CI_RATIO=" + CI_RATIO + "]";
	}
	
	

	
	
	
}
