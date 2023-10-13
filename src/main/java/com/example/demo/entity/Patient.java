package com.example.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="patient")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Patient 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name="name" , length = 100)
	private String name;
	@Column(name="email" , length = 50)
	private String email;
	
    @OneToMany(mappedBy = "patient")
    private List<Appointment> appointments;


	
}
