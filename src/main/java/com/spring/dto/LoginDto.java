package com.spring.dto;

public class LoginDto {
	private String uemail;
	private String upwd;
	public LoginDto() {
		super();
	}
	public LoginDto(String uemail, String upwd) {
		super();
		this.uemail = uemail;
		this.upwd = upwd;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	

}
