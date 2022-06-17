package com.example.hospital.modelo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class DoctorEspecialidad {

	
	private String nombre;
	private String apellido;
	private String especialidad;
	private String consultorioNumero;
	
	//set y get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getConsultorioNumero() {
		return consultorioNumero;
	}
	public void setConsultorioNumero(String consultorioNumero) {
		this.consultorioNumero = consultorioNumero;
	}
	@Override
	public String toString() {
		return "DoctorEspecialidad [nombre=" + nombre + ", apellido=" + apellido + ", especialidad=" + especialidad
				+ ", consultorioNumero=" + consultorioNumero + "]";
	}
	
	
	
}
