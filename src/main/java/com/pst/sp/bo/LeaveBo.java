package com.pst.sp.bo;

import java.sql.Date;

public class LeaveBo {

	private int rollNumber;
	private String leaveType;
	private String reason;
	private Date fromDate;
	private Date toDate;
	private int numberOfDays;
	private String status;
	private String comments;
	private String createdBy;
	
	public LeaveBo(int rollNumber, String leaveType, String reason, Date fromDate, Date toDate, int numberOfDays,
			String status, String comments, String createdBy) {
		this.rollNumber = rollNumber;
		this.leaveType = leaveType;
		this.reason = reason;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.numberOfDays = numberOfDays;
		this.status = status;
		this.comments = comments;
		this.createdBy = createdBy;
	}
	
	
	public LeaveBo() {
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


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
	
	
	
	
	
}
