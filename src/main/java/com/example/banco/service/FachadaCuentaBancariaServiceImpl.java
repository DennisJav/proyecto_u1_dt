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

	@Override
	public BigDecimal calcularInteres(String numeroCuenta) {
		// TODO Auto-generated method stub
		BigDecimal interes = null;
		CuentaBancaria cuenta = this.cuentaBancariaRepo.buscar(numeroCuenta);
		if (cuenta.getTipo().equals("A")) {
			// Cuenta Ahorros
			interes = this.cuentaBancariaServiceA.calcularInteres(numeroCuenta, cuenta.getSaldo());
		} else {
			// Cuenta Corriente
			interes = this.cuentaBancariaService.calcularInteres(numeroCuenta, cuenta.getSaldo());
		}

		return interes;
	}

}
