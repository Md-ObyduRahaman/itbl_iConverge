package com.example.demo;

public class ModuleDropdownList {
	private String modCode;
	private String modName;
	public String getModCode() {
		return modCode;
	}
	public void setModCode(String modCode) {
		this.modCode = modCode;
	}
	public String getModName() {
		return modName;
	}
	public void setModName(String modName) {
		this.modName = modName;
	}
	@Override
	public String toString() {
		return "ModuleDropdownList [modCode=" + modCode + ", modName=" + modName + "]";
	}
	public ModuleDropdownList(String modCode, String modName) {
		super();
		this.modCode = modCode;
		this.modName = modName;
	}
	public ModuleDropdownList() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
