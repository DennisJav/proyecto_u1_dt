package com.example.mega.modelo;

import java.time.LocalDateTime;

public class Inventario {

	Producto producto;
	String codigo;
	int stock;
	LocalDateTime fechaIngreso;
	
	
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	@Override
	public String toString() {
		return "Inventario [producto=" + producto + ", codigo=" + codigo + ", stock=" + stock + ", fechaIngreso="
				+ fechaIngreso + "]";
	}
	
	
	
}
