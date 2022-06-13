package com.example.mega.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;


public class Producto {

	String nombre;
	LocalDate fechaCaducidad;
	BigDecimal precioCompra;
	BigDecimal precioVenta;
	
	//set y get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	public BigDecimal getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(BigDecimal precioCompra) {
		this.precioCompra = precioCompra;
	}
	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", fechaCaducidad=" + fechaCaducidad + ", precioCompra=" + precioCompra
				+ ", precioVenta=" + precioVenta + "]";
	}

	
	  
	
	
}
