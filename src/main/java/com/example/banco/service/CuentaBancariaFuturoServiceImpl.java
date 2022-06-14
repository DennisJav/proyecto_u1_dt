package com.example.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.banco.modelo.CuentaBancaria;
import com.example.banco.repository.ICuentaBancariaRepo;

@Service
@Qualifier("futuro")
public class CuentaBancariaFuturoServiceImpl implements ICuentaBancariaService{

	@Autowired
	private ICuentaBancariaRepo cuentaBancariaRepo;
	
	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(String numero) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void crear(CuentaBancaria c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BigDecimal calcularInteres(String numeroCuenta, BigDecimal saldo) {
		// TODO Auto-generated method stub
		
		BigDecimal interes = saldo.multiply(new BigDecimal(1.09)).add(new BigDecimal(0.10));
		//		BigDecimal interes=saldo.multiply(new BigDecimal(15)).divide(new BigDecimal(100));
		return interes;
	}

	
	
	
	
	
}
