package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Appointment;

public interface AppointmentService 
{
	public List<Appointment> getAllappointments();
	public Appointment getAppointmentById(int id);
	public Appointment creteAppointment(Appointment appointment);
	public void deletePatient(int id);

}
