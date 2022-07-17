package com.example.demo;

public class InsLocation {

	private String code;
	private String name;
	private String zone;
	private String circle;
	private String div;
	private String subDiv;
	private String computerSec;
	private String officeCode;
	private String status;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getSubDiv() {
		return subDiv;
	}

	public void setSubDiv(String subDiv) {
		this.subDiv = subDiv;
	}

	public String getComputerSec() {
		return computerSec;
	}

	public void setComputerSec(String computerSec) {
		this.computerSec = computerSec;
	}

	public String getOfficeCode() {
		return officeCode;
	}

	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "InsLocation [code=" + code + ", name=" + name + ", zone=" + zone + ", circle=" + circle + ", div=" + div
				+ ", subDiv=" + subDiv + ", computerSec=" + computerSec + ", officeCode=" + officeCode + ", status="
				+ status + "]";
	}

	public InsLocation(String code, String name, String zone, String circle, String div, String subDiv,
			String computerSec, String officeCode, String status) {
		super();
		this.code = code;
		this.name = name;
		this.zone = zone;
		this.circle = circle;
		this.div = div;
		this.subDiv = subDiv;
		this.computerSec = computerSec;
		this.officeCode = officeCode;
		this.status = status;
	}

	public InsLocation() {
		super();
		// TODO Auto-generated constructor stub
	}

}
