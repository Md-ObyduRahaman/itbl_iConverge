package com.example.demo;

public class LoginModel {
	private String p_User_Id;
	private String p_Password;
	private String location;
	private String officeCode;
	private String user_name;
	public LoginModel() {

		// TODO Auto-generated constructor stub
	}
	public LoginModel(String p_User_Id, String p_Password, String location, String officeCode, String user_name) {
		super();
		this.p_User_Id = p_User_Id;
		this.p_Password = p_Password;
		this.location = location;
		this.officeCode = officeCode;
		this.user_name = user_name;
	}
	public String getP_User_Id() {
		return p_User_Id;
	}
	public void setP_User_Id(String p_User_Id) {
		this.p_User_Id = p_User_Id;
	}
	public String getP_Password() {
		return p_Password;
	}
	public void setP_Password(String p_Password) {
		this.p_Password = p_Password;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOfficeCode() {
		return officeCode;
	}
	public void setOfficeCode(String officeCode) {
		this.officeCode = officeCode;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	@Override
	public String toString() {
		return "LoginModel [p_User_Id=" + p_User_Id + ", p_Password=" + p_Password + ", location=" + location
				+ ", officeCode=" + officeCode + ", user_name=" + user_name + "]";
	}
	
	

}
