package com.example.demo.imple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Appointment;
import com.example.demo.repo.AppoinmentRepo;
import com.example.demo.repo.PatientRepo;
import com.example.demo.service.AppointmentService;

@Service
public class AppointImple implements AppointmentService
{
	@Autowired
	private AppoinmentRepo appointRepo;

	@Override
	public List<Appointment> getAllappointments() {
		// TODO Auto-generated method stub
		return appointRepo.findAll();
	}

	@Override
	public Appointment getAppointmentById(int id) {
		
		return appointRepo.findById(id).orElse(null);
	}

	@Override
	public Appointment creteAppointment(Appointment appointment) {
		
		return appointRepo.save(appointment);
	}

	@Override
	public void deletePatient(int id) 
	{
		appointRepo.deleteById(id);
		
		
	}
}
