package com.example.demo;

public class IC_REV_PER_DIV_MODEL {
	private String tp;
	private String circleName;
	private String clName;
	private String recGovt;
	private String eqmGovt;
	private String recAuto;
	private String eqmAuto;
	private String recPriv;
	private String recTot;
	private String eqmTot;
	public String getTp() {
		return tp;
	}
	public void setTp(String tp) {
		this.tp = tp;
	}
	public String getCircleName() {
		return circleName;
	}
	public void setCircleName(String circleName) {
		this.circleName = circleName;
	}
	public String getClName() {
		return clName;
	}
	public void setClName(String clName) {
		this.clName = clName;
	}
	public String getRecGovt() {
		return recGovt;
	}
	public void setRecGovt(String recGovt) {
		this.recGovt = recGovt;
	}
	public String getEqmGovt() {
		return eqmGovt;
	}
	public void setEqmGovt(String eqmGovt) {
		this.eqmGovt = eqmGovt;
	}
	public String getRecAuto() {
		return recAuto;
	}
	public void setRecAuto(String recAuto) {
		this.recAuto = recAuto;
	}
	public String getEqmAuto() {
		return eqmAuto;
	}
	public void setEqmAuto(String eqmAuto) {
		this.eqmAuto = eqmAuto;
	}
	public String getRecPriv() {
		return recPriv;
	}
	public void setRecPriv(String recPriv) {
		this.recPriv = recPriv;
	}
	public String getRecTot() {
		return recTot;
	}
	public void setRecTot(String recTot) {
		this.recTot = recTot;
	}
	public String getEqmTot() {
		return eqmTot;
	}
	public void setEqmTot(String eqmTot) {
		this.eqmTot = eqmTot;
	}
	@Override
	public String toString() {
		return "IC_REV_PER_DIV_MODEL [tp=" + tp + ", circleName=" + circleName + ", clName=" + clName + ", recGovt="
				+ recGovt + ", eqmGovt=" + eqmGovt + ", recAuto=" + recAuto + ", eqmAuto=" + eqmAuto + ", recPriv="
				+ recPriv + ", recTot=" + recTot + ", eqmTot=" + eqmTot + "]";
	}
	public IC_REV_PER_DIV_MODEL(String tp, String circleName, String clName, String recGovt, String eqmGovt,
			String recAuto, String eqmAuto, String recPriv, String recTot, String eqmTot) {
		super();
		this.tp = tp;
		this.circleName = circleName;
		this.clName = clName;
		this.recGovt = recGovt;
		this.eqmGovt = eqmGovt;
		this.recAuto = recAuto;
		this.eqmAuto = eqmAuto;
		this.recPriv = recPriv;
		this.recTot = recTot;
		this.eqmTot = eqmTot;
	}
	public IC_REV_PER_DIV_MODEL() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
