package com.example.demo.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Patient;
import com.example.demo.repo.PatientRepo;
import com.example.demo.service.PatientService;

@Service
public class PatientImple implements PatientService
{
	@Autowired
	private PatientRepo patientRepo;

	@Override
	public List<Patient> getAllPatient() 
	{
		return patientRepo.findAll();
	}

	@Override
	public Patient getPatient(Long id) {
		
		return patientRepo.findById(id).orElse(null);
	}

	@Override
	public Patient createPatient(Patient p) {
		
		return patientRepo.save(p);
	}

	@Override
	public void deleteById(Long id)
	{
		patientRepo.deleteById(id);
		
		
	}

}
