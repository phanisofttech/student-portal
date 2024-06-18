package com.pst.sp.dto;

import java.sql.Date;

public class UserDto {

	private int id;
	private int rollNumber;
	private String userName;
	private String password;
	private String securityQuestion1;
	private String securtiyQuestion2;
	private String answer1;
	private String answer2;
	private String createdBy;
	private Date createdAt;
	private Date updatedAt;
	
	public UserDto() {
		// Empty constructor
	}
	
	public UserDto(int id, int rollNumber, String userName, String password, String securityQuestion1, String securtiyQuestion2,
			String answer1, String answer2, String createdBy, Date createdAt, Date updatedAt) {
		super();
		this.id = id;
		this.rollNumber = rollNumber;
		this.userName = userName;
		this.password = password;
		this.securityQuestion1 = securityQuestion1;
		this.securtiyQuestion2 = securtiyQuestion2;
		this.answer1 = answer1;
		this.answer2 = answer2;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRollNumber() {
		return rollNumber;
	}
	
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecurityQuestion1() {
		return securityQuestion1;
	}

	public void setSecurityQuestion1(String securityQuestion1) {
		this.securityQuestion1 = securityQuestion1;
	}

	public String getSecurtiyQuestion2() {
		return securtiyQuestion2;
	}

	public void setSecurtiyQuestion2(String securtiyQuestion2) {
		this.securtiyQuestion2 = securtiyQuestion2;
	}

	public String getAnswer1() {
		return answer1;
	}

	public void setAnswer1(String answer1) {
		this.answer1 = answer1;
	}

	public String getAnswer2() {
		return answer2;
	}

	public void setAnswer2(String answer2) {
		this.answer2 = answer2;
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
