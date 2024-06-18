package com.pst.sp.vo;

import java.util.Date;

public class LeaveVo {

	private int rollNumber;
	private String leaveType;
	private String reason;
	private Date fromDate;
	private Date toDate;
	private int numberOfDays;
	private String userName;
	
	public LeaveVo(int rollNumber, String leaveType, String reason, Date fromDate, Date toDate, int numberOfDays, String userName) {
		this.rollNumber = rollNumber;
		this.leaveType = leaveType;
		this.reason = reason;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.numberOfDays = numberOfDays;
		this.userName = userName;
	}
	
	public LeaveVo() {
		// empty constructor
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public int getNumberOfDays() {
		return numberOfDays;
	}

	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
	
}
