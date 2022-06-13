package com.example.mega.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ReporteInventarioTO {

	String nombre;
	int stock;
	BigDecimal previoVenta;
	LocalDateTime fechaIngreso;
	
	//set y get
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public BigDecimal getPrevioVenta() {
		return previoVenta;
	}
	public void setPrevioVenta(BigDecimal previoVenta) {
		this.previoVenta = previoVenta;
	}
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	@Override
	public String toString() {
		return "ReporteInventarioTO [nombre=" + nombre + ", stock=" + stock + ", previoVenta=" + previoVenta
				+ ", fechaIngreso=" + fechaIngreso + "]";
	}
	
	
	
	
}
