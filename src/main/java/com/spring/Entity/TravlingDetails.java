package com.spring.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TravlingDetails {
	@Id
	private int train_no;
	private String train_name;
	private String S_from;
	private String to_Des;
	private String ticketprice;
	public TravlingDetails() {
		super();
	}
	public TravlingDetails(int train_no, String train_name, String s_from, String to_Des, String ticketprice) {
		super();
		this.train_no = train_no;
		this.train_name = train_name;
		S_from = s_from;
		this.to_Des = to_Des;
		this.ticketprice = ticketprice;
	}
	public int getTrain_no() {
		return train_no;
	}
	public void setTrain_no(int train_no) {
		this.train_no = train_no;
	}
	public String getTrain_name() {
		return train_name;
	}
	public void setTrain_name(String train_name) {
		this.train_name = train_name;
	}
	public String getS_from() {
		return S_from;
	}
	public void setS_from(String s_from) {
		S_from = s_from;
	}
	public String getTo_Des() {
		return to_Des;
	}
	public void setTo_Des(String to_Des) {
		this.to_Des = to_Des;
	}
	public String getTicketprice() {
		return ticketprice;
	}
	public void setTicketprice(String ticketprice) {
		this.ticketprice = ticketprice;
	}
	
}