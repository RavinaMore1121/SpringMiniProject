package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dao.PatientDao;
import com.example.demo.entity.Patient;

@Service
public class PatientServiceImpl implements PatientService
{@Autowired
 PatientDao dao;
	@Override
	public List<Patient> findAll() {
		
		return dao.findAll();
	}
	@Override
	public Patient findById(@PathVariable int patient_id) {
		Optional<Patient> p= dao.findById(patient_id);
		Patient p1=null;
		if(p.isPresent())
		{
			p1=p.get();
		}
		return p1;
	}
	@Override
	public void saveorUpdate(Patient p) {
		dao.save(p);
		
	}
	@Override
	public void delete(int patient_id) {
		dao.deleteById(patient_id);
		
	}
}
