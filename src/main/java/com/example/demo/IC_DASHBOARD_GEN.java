package com.example.demo;

public class IC_DASHBOARD_GEN {
	
	private String area;
	private String owner;
	private String owner_type;
	private String grid;
	private String bill;
	private String power_plant;
	private String report;
	private String fuel;
	public IC_DASHBOARD_GEN() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IC_DASHBOARD_GEN(String area, String owner, String owner_type, String grid, String bill, String power_plant,
			String report, String fuel) {
		super();
		this.area = area;
		this.owner = owner;
		this.owner_type = owner_type;
		this.grid = grid;
		this.bill = bill;
		this.power_plant = power_plant;
		this.report = report;
		this.fuel = fuel;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwner_type() {
		return owner_type;
	}
	public void setOwner_type(String owner_type) {
		this.owner_type = owner_type;
	}
	public String getGrid() {
		return grid;
	}
	public void setGrid(String grid) {
		this.grid = grid;
	}
	public String getBill() {
		return bill;
	}
	public void setBill(String bill) {
		this.bill = bill;
	}
	public String getPower_plant() {
		return power_plant;
	}
	public void setPower_plant(String power_plant) {
		this.power_plant = power_plant;
	}
	public String getReport() {
		return report;
	}
	public void setReport(String report) {
		this.report = report;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	@Override
	public String toString() {
		return "IC_DASHBOARD_GEN [area=" + area + ", owner=" + owner + ", owner_type=" + owner_type + ", grid=" + grid
				+ ", bill=" + bill + ", power_plant=" + power_plant + ", report=" + report + ", fuel=" + fuel + "]";
	}
	
	
	

	

}
