package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="doctor")
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Dr_id")
	private int Dr_id;
	@Column(name="Dr_name")
	private String Dr_name;
	@Column(name="Dr_contact")
	private long Dor_contact;
	@Column(name="Dr_address")
	private String Dr_address;
	
	public Doctor() 
	{
		
	}
	
	public Doctor(int dr_id, String dr_name, long dor_contact, String dr_address) {
		super();
		Dr_id = dr_id;
		Dr_name = dr_name;
		Dor_contact = dor_contact;
		Dr_address = dr_address;
	}

	public int getDr_id() {
		return Dr_id;
	}

	public void setDr_id(int dr_id) {
		Dr_id = dr_id;
	}

	public String getDr_name() {
		return Dr_name;
	}

	public void setDr_name(String dr_name) {
		Dr_name = dr_name;
	}

	public long getDor_contact() {
		return Dor_contact;
	}

	public void setDor_contact(long dor_contact) {
		Dor_contact = dor_contact;
	}

	public String getDr_address() {
		return Dr_address;
	}

	public void setDr_address(String dr_address) {
		Dr_address = dr_address;
	}
	
	
	
}