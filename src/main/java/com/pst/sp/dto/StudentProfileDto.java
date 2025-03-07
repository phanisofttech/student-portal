package com.pst.sp.dto;

import java.sql.Date;

public class StudentProfileDto {

	private int rollNumber;
	private String studentName;
	private String gender;
	private Date dob;
	private String courseName;
	private String address;
	private String mobileNumber;
	private String email;
	private String createdBy;
	private Date createdAt;
	private Date updatedAt;
	
	public StudentProfileDto(int rollNumber, String studentName, String gender, Date dob, String courseName,
			String address, String mobileNumber, String email, String createdBy, Date createdAt, Date updatedAt) {
		
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.gender = gender;
		this.dob = dob;
		this.courseName = courseName;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public StudentProfileDto() {
		// TODO Auto-generated constructor stub
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	
	
}
