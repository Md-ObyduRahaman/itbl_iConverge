package com.example.demo.mobile;

public class SELECT_OWNER {
	private String owner_code,owner_name;

	public SELECT_OWNER(String owner_code, String owner_name) {
		super();
		this.owner_code = owner_code;
		this.owner_name = owner_name;
	}

	public String getOwner_code() {
		return owner_code;
	}

	public void setOwner_code(String owner_code) {
		this.owner_code = owner_code;
	}

	public String getOwner_name() {
		return owner_name;
	}

	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	
	
	

}
