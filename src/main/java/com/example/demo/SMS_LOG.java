package com.example.demo;

import org.springframework.format.annotation.DateTimeFormat;

public class SMS_LOG
{
	
	String FROM_DATE;
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	String TO_DATE;

	public String getFROM_DATE() {
		return FROM_DATE;
	}

	public void setFROM_DATE(String fROM_DATE) {
		FROM_DATE = fROM_DATE;
	}

	public String getTO_DATE() {
		return TO_DATE;
	}

	public void setTO_DATE(String tO_DATE) {
		TO_DATE = tO_DATE;
	}

	@Override
	public String toString() {
		return "SMS_LOG [FROM_DATE=" + FROM_DATE + ", TO_DATE=" + TO_DATE + "]";
	}

	public SMS_LOG(String fROM_DATE, String tO_DATE) {
		super();
		FROM_DATE = fROM_DATE;
		TO_DATE = tO_DATE;
	}

	public SMS_LOG() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
