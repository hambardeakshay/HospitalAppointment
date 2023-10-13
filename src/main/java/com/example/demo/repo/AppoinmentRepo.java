package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Appointment;

public interface AppoinmentRepo extends JpaRepository<Appointment,Long>
{

}
