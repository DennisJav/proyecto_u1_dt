package com.example.banco.repository;

import com.example.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaRepo {

	void actualizar(CuentaBancaria c);
	CuentaBancaria buscar(String numero);
	void eliminar(String numero);
	void crear(CuentaBancaria c);
	
}