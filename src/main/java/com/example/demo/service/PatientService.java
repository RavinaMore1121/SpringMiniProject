package com.example.demo.service;
import java.util.List;
import com.example.demo.entity.Patient;
public interface PatientService 
{
	public List<Patient>findAll();
	public Patient findById (int patient_id);
	public void saveorUpdate(Patient p);
	public void delete(int patient_id);
}
