package com.example.demo;

public class IC_REV_PER_ZONE {
	private String tp;
	private String zoneName;
	private String zcName;
	private String prevYear;
	private String currYear;
	private String prvYearSlTarget;
	private String prvYearSlAchive;
	private String prvYearSlUpto;
	private String currYearSlTarget;
	private String currMonthSl;
	private String currYearSlUpto;
	private String currYearCITarget;
	private String prvYearCIUpto;
	private String prvYearCBUpto;
	private String prevYrRec;
	private String prevYrEqm;
	private String currMonthRec;
	private String currMonthEqm;
	private String dateone;
	private String datetwo;
	private String datethree;
	public String getTp() {
		return tp;
	}
	public void setTp(String tp) {
		this.tp = tp;
	}
	public String getZoneName() {
		return zoneName;
	}
	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}
	public String getZcName() {
		return zcName;
	}
	public void setZcName(String zcName) {
		this.zcName = zcName;
	}
	public String getPrevYear() {
		return prevYear;
	}
	public void setPrevYear(String prevYear) {
		this.prevYear = prevYear;
	}
	public String getCurrYear() {
		return currYear;
	}
	public void setCurrYear(String currYear) {
		this.currYear = currYear;
	}
	public String getPrvYearSlTarget() {
		return prvYearSlTarget;
	}
	public void setPrvYearSlTarget(String prvYearSlTarget) {
		this.prvYearSlTarget = prvYearSlTarget;
	}
	public String getPrvYearSlAchive() {
		return prvYearSlAchive;
	}
	public void setPrvYearSlAchive(String prvYearSlAchive) {
		this.prvYearSlAchive = prvYearSlAchive;
	}
	public String getPrvYearSlUpto() {
		return prvYearSlUpto;
	}
	public void setPrvYearSlUpto(String prvYearSlUpto) {
		this.prvYearSlUpto = prvYearSlUpto;
	}
	public String getCurrYearSlTarget() {
		return currYearSlTarget;
	}
	public void setCurrYearSlTarget(String currYearSlTarget) {
		this.currYearSlTarget = currYearSlTarget;
	}
	public String getCurrMonthSl() {
		return currMonthSl;
	}
	public void setCurrMonthSl(String currMonthSl) {
		this.currMonthSl = currMonthSl;
	}
	public String getCurrYearSlUpto() {
		return currYearSlUpto;
	}
	public void setCurrYearSlUpto(String currYearSlUpto) {
		this.currYearSlUpto = currYearSlUpto;
	}
	public String getCurrYearCITarget() {
		return currYearCITarget;
	}
	public void setCurrYearCITarget(String currYearCITarget) {
		this.currYearCITarget = currYearCITarget;
	}
	public String getPrvYearCIUpto() {
		return prvYearCIUpto;
	}
	public void setPrvYearCIUpto(String prvYearCIUpto) {
		this.prvYearCIUpto = prvYearCIUpto;
	}
	public String getPrvYearCBUpto() {
		return prvYearCBUpto;
	}
	public void setPrvYearCBUpto(String prvYearCBUpto) {
		this.prvYearCBUpto = prvYearCBUpto;
	}
	public String getPrevYrRec() {
		return prevYrRec;
	}
	public void setPrevYrRec(String prevYrRec) {
		this.prevYrRec = prevYrRec;
	}
	public String getPrevYrEqm() {
		return prevYrEqm;
	}
	public void setPrevYrEqm(String prevYrEqm) {
		this.prevYrEqm = prevYrEqm;
	}
	public String getCurrMonthRec() {
		return currMonthRec;
	}
	public void setCurrMonthRec(String currMonthRec) {
		this.currMonthRec = currMonthRec;
	}
	public String getCurrMonthEqm() {
		return currMonthEqm;
	}
	public void setCurrMonthEqm(String currMonthEqm) {
		this.currMonthEqm = currMonthEqm;
	}
	public String getDateone() {
		return dateone;
	}
	public void setDateone(String dateone) {
		this.dateone = dateone;
	}
	public String getDatetwo() {
		return datetwo;
	}
	public void setDatetwo(String datetwo) {
		this.datetwo = datetwo;
	}
	public String getDatethree() {
		return datethree;
	}
	public void setDatethree(String datethree) {
		this.datethree = datethree;
	}
	@Override
	public String toString() {
		return "IC_REV_PER_ZONE [tp=" + tp + ", zoneName=" + zoneName + ", zcName=" + zcName + ", prevYear=" + prevYear
				+ ", currYear=" + currYear + ", prvYearSlTarget=" + prvYearSlTarget + ", prvYearSlAchive="
				+ prvYearSlAchive + ", prvYearSlUpto=" + prvYearSlUpto + ", currYearSlTarget=" + currYearSlTarget
				+ ", currMonthSl=" + currMonthSl + ", currYearSlUpto=" + currYearSlUpto + ", currYearCITarget="
				+ currYearCITarget + ", prvYearCIUpto=" + prvYearCIUpto + ", prvYearCBUpto=" + prvYearCBUpto
				+ ", prevYrRec=" + prevYrRec + ", prevYrEqm=" + prevYrEqm + ", currMonthRec=" + currMonthRec
				+ ", currMonthEqm=" + currMonthEqm + ", dateone=" + dateone + ", datetwo=" + datetwo + ", datethree="
				+ datethree + "]";
	}
	public IC_REV_PER_ZONE(String tp, String zoneName, String zcName, String prevYear, String currYear,
			String prvYearSlTarget, String prvYearSlAchive, String prvYearSlUpto, String currYearSlTarget,
			String currMonthSl, String currYearSlUpto, String currYearCITarget, String prvYearCIUpto,
			String prvYearCBUpto, String prevYrRec, String prevYrEqm, String currMonthRec, String currMonthEqm,
			String dateone, String datetwo, String datethree) {
		super();
		this.tp = tp;
		this.zoneName = zoneName;
		this.zcName = zcName;
		this.prevYear = prevYear;
		this.currYear = currYear;
		this.prvYearSlTarget = prvYearSlTarget;
		this.prvYearSlAchive = prvYearSlAchive;
		this.prvYearSlUpto = prvYearSlUpto;
		this.currYearSlTarget = currYearSlTarget;
		this.currMonthSl = currMonthSl;
		this.currYearSlUpto = currYearSlUpto;
		this.currYearCITarget = currYearCITarget;
		this.prvYearCIUpto = prvYearCIUpto;
		this.prvYearCBUpto = prvYearCBUpto;
		this.prevYrRec = prevYrRec;
		this.prevYrEqm = prevYrEqm;
		this.currMonthRec = currMonthRec;
		this.currMonthEqm = currMonthEqm;
		this.dateone = dateone;
		this.datetwo = datetwo;
		this.datethree = datethree;
	}
	public IC_REV_PER_ZONE() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
