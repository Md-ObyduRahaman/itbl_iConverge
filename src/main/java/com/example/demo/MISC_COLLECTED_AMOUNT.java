package com.example.demo;

public class MISC_COLLECTED_AMOUNT 
{
	public String MSC_BILL_TYPE_CODE, MSC_BILL_TYPE_NAME, MISC_AMT_COLL, MISC_AMT_COLL_PREV, LOCATION_CODE, BILL_CYCLE_CODE;

	public String getMSC_BILL_TYPE_CODE() {
		return MSC_BILL_TYPE_CODE;
	}

	public void setMSC_BILL_TYPE_CODE(String mSC_BILL_TYPE_CODE) {
		MSC_BILL_TYPE_CODE = mSC_BILL_TYPE_CODE;
	}

	public String getMSC_BILL_TYPE_NAME() {
		return MSC_BILL_TYPE_NAME;
	}

	public void setMSC_BILL_TYPE_NAME(String mSC_BILL_TYPE_NAME) {
		MSC_BILL_TYPE_NAME = mSC_BILL_TYPE_NAME;
	}

	public String getMISC_AMT_COLL() {
		return MISC_AMT_COLL;
	}

	public void setMISC_AMT_COLL(String mISC_AMT_COLL) {
		MISC_AMT_COLL = mISC_AMT_COLL;
	}

	public String getMISC_AMT_COLL_PREV() {
		return MISC_AMT_COLL_PREV;
	}

	public void setMISC_AMT_COLL_PREV(String mISC_AMT_COLL_PREV) {
		MISC_AMT_COLL_PREV = mISC_AMT_COLL_PREV;
	}

	public String getLOCATION_CODE() {
		return LOCATION_CODE;
	}

	public void setLOCATION_CODE(String lOCATION_CODE) {
		LOCATION_CODE = lOCATION_CODE;
	}

	public String getBILL_CYCLE_CODE() {
		return BILL_CYCLE_CODE;
	}

	public void setBILL_CYCLE_CODE(String bILL_CYCLE_CODE) {
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
	}

	public MISC_COLLECTED_AMOUNT(String mSC_BILL_TYPE_CODE, String mSC_BILL_TYPE_NAME, String mISC_AMT_COLL,
			String mISC_AMT_COLL_PREV, String lOCATION_CODE, String bILL_CYCLE_CODE) {
		super();
		MSC_BILL_TYPE_CODE = mSC_BILL_TYPE_CODE;
		MSC_BILL_TYPE_NAME = mSC_BILL_TYPE_NAME;
		MISC_AMT_COLL = mISC_AMT_COLL;
		MISC_AMT_COLL_PREV = mISC_AMT_COLL_PREV;
		LOCATION_CODE = lOCATION_CODE;
		BILL_CYCLE_CODE = bILL_CYCLE_CODE;
	}

	public MISC_COLLECTED_AMOUNT() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MISC_COLLECTED_AMOUNT [MSC_BILL_TYPE_CODE=" + MSC_BILL_TYPE_CODE + ", MSC_BILL_TYPE_NAME="
				+ MSC_BILL_TYPE_NAME + ", MISC_AMT_COLL=" + MISC_AMT_COLL + ", MISC_AMT_COLL_PREV=" + MISC_AMT_COLL_PREV
				+ ", LOCATION_CODE=" + LOCATION_CODE + ", BILL_CYCLE_CODE=" + BILL_CYCLE_CODE + "]";
	}
	
	
}