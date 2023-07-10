package com.spring.dto;

public class BookingDto {
	
	private Integer P_ID;
	private Integer TRAIN_NO;
	private String S_FROM;
	private String E_TO;
	public BookingDto() {
		super();
	}
	public BookingDto(Integer p_ID, Integer tRAIN_NO, String s_FROM, String e_TO) {
		super();
		P_ID = p_ID;
		TRAIN_NO = tRAIN_NO;
		S_FROM = s_FROM;
		E_TO = e_TO;
	}
	public Integer getP_ID() {
		return P_ID;
	}
	public void setP_ID(Integer p_ID) {
		P_ID = p_ID;
	}
	public Integer getTRAIN_NO() {
		return TRAIN_NO;
	}
	public void setTRAIN_NO(Integer tRAIN_NO) {
		TRAIN_NO = tRAIN_NO;
	}
	public String getS_FROM() {
		return S_FROM;
	}
	public void setS_FROM(String s_FROM) {
		S_FROM = s_FROM;
	}
	public String getE_TO() {
		return E_TO;
	}
	public void setE_TO(String e_TO) {
		E_TO = e_TO;
	}
	
}
