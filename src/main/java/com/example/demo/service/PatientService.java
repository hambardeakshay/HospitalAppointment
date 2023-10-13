package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Patient;

public interface PatientService
{
	List<Patient> getAllPatient();
	public Patient getPatient(Long id);
	public Patient createPatient(Patient p);
	public void deleteById(Long id);

}
