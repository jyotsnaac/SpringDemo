package com.infy.fedpoint.enrollment.dto;

import org.springframework.stereotype.Component;

@Component
public class RequestParameters {
	
	private String strMemberId;
	private String pay_year;
	private String User;
	private String eff_date;
	private String strProgramId;

	public String getStrMemberId() {
		return strMemberId;
	}
	public void setStrMemberId(String strMemberId) {
		this.strMemberId = strMemberId;
	}
	public String getPay_year() {
		return pay_year;
	}
	public void setPay_year(String pay_year) {
		this.pay_year = pay_year;
	}
	public String getUser() {
		return User;
	}
	public void setUser(String user) {
		User = user;
	}
	public String getEff_date() {
		return eff_date;
	}
	public void setEff_date(String eff_date) {
		this.eff_date = eff_date;
	}
	public String getStrProgramId() {
		return strProgramId;
	}
	public void setStrProgramId(String strProgramId) {
		this.strProgramId = strProgramId;
	}
	

}
