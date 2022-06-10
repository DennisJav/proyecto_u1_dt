package com.example.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Retiro {

	private BigDecimal montoRetiro;
	private String numCuenta;
	private LocalDateTime fechaRetiro;
	private String titular;
	
	//set y get
	public BigDecimal getMontoRetiro() {
		return montoRetiro;
	}
	public void setMontoRetiro(BigDecimal montoRetiro) {
		this.montoRetiro = montoRetiro;
	}
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	public LocalDateTime getFechaRetiro() {
		return fechaRetiro;
	}
	public void setFechaRetiro(LocalDateTime fechaRetiro) {
		this.fechaRetiro = fechaRetiro;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	@Override
	public String toString() {
		return "Retiro [montoRetiro=" + montoRetiro + ", numCuenta=" + numCuenta + ", fechaRetiro=" + fechaRetiro
				+ ", titular=" + titular + "]";
	}
	
	
	
	
}
