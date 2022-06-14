package com.example.banco.service;

import java.math.BigDecimal;

import com.example.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaService {

	void actualizar(CuentaBancaria c);
	CuentaBancaria buscar(String numero);
	void eliminar(String numero);
	void crear(CuentaBancaria c);
	BigDecimal calcularInteres(String numeroCuenta,BigDecimal saldo);
	
}
