package com.pst.sp.vo;

public class UserVo {

	private int rollNumber;
	private String userName;
	private String password;
	private String secQuestion1;
	private String secQuestion2;
	private String ans1;
	private String ans2;
	
	public UserVo(int rollNumber, String userName, String password, String secQuestion1, String secQuestion2,
			String ans1, String ans2) {
		this.rollNumber = rollNumber;
		this.userName = userName;
		this.password = password;
		this.secQuestion1 = secQuestion1;
		this.secQuestion2 = secQuestion2;
		this.ans1 = ans1;
		this.ans2 = ans2;
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
	public String getSecQuestion1() {
		return secQuestion1;
	}
	public void setSecQuestion1(String secQuestion1) {
		this.secQuestion1 = secQuestion1;
	}
	public String getSecQuestion2() {
		return secQuestion2;
	}
	public void setSecQuestion2(String secQuestion2) {
		this.secQuestion2 = secQuestion2;
	}
	public String getAns1() {
		return ans1;
	}
	public void setAns1(String ans1) {
		this.ans1 = ans1;
	}
	public String getAns2() {
		return ans2;
	}
	public void setAns2(String ans2) {
		this.ans2 = ans2;
	}
	
	
	
	
}
