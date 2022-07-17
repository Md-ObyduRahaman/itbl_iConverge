package com.example.demo;

public class ActivityDrop {
	private String activityCode;
	private String activityName;
	@Override
	public String toString() {
		return "ActivityDrop [activityCode=" + activityCode + ", activityName=" + activityName + "]";
	}
	public String getActivityCode() {
		return activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public ActivityDrop(String activityCode, String activityName) {
		super();
		this.activityCode = activityCode;
		this.activityName = activityName;
	}
	public ActivityDrop() {
		super();
		// TODO Auto-generated constructor stub
	}

}
