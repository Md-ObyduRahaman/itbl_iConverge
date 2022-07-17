package com.example.demo;

public class ModUnitBulk {
String unitid,name,grGen,stuse,fusc,STATUS;

public ModUnitBulk() {
	super();
	// TODO Auto-generated constructor stub
}

public ModUnitBulk(String unitid, String name, String grGen, String stuse, String fusc, String sTATUS) {
	super();
	this.unitid = unitid;
	this.name = name;
	this.grGen = grGen;
	this.stuse = stuse;
	this.fusc = fusc;
	STATUS = sTATUS;
}

public String getUnitid() {
	return unitid;
}

public void setUnitid(String unitid) {
	this.unitid = unitid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getGrGen() {
	return grGen;
}

public void setGrGen(String grGen) {
	this.grGen = grGen;
}

public String getStuse() {
	return stuse;
}

public void setStuse(String stuse) {
	this.stuse = stuse;
}

public String getFusc() {
	return fusc;
}

public void setFusc(String fusc) {
	this.fusc = fusc;
}

public String getSTATUS() {
	return STATUS;
}

public void setSTATUS(String sTATUS) {
	STATUS = sTATUS;
}

@Override
public String toString() {
	return "ModUnitBulk [unitid=" + unitid + ", name=" + name + ", grGen=" + grGen + ", stuse=" + stuse + ", fusc="
			+ fusc + ", STATUS=" + STATUS + "]";
}


}