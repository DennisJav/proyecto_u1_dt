package com.example;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitaMedica2 {

	private Doctor doctor; //a su metodo set poner autowired

	private Paciente paciente;  //a su metodo set poner autowired
	
	private LocalDateTime fechaCita;



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
		return "cita agendada 2";
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
	
	//tercera forma por metodo set
	@Autowired
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}


	public Paciente getPaciente() {
		return paciente;
	}
	@Autowired
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

}
