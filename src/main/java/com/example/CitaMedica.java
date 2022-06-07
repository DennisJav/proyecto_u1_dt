package com.example;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CitaMedica {


	//primera forma inyeccion por anotacion
	@Autowired
	private Doctor doctor;
	@Autowired
	private Paciente paciente;
	
	private LocalDateTime fechaCita;

	
	//segunda forma mediante constructor 
//	public CitaMedica(Doctor doctor, Paciente paciente) {
//		this.doctor = doctor;
//		this.paciente = paciente;
//	}



	public String agendar(LocalDateTime fechaCita, String nombre, String apellido, int edad, String ciudad,
			String nombrePaciente, int edadPaciente) {
		
		this.doctor.setNombre(nombre);
		this.doctor.setApellido(apellido);
		this.doctor.setEdad(edad);
		this.doctor.setCiudad(ciudad);
		
		this.paciente.setNombre(nombrePaciente);
		this.paciente.setEdad(edadPaciente);
		
		//seteamos los atributos de la cita medica
		
		this.fechaCita = fechaCita;
	
		//se guarda la cita
		return "cita agendada";
	}

	
	
	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}
