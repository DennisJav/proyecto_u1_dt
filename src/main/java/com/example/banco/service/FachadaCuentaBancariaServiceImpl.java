package com.example.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.banco.modelo.CuentaBancaria;
import com.example.banco.repository.ICuentaBancariaRepo;

@Service
public class FachadaCuentaBancariaServiceImpl implements IFachadaCuentaBancaria {

	@Autowired
	private ICuentaBancariaRepo cuentaBancariaRepo;

	@Autowired
	@Qualifier("corriente")
	private ICuentaBancariaService cuentaBancariaService;

	@Autowired
	@Qualifier("ahorros")
	private ICuentaBancariaService cuentaBancariaServiceA;

	@Autowired
	@Qualifier("futuro")
	private ICuentaBancariaService cuentaBancariaServiceF;
	
	@Override
	public BigDecimal calcularInteres(String numeroCuenta) {
		// TODO Auto-generated method stub
		BigDecimal interes = null;
		CuentaBancaria cuenta = this.cuentaBancariaRepo.buscar(numeroCuenta);
		if (cuenta.getTipo().equals("A")) {
			// Cuenta Ahorros
			interes = this.cuentaBancariaServiceA.calcularInteres(numeroCuenta, cuenta.getSaldo());
		} else if(cuenta.getTipo().equals("C")){
			// Cuenta Corriente
			interes = this.cuentaBancariaService.calcularInteres(numeroCuenta, cuenta.getSaldo());
		}else if(cuenta.getTipo().equals("F")) {
			interes = this.cuentaBancariaServiceF.calcularInteres(numeroCuenta, cuenta.getSaldo());
		}else {
			System.out.println("TIPO NO VALIDO");
		}

		return interes;
	}

}
