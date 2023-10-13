package com.example.demo.imple;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.repo.DoctorRepo;
import com.example.demo.service.DoctorService;

@Service
public class DoctorImple implements DoctorService
{
	@Autowired
	private DoctorRepo doctorRepo;

	@Override
	public List<Doctor> getallDoctor() {
		
		return doctorRepo.findAll();
	}

	@Override
	public Doctor getDoctorById(Long id) {
		
		return doctorRepo.findById(id).orElse(null);
	}

	@Override
	public Doctor createDoctor(Doctor doctor) 
	{
		
		return doctorRepo.save(doctor);
	}

	@Override
	public void deleteDoctor(Long id) {
		doctorRepo.deleteById(id);
		
	}

}
