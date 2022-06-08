package com.example.banco.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.example.banco.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepo implements ICuentaBancariaRepo{

	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		System.out.println("Cuenta Bancaria actualizada a: "+c);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		CuentaBancaria cuenta=new CuentaBancaria();
		cuenta.setNumero(numero);
		cuenta.setSaldo(new BigDecimal(100));
		System.out.println("Se busca cuenta bancaria: "+numero);
		return cuenta;
	}

	
	
	
}
