package com.example.demo;

public class SMS_LOG_DETAILS
{
	public String MOBILE_NO, CREATE_BY, SEND_TIME, SMS_BODY, CREATE_DATE, STATUS;

	public String getMOBILE_NO() {
		return MOBILE_NO;
	}

	public void setMOBILE_NO(String mOBILE_NO) {
		MOBILE_NO = mOBILE_NO;
	}

	public String getCREATE_BY() {
		return CREATE_BY;
	}

	public void setCREATE_BY(String cREATE_BY) {
		CREATE_BY = cREATE_BY;
	}

	public String getSEND_TIME() {
		return SEND_TIME;
	}

	public void setSEND_TIME(String sEND_TIME) {
		SEND_TIME = sEND_TIME;
	}

	public String getSMS_BODY() {
		return SMS_BODY;
	}

	public void setSMS_BODY(String sMS_BODY) {
		SMS_BODY = sMS_BODY;
	}

	public String getCREATE_DATE() {
		return CREATE_DATE;
	}

	public void setCREATE_DATE(String cREATE_DATE) {
		CREATE_DATE = cREATE_DATE;
	}

	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	

	@Override
	public String toString() {
		return "SMS_LOG_DETAILS [MOBILE_NO=" + MOBILE_NO + ", CREATE_BY=" + CREATE_BY + ", SEND_TIME=" + SEND_TIME
				+ ", SMS_BODY=" + SMS_BODY + ", CREATE_DATE=" + CREATE_DATE + ", STATUS=" + STATUS + "]";
	}

	public SMS_LOG_DETAILS(String mOBILE_NO, String cREATE_BY, String sEND_TIME, String sMS_BODY, String cREATE_DATE,
			String sTATUS) {
		super();
		MOBILE_NO = mOBILE_NO;
		CREATE_BY = cREATE_BY;
		SEND_TIME = sEND_TIME;
		SMS_BODY = sMS_BODY;
		CREATE_DATE = cREATE_DATE;
		STATUS = sTATUS;
	}



	public SMS_LOG_DETAILS() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
