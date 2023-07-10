package com.spring.dto;

public class BookingUpdateDto {
   
	private int bid;
	private String bname;
	private String bage;
	private String bauth;
	private String bemail;
	public BookingUpdateDto() {
		super();
	}
	public BookingUpdateDto(int bid, String bname, String bage, String bauth, String bemail) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bage = bage;
		this.bauth = bauth;
		this.bemail = bemail;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBage() {
		return bage;
	}
	public void setBage(String bage) {
		this.bage = bage;
	}
	public String getBauth() {
		return bauth;
	}
	public void setBauth(String bauth) {
		this.bauth = bauth;
	}
	public String getBemail() {
		return bemail;
	}
	public void setBemail(String bemail) {
		this.bemail = bemail;
	}
	
}
