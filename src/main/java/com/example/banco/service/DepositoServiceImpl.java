package com.example.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.banco.modelo.CuentaBancaria;
import com.example.banco.modelo.Deposito;
import com.example.banco.repository.IDepositoRepo;

@Service
public class DepositoServiceImpl implements IDepositoService{

	@Autowired
	private IDepositoRepo depositoRepo;
	@Autowired
	private ICuentaBancariaService cuentaBancariaService;
	
	
	@Override
	public void realizarDeposito(String numeroCuenta, BigDecimal monto) {
		// TODO Auto-generated method stub
		
		CuentaBancaria c=this.cuentaBancariaService.buscar(numeroCuenta);
		BigDecimal saldoAnterior = c.getSaldo();
		BigDecimal saldoNuevo = saldoAnterior.add(monto);
		c.setSaldo(saldoNuevo);
		
		this.cuentaBancariaService.actualizar(c);
		
		
		Deposito d=new Deposito();
		d.setMonto(saldoNuevo);
		d.setNumeroCuenta(numeroCuenta);
		d.setFecha(LocalDateTime.now());
		
		this.depositoRepo.crearDeposito(d);
		
	}

	
	
	
	
	
}
