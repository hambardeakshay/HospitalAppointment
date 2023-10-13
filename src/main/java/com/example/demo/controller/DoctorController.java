package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;


@RequestMapping("/doctor")
@RestController
public class DoctorController
{
	@Autowired
	private DoctorService doctorService;
	@GetMapping("/")
	public List<Doctor> getAllDoctors()
	{
		System.out.println("get all doctors");
		return doctorService.getallDoctor();
	}
	@GetMapping("/{id}")
	public Doctor getDoctorById(@PathVariable int id)
	{
		return doctorService.getDoctorById(id);
	}
	public Doctor createDoctor(@RequestBody Doctor doctor)
	{
		return doctorService.createDoctor(doctor);
	}
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id)
	{
		doctorService.deleteDoctor(id);
	}
	
}
