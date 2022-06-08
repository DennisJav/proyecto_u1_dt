package com.example.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.banco.modelo.CuentaBancaria;
import com.example.banco.modelo.Transferencia;
import com.example.banco.repository.ICuentaBancariaRepo;
import com.example.banco.repository.ITransferenciaRepo;
@Service
public class TransferenciaBancariaServiceImpl implements ITransferenciaService{

	@Autowired
	private ICuentaBancariaService cuentaBancariaService;
	@Autowired
	private ITransferenciaRepo transferenciaRepo;
	
	
	@Override
	public void realizarTransferencia(String cuentaOrigen, String cuentaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria cOrigen =  this.cuentaBancariaService.buscar(cuentaOrigen);
		CuentaBancaria cDestino = this.cuentaBancariaService.buscar(cuentaDestino);
		
		
		BigDecimal saldoOrigen = cOrigen.getSaldo();
		BigDecimal nuevoSaldoOrigen = saldoOrigen.subtract(monto);
		cOrigen.setSaldo(nuevoSaldoOrigen);
		this.cuentaBancariaService.actualizar(cOrigen);
		
		BigDecimal saldoDestino = cDestino.getSaldo().add(nuevoSaldoOrigen);
		
		cDestino.setSaldo(saldoDestino);
		this.cuentaBancariaService.actualizar(cDestino);
	
		Transferencia t=new Transferencia();
		t.setNumeroCuentaOrigen(cuentaOrigen);
		t.setNumeroCuentaDestino(cuentaDestino);
		t.setMontoTransferir(monto);
		t.setFechaTransferencia(LocalDateTime.now());
		
		this.transferenciaRepo.crearTransferencia(t);
		
	
		
		
		
	}

	
	
}
