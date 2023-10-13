package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Doctor;

public interface DoctorService 
{
	public List<Doctor> getallDoctor();
    public Doctor getDoctorById(int id);
	public Doctor createDoctor(Doctor doctor);
    public void deleteDoctor(int id);

}
