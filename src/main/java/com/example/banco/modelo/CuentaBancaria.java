package com.example.banco.modelo;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class CuentaBancaria {

	
	private String numero;
	private BigDecimal saldo;
	
	//set y get
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "CuentaBancaria [numero=" + numero + ", saldo=" + saldo + "]";
	}
	
	       
}
