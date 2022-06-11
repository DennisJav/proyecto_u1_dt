package com.example.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.banco.modelo.Deposito;
import com.example.banco.modelo.Retiro;
import com.example.banco.modelo.Transferencia;
import com.example.banco.repository.IDepositoRepo;
import com.example.banco.repository.IRetiroRepo;
import com.example.banco.repository.ITransferenciaRepo;
import com.example.banco.to.TransaccionTO;

@Service
public class TransaccionesServiceImpl implements ITransaccionService {

	@Autowired
	private ITransferenciaService transferenciaService;
	@Autowired
	private IDepositoService depositoService;
	@Autowired
	private IRetiroService retiroService;
	@Autowired
	private IRetiroRepo repo;
	@Autowired
	private ITransferenciaRepo transferenciaRepo;
	@Autowired
	private IDepositoRepo depositoRepo;
	
	
	
	@Override
	public void transferencia(String origen, String Destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.transferenciaService.realizarTransferencia(origen, Destino, monto);
	}

	@Override
	public void deposito(String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.depositoService.realizarDeposito(destino, monto);
	}

	@Override
	public void retiro(String retiro, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.retiroService.realizarRetiro(retiro, monto, "Dennis");
	}

	@Override
	public List<TransaccionTO> consultarTransacciones(String cuenta, LocalDateTime fechaInicio,
			LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Transferencia> listaTrans = this.transferenciaRepo.consultarTransferencias(cuenta, fechaInicio, fechaFin);
		List<Deposito> listaDepo = this.depositoRepo.consultarDeposito(cuenta, fechaInicio, fechaFin);
		List<Retiro> listaReti = this.repo.consultarRetiro(cuenta, fechaInicio, fechaFin);

		List<TransaccionTO> listaFinal = new ArrayList<>();

		for(Transferencia t:listaTrans) {
			TransaccionTO transaccionTO = this.transformar(t);
			listaFinal.add(transaccionTO);
		} 
		
		for(Deposito d:listaDepo) {
			TransaccionTO transaccionTO = this.transformar(d);
			listaFinal.add(transaccionTO);
		}
		for(Retiro r:listaReti) {
			TransaccionTO transaccionTO = this.transformar(r);
			listaFinal.add(transaccionTO);
		}
		
		
		return listaFinal;
	}

	
	//POLIMORFISMO
	private TransaccionTO transformar(Transferencia transferencia) {
		
		TransaccionTO traTo = new TransaccionTO();
		traTo.setFecha(transferencia.getFechaTransferencia());
		traTo.setMonto(transferencia.getMontoTransferir());
		traTo.setTipo("T");
		return traTo;
	}

	private TransaccionTO transformar(Deposito deposito) {
		TransaccionTO traTo = new TransaccionTO();
		traTo.setFecha(deposito.getFecha());
		traTo.setMonto(deposito.getMonto());
		traTo.setTipo("D");
		return traTo;
	}

	private TransaccionTO transformar(Retiro retiro) {

		TransaccionTO traTo = new TransaccionTO();
		traTo.setFecha(retiro.getFechaRetiro());
		traTo.setMonto(retiro.getMontoRetiro());
		traTo.setTipo("R");
		return traTo;
	}

}
