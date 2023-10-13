package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Patient;
import com.example.demo.service.PatientService;

@RequestMapping("/patient")
@RestController
public class PatientController 
{
	@Autowired
	public PatientService patientService;
	
	@GetMapping("/")
	public List<Patient> getallPatient()
	{
		System.out.println("list of all patient");
		return patientService.getAllPatient();
	}
	@GetMapping("/{id}")
	public Patient getPatientById(@PathVariable int id)
	{
		return patientService.getPatient(id);
	}
	@PostMapping("/")
	public Patient createPatient(@RequestBody Patient patient)
	{
		return patientService.createPatient(patient);
	}
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id)
	{
		patientService.deleteById(id);
		
	}

	
	
	

}
