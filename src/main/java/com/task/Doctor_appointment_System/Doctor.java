package com.task.Doctor_appointment_System;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String specialty;
    private String experience;
	private String degree1;
	private String degree2;
	private String img;
	private String location;
	private String charge;
	private String rating;
	private String patients;
	
	@OneToMany(mappedBy = "doctor")
    @JsonBackReference
    private List<Appointment> appointments;
    
    public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getDegree1() {
		return degree1;
	}
	public void setDegree1(String degree1) {
		this.degree1 = degree1;
	}
	public String getDegree2() {
		return degree2;
	}
	public void setDegree2(String degree2) {
		this.degree2 = degree2;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCharge() {
		return charge;
	}
	public void setCharge(String charge) {
		this.charge = charge;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getPatients() {
		return patients;
	}
	public void setPatients(String patients) {
		this.patients = patients;
	}
	public List<Appointment> getAppointments() {
		return appointments;
	}
	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}
	
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	
    // Add more fields like address, contact info, etc.
    
    // Getters and setters
}

