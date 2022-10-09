package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Patient;
import com.example.demo.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController 
{
	@Autowired
	private PatientService service;
	@GetMapping("/list")
	public List<Patient> listPatient()
	{
		return service.findAll();
		
	}
	@GetMapping("/findbyid/{patient_id}")
	public Patient findById(@PathVariable int patient_id)
	{
		return service.findById(patient_id);
	}

	@PostMapping("/save")
    public Patient save(@RequestBody Patient e)
    {
    	e.setPatient_id(0);
		service.saveorUpdate(e);
    	return e;
    }

	@PutMapping("/update")
    public Patient update(@RequestBody Patient e)
    {
    	//e.setProductid(0);
		service.saveorUpdate(e);
    	return e;
		
	}
	@DeleteMapping("/delete/{patient_id}")
    public String delete(@PathVariable int patient_id)
    {
		Patient e=findById(patient_id);
    	if(e==null)
    	{throw new RuntimeException("delete id not found");
    	}
    	else
    	{
    	service.delete(patient_id);
    	}
    	return "patient_id"+patient_id;
    	
    }
}
