package com.spring.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Booking_Table")
public class Booking {

	@Column(name = "Booking_Id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int b_id;
	@Column(name = "Seat_NO")
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int seatno;
	private int p_id;
	private String P_name;
	private String P_age;
	private String p_auth_id;
	private String P_email;
	private Integer train_no;
	private String s_from;
	private String e_to;
	private String t_prise;

	public Booking() {
		super();
	}

	public Booking(int b_id, int seatno, int p_id, String p_name, String p_age, String p_auth_id, String p_email,
			Integer train_no, String s_from, String e_to, String t_prise) {
		super();
		this.b_id = b_id;
		this.seatno = seatno;
		this.p_id = p_id;
		P_name = p_name;
		P_age = p_age;
		this.p_auth_id = p_auth_id;
		P_email = p_email;
		this.train_no = train_no;
		this.s_from = s_from;
		this.e_to = e_to;
		this.t_prise = t_prise;
	}

	public int getB_id() {
		return b_id;
	}

	public void setB_id(int b_id) {
		this.b_id = b_id;
	}

	public int getSeatno() {
		return seatno;
	}

	public void setSeatno(int seatno) {
		this.seatno = seatno;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return P_name;
	}

	public void setP_name(String p_name) {
		P_name = p_name;
	}

	public String getP_age() {
		return P_age;
	}

	public void setP_age(String p_age) {
		P_age = p_age;
	}

	public String getP_auth_id() {
		return p_auth_id;
	}

	public void setP_auth_id(String p_auth_id) {
		this.p_auth_id = p_auth_id;
	}

	public String getP_email() {
		return P_email;
	}

	public void setP_email(String p_email) {
		P_email = p_email;
	}

	public Integer getTrain_no() {
		return train_no;
	}

	public void setTrain_no(Integer train_no) {
		this.train_no = train_no;
	}

	public String getS_from() {
		return s_from;
	}

	public void setS_from(String s_from) {
		this.s_from = s_from;
	}

	public String getE_to() {
		return e_to;
	}

	public void setE_to(String e_to) {
		this.e_to = e_to;
	}

	public String getT_prise() {
		return t_prise;
	}

	public void setT_prise(String t_prise) {
		this.t_prise = t_prise;
	}

	
}