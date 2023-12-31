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

import com.example.demo.entity.Appointment;
import com.example.demo.service.AppointmentService;

@RequestMapping("appointment")
@RestController
public class AppointController 
{
	@Autowired
	private AppointmentService appointService;
	
	@GetMapping("/")
	public List<Appointment> getAllAppointMent()
	{
		return appointService.getAllappointments();
	}
	@GetMapping("/{id}")
	public Appointment getAppointmentById(@PathVariable int id)
	{
		return appointService.getAppointmentById(id);
	}
	@PostMapping("/")
	public Appointment createAppointment(@RequestBody Appointment appointment)
	{
		return appointService.creteAppointment(appointment);
	}
	@DeleteMapping("/{id}")
	public void deleteAppointmentById(@PathVariable int id)
	{
		appointService.deletePatient(id);
	}

	

}
