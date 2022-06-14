package com.example.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.banco.modelo.CuentaBancaria;

@Service
@Qualifier("ahorros")
public class CuentaBancariaAhorrosServicenImpl implements ICuentaBancariaService{

	
	
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
		//Codigo duplicado, solucion gestor
		//BigDecimal saldo=null;
		BigDecimal interes= new BigDecimal(560).multiply(new BigDecimal(15)).divide(new BigDecimal(100));
		interes =interes.add((saldo.divide(new BigDecimal(10))));
		return interes;
	}

	
	
}
