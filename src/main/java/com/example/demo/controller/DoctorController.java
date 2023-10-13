package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;

@Controller
@RequestMapping("doctor")
public class DoctorController
{
	@Autowired
	private DoctorService doctorService;
	
	
	@GetMapping("/books")
	public String getall()
	{
		return "akshay";
	}
	@GetMapping("/")
	public List<Doctor> getAllDoctors()
	{
		return doctorService.getallDoctor();
	}
	@GetMapping("/{id}")
	public Doctor getDoctor(@PathVariable("id") Long id )
	{
		return doctorService.getDoctorById(id);
	}
	@PostMapping("/")
	public Doctor createDoctor(@RequestBody Doctor doctor)
	{
		return doctorService.createDoctor(doctor);
		
		
	}
	@DeleteMapping({"id"})
	public void deleteDoctor(@PathVariable Long id)
	{
		doctorService.deleteDoctor(id);
		
	}
	

}
