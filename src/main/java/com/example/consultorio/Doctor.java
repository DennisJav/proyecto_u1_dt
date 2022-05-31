package com.example.consultorio;

import org.springframework.stereotype.Component;

//Les damos una metadata por se lo que va a controlar
@Component
public class Doctor {

	private String nombre;
	private int edad;
	private String apellido;
	private String ciudad;
	

	
	//Metodos set y get
	
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
