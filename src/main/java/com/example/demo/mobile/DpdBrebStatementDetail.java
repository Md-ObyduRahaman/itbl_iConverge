package com.example.demo.mobile;

public class DpdBrebStatementDetail {
	
	private String tp1;
	private String locationName;
	private String tp2;
	private String customerName;
	private String enrgUnit;
	private String pfcUnit;
	private String busLoss;
	private String totalUnit;
	private String enrgCgarge;
	private String pfcCharge;
	private String busLossCharge;
	private String totalBill;
	private String totalColl;
	private String recPrev;
	private String recCurr;
	public String getTp1() {
		return tp1;
	}
	public void setTp1(String tp1) {
		this.tp1 = tp1;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	public String getTp2() {
		return tp2;
	}
	public void setTp2(String tp2) {
		this.tp2 = tp2;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEnrgUnit() {
		return enrgUnit;
	}
	public void setEnrgUnit(String enrgUnit) {
		this.enrgUnit = enrgUnit;
	}
	public String getPfcUnit() {
		return pfcUnit;
	}
	public void setPfcUnit(String pfcUnit) {
		this.pfcUnit = pfcUnit;
	}
	public String getBusLoss() {
		return busLoss;
	}
	public void setBusLoss(String busLoss) {
		this.busLoss = busLoss;
	}
	public String getTotalUnit() {
		return totalUnit;
	}
	public void setTotalUnit(String totalUnit) {
		this.totalUnit = totalUnit;
	}
	public String getEnrgCgarge() {
		return enrgCgarge;
	}
	public void setEnrgCgarge(String enrgCgarge) {
		this.enrgCgarge = enrgCgarge;
	}
	public String getPfcCharge() {
		return pfcCharge;
	}
	public void setPfcCharge(String pfcCharge) {
		this.pfcCharge = pfcCharge;
	}
	public String getBusLossCharge() {
		return busLossCharge;
	}
	public void setBusLossCharge(String busLossCharge) {
		this.busLossCharge = busLossCharge;
	}
	public String getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(String totalBill) {
		this.totalBill = totalBill;
	}
	public String getTotalColl() {
		return totalColl;
	}
	public void setTotalColl(String totalColl) {
		this.totalColl = totalColl;
	}
	public String getRecPrev() {
		return recPrev;
	}
	public void setRecPrev(String recPrev) {
		this.recPrev = recPrev;
	}
	public String getRecCurr() {
		return recCurr;
	}
	public void setRecCurr(String recCurr) {
		this.recCurr = recCurr;
	}
	@Override
	public String toString() {
		return "DpdBrebStatementDetail [tp1=" + tp1 + ", locationName=" + locationName + ", tp2=" + tp2
				+ ", customerName=" + customerName + ", enrgUnit=" + enrgUnit + ", pfcUnit=" + pfcUnit + ", busLoss="
				+ busLoss + ", totalUnit=" + totalUnit + ", enrgCgarge=" + enrgCgarge + ", pfcCharge=" + pfcCharge
				+ ", busLossCharge=" + busLossCharge + ", totalBill=" + totalBill + ", totalColl=" + totalColl
				+ ", recPrev=" + recPrev + ", recCurr=" + recCurr + "]";
	}
	public DpdBrebStatementDetail(String tp1, String locationName, String tp2, String customerName, String enrgUnit,
			String pfcUnit, String busLoss, String totalUnit, String enrgCgarge, String pfcCharge, String busLossCharge,
			String totalBill, String totalColl, String recPrev, String recCurr) {
		super();
		this.tp1 = tp1;
		this.locationName = locationName;
		this.tp2 = tp2;
		this.customerName = customerName;
		this.enrgUnit = enrgUnit;
		this.pfcUnit = pfcUnit;
		this.busLoss = busLoss;
		this.totalUnit = totalUnit;
		this.enrgCgarge = enrgCgarge;
		this.pfcCharge = pfcCharge;
		this.busLossCharge = busLossCharge;
		this.totalBill = totalBill;
		this.totalColl = totalColl;
		this.recPrev = recPrev;
		this.recCurr = recCurr;
	}
	public DpdBrebStatementDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

}
