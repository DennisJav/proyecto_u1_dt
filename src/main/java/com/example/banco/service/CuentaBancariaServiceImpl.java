package com.example.banco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.banco.modelo.CuentaBancaria;
import com.example.banco.repository.ICuentaBancariaRepo;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService
{

	@Autowired
	private ICuentaBancariaRepo cuentaBancariaRepo;

	
	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepo.actualizar(c);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		
		return this.cuentaBancariaRepo.buscar(numero);
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepo.eliminar(numero);
	}

	@Override
	public void crear(CuentaBancaria c) {
		// TODO Auto-generated method stub
		this.cuentaBancariaRepo.crear(c);
	}

}
