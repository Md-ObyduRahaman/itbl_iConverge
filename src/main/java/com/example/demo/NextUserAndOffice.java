package com.example.demo;

public class NextUserAndOffice {
	
	String NEXT_USER,NEXT_OFFICE_CODE;

	public NextUserAndOffice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NextUserAndOffice(String nEXT_USER, String nEXT_OFFICE_CODE) {
		super();
		NEXT_USER = nEXT_USER;
		NEXT_OFFICE_CODE = nEXT_OFFICE_CODE;
	}

	public String getNEXT_USER() {
		return NEXT_USER;
	}

	public void setNEXT_USER(String nEXT_USER) {
		NEXT_USER = nEXT_USER;
	}

	public String getNEXT_OFFICE_CODE() {
		return NEXT_OFFICE_CODE;
	}

	public void setNEXT_OFFICE_CODE(String nEXT_OFFICE_CODE) {
		NEXT_OFFICE_CODE = nEXT_OFFICE_CODE;
	}

	@Override
	public String toString() {
		return "NextUserAndOffice [NEXT_USER=" + NEXT_USER + ", NEXT_OFFICE_CODE=" + NEXT_OFFICE_CODE + "]";
	}
	
	

}
