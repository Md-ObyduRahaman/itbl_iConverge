package com.example.demo;

public class Reset {
	
	private String p_User_Id;
	private String p_Password;
	private String p_New_Pass;
	private String p_confirm_Pass;
	@Override
	public String toString() {
		return "Reset [p_User_Id=" + p_User_Id + ", p_Password=" + p_Password + ", p_New_Pass=" + p_New_Pass
				+ ", p_confirm_Pass=" + p_confirm_Pass + "]";
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
	public String getP_New_Pass() {
		return p_New_Pass;
	}
	public void setP_New_Pass(String p_New_Pass) {
		this.p_New_Pass = p_New_Pass;
	}
	public String getP_confirm_Pass() {
		return p_confirm_Pass;
	}
	public void setP_confirm_Pass(String p_confirm_Pass) {
		this.p_confirm_Pass = p_confirm_Pass;
	}
	public Reset(String p_User_Id, String p_Password, String p_New_Pass, String p_confirm_Pass) {
		super();
		this.p_User_Id = p_User_Id;
		this.p_Password = p_Password;
		this.p_New_Pass = p_New_Pass;
		this.p_confirm_Pass = p_confirm_Pass;
	}
	public Reset() {
		super();
		// TODO Auto-generated constructor stub
	}

}
