package com.example.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.banco.modelo.CuentaBancaria;
import com.example.banco.modelo.Retiro;
import com.example.banco.repository.IRetiroRepo;

@Service
public class RetiroServiceImpl implements IRetiroService{
	
	@Autowired 
	private ICuentaBancariaService cuentaBancariaService;
	@Autowired
	private IRetiroRepo retiroRepo;

	@Override
	public void realizarRetiro(String numCuenta, BigDecimal monto, String titular) {
		// TODO Auto-generated method stub
		
		System.out.println("-------------RETIRO------------");
		
		CuentaBancaria c=this.cuentaBancariaService.buscar(numCuenta);
		System.out.println(c);
		BigDecimal montoActual = c.getSaldo();
		BigDecimal montoNuevo = montoActual.subtract(monto);
		c.setSaldo(montoNuevo);
		this.cuentaBancariaService.actualizar(c);
		System.out.println(c);
		
		
		Retiro r=new Retiro();
		r.setFechaRetiro(LocalDateTime.now());
		r.setMontoRetiro(monto);
		r.setNumCuenta(numCuenta);
		r.setTitular(titular);
		this.retiroRepo.realizarRetiro(r);
		
		
	}
	

}
