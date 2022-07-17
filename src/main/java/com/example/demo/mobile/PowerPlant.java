package com.example.demo.mobile;

public class PowerPlant {
	private String pp_code,pp_name;

	public PowerPlant(String pp_code, String pp_name) {
		super();
		this.pp_code = pp_code;
		this.pp_name = pp_name;
	}

	public String getPp_code() {
		return pp_code;
	}

	public void setPp_code(String pp_code) {
		this.pp_code = pp_code;
	}

	public String getPp_name() {
		return pp_name;
	}

	public void setPp_name(String pp_name) {
		this.pp_name = pp_name;
	}
	
	

}
