package com.example.banco.service;

import com.example.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaService {

	void actualizar(CuentaBancaria c);
	CuentaBancaria buscar(String numero);
	
	
}
