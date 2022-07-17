package com.example.demo;

public class IC_DASHBOARD_DATA {
	private String bill;
	private String zone;
	private String circle;
	private String div;
	private String loc;
	private String RAO;
	private String report;
	public String getBill() {
		return bill;
	}
	public void setBill(String bill) {
		this.bill = bill;
	}
	public String getZone() {
		return zone;
	}
	public void setZone(String zone) {
		this.zone = zone;
	}
	public String getCircle() {
		return circle;
	}
	public void setCircle(String circle) {
		this.circle = circle;
	}
	public String getDiv() {
		return div;
	}
	public void setDiv(String div) {
		this.div = div;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getRAO() {
		return RAO;
	}
	public void setRAO(String rAO) {
		RAO = rAO;
	}
	public String getReport() {
		return report;
	}
	public void setReport(String report) {
		this.report = report;
	}
	public IC_DASHBOARD_DATA(String bill, String zone, String circle, String div, String loc, String rAO,
			String report) {
		super();
		this.bill = bill;
		this.zone = zone;
		this.circle = circle;
		this.div = div;
		this.loc = loc;
		this.RAO = rAO;
		this.report = report;
	}
	public IC_DASHBOARD_DATA() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "IC_DASHBOARD_DATA [bill=" + bill + ", zone=" + zone + ", circle=" + circle + ", div=" + div + ", loc="
				+ loc + ", RAO=" + RAO + ", report=" + report + "]";
	}
	
}

