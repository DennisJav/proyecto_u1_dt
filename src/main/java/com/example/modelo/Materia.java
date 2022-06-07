package com.example.modelo;

import org.springframework.stereotype.Component;

@Component
public class Materia {

	private String nombre;
	private int semestre;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSemestre() {
		return semestre;
	}
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}
	
	
	
	
}
