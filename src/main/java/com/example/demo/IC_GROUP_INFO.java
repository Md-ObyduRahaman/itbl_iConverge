package com.example.demo;

public class IC_GROUP_INFO {
	
	private String GRP_ID;	
	private String GRP_CODE;
	private String GRP_NAME;
	private String USER_TYPE;
	private String USER_TYPE_DESC;
	private String STATUS;
	public IC_GROUP_INFO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_GROUP_INFO(String gRP_ID, String gRP_CODE, String gRP_NAME, String uSER_TYPE, String uSER_TYPE_DESC,
			String sTATUS) {
		super();
		GRP_ID = gRP_ID;
		GRP_CODE = gRP_CODE;
		GRP_NAME = gRP_NAME;
		USER_TYPE = uSER_TYPE;
		USER_TYPE_DESC = uSER_TYPE_DESC;
		STATUS = sTATUS;
	}
	public String getGRP_ID() {
		return GRP_ID;
	}
	public void setGRP_ID(String gRP_ID) {
		GRP_ID = gRP_ID;
	}
	public String getGRP_CODE() {
		return GRP_CODE;
	}
	public void setGRP_CODE(String gRP_CODE) {
		GRP_CODE = gRP_CODE;
	}
	public String getGRP_NAME() {
		return GRP_NAME;
	}
	public void setGRP_NAME(String gRP_NAME) {
		GRP_NAME = gRP_NAME;
	}
	public String getUSER_TYPE() {
		return USER_TYPE;
	}
	public void setUSER_TYPE(String uSER_TYPE) {
		USER_TYPE = uSER_TYPE;
	}
	public String getUSER_TYPE_DESC() {
		return USER_TYPE_DESC;
	}
	public void setUSER_TYPE_DESC(String uSER_TYPE_DESC) {
		USER_TYPE_DESC = uSER_TYPE_DESC;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	@Override
	public String toString() {
		return "IC_GROUP_INFO [GRP_ID=" + GRP_ID + ", GRP_CODE=" + GRP_CODE + ", GRP_NAME=" + GRP_NAME + ", USER_TYPE="
				+ USER_TYPE + ", USER_TYPE_DESC=" + USER_TYPE_DESC + ", STATUS=" + STATUS + "]";
	}

	
}
