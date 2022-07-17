package com.example.demo;

public class Month {
	private String Month1;
	private String Month2;
	private String Month3;
	private String Month4;
	private String Month5;
	private String Month6;
	public String getMonth1() {
		return Month1;
	}
	public void setMonth1(String month1) {
		Month1 = month1;
	}
	public String getMonth2() {
		return Month2;
	}
	public void setMonth2(String month2) {
		Month2 = month2;
	}
	public String getMonth3() {
		return Month3;
	}
	public void setMonth3(String month3) {
		Month3 = month3;
	}
	public String getMonth4() {
		return Month4;
	}
	public void setMonth4(String month4) {
		Month4 = month4;
	}
	public String getMonth5() {
		return Month5;
	}
	public void setMonth5(String month5) {
		Month5 = month5;
	}
	public String getMonth6() {
		return Month6;
	}
	public void setMonth6(String month6) {
		Month6 = month6;
	}
	@Override
	public String toString() {
		return "Month [Month1=" + Month1 + ", Month2=" + Month2 + ", Month3=" + Month3 + ", Month4=" + Month4
				+ ", Month5=" + Month5 + ", Month6=" + Month6 + "]";
	}
	public Month(String month1, String month2, String month3, String month4, String month5, String month6) {
		super();
		Month1 = month1;
		Month2 = month2;
		Month3 = month3;
		Month4 = month4;
		Month5 = month5;
		Month6 = month6;
	}
	public Month() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
