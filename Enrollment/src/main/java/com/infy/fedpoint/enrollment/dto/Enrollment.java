package com.infy.fedpoint.enrollment.dto;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class Enrollment {
	
	private String member_id;
	private String prog_id;
	private LocalDate eff_date;
	private float ded_amt;
	private String frequency;
	private float aDA;

	public Enrollment() {
		
	}
	
	public Enrollment(String member_id, String prog_id, LocalDate eff_date, float ded_amt, String frequency) {
		super();
		this.member_id = member_id;
		this.prog_id = prog_id;
		this.eff_date = eff_date;
		this.ded_amt = ded_amt;
		this.frequency = frequency;
	}

	public String getMember_id() {
		return member_id;
	}

	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}

	public String getProg_id() {
		return prog_id;
	}

	public void setProg_id(String prog_id) {
		this.prog_id = prog_id;
	}

	public LocalDate getEff_date() {
		return eff_date;
	}

	public void setEff_date(LocalDate eff_date) {
		this.eff_date = eff_date;
	}

	public float getDed_amt() {
		return ded_amt;
	}

	public void setDed_amt(float ded_amt) {
		this.ded_amt = ded_amt;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public float getaDA() {
		return aDA;
	}

	public void setaDA(float aDA) {
		this.aDA = aDA;
	}

	
	 @Override
	    public String toString(){
	        return "member_id "+member_id+  ", prog_id:" +prog_id +    ", eff_date:" +eff_date + ", ded_amt:" +ded_amt + ", frequency:" +frequency ;
	    }


}
