
package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="patient")
public class Patient 
{
	
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="patient_id")
	private int patient_id;
	@Column(name="patient_name")
	private String patient_name;
	@Column(name="patient_gender")
	private String patient_gender;
	@Column(name="patient_age")
	private String patient_age;
	@Column(name="patient_bloodgroup")
	private String patient_bloodgroup;
	@Column(name="patient_address")
	private String patient_address;
	public Patient()
	{
		
	}
	public Patient(int patient_id, String patient_name, String patient_gender, String patient_age,
			String patient_bloodgroup, String patient_address) {
		super();
		this.patient_id = patient_id;
		this.patient_name = patient_name;
		this.patient_gender = patient_gender;
		this.patient_age = patient_age;
		this.patient_bloodgroup = patient_bloodgroup;
		this.patient_address = patient_address;
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public String getPatient_gender() {
		return patient_gender;
	}
	public void setPatient_gender(String patient_gender) {
		this.patient_gender = patient_gender;
	}
	public String getPatient_age() {
		return patient_age;
	}
	public void setPatient_age(String patient_age) {
		this.patient_age = patient_age;
	}
	public String getPatient_bloodgroup() {
		return patient_bloodgroup;
	}
	public void setPatient_bloodgroup(String patient_bloodgroup) {
		this.patient_bloodgroup = patient_bloodgroup;
	}
	public String getPatient_address() {
		return patient_address;
	}
	public void setPatient_address(String patient_address) {
		this.patient_address = patient_address;
	}
	
}