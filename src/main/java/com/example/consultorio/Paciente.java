package com.example.consultorio;

import org.springframework.stereotype.Component;

@Component
public class Paciente {

	private int edad;
	private String nombre;
	
	//Metodos set y get
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
