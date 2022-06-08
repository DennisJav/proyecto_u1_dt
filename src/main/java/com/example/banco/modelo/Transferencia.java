package com.example.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class Transferencia {

	private String numeroCuentaOrigen;
	private String numeroCuentaDestino;
	private BigDecimal montoTransferir;
	private LocalDateTime fechaTransferencia;
	
	
	//set y get
	
	
	public String getNumeroCuentaOrigen() {
		return numeroCuentaOrigen;
	}
	public LocalDateTime getFechaTransferencia() {
		return fechaTransferencia;
	}
	public void setFechaTransferencia(LocalDateTime fechaTransferencia) {
		this.fechaTransferencia = fechaTransferencia;
	}
	public void setNumeroCuentaOrigen(String numeroCuentaOrigen) {
		this.numeroCuentaOrigen = numeroCuentaOrigen;
	}
	public String getNumeroCuentaDestino() {
		return numeroCuentaDestino;
	}
	public void setNumeroCuentaDestino(String numeroCuentaDestino) {
		this.numeroCuentaDestino = numeroCuentaDestino;
	}
	public BigDecimal getMontoTransferir() {
		return montoTransferir;
	}
	public void setMontoTransferir(BigDecimal montoTransferir) {
		this.montoTransferir = montoTransferir;
	}
	@Override
	public String toString() {
		return "Transferencia [numeroCuentaOrigen=" + numeroCuentaOrigen + ", numeroCuentaDestino="
				+ numeroCuentaDestino + ", montoTransferir=" + montoTransferir + ", fechaTransferencia="
				+ fechaTransferencia + "]";
	}
	
	
	
}
