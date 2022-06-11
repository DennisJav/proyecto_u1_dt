package com.example.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.banco.modelo.Transferencia;

@Repository
public class TransferenciaBancaraRepo implements ITransferenciaRepo{

	@Override
	public void crearTransferencia(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se inserta la transferencia en BD"+t);
		
	
	}

	@Override
	public Transferencia buscarTransferencia(BigDecimal monto) {
		// TODO Auto-generated method stub
		Transferencia t=new Transferencia();
		t.setFechaTransferencia(LocalDateTime.now());
		t.setMontoTransferir(monto);
		t.setNumeroCuentaDestino("1");
		t.setNumeroCuentaOrigen("2");
		System.out.println("Transferencia"+t);
		return t;
	}

	@Override
	public void elimnarTransferencia(BigDecimal monto) {
		// TODO Auto-generated method stub
		System.out.println("Transferencia eliminada");
	}

	@Override
	public void actualizarTransferencia(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Transferencia eliminada");
	}

	@Override
	public List<Transferencia> consultarTransferencias(String cuenta, LocalDateTime fechaInicio,
			LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		
		List<Transferencia> listaConsultada = new ArrayList<>();
		
		Transferencia t=new Transferencia();
		t.setFechaTransferencia(LocalDateTime.now());
		t.setMontoTransferir(new BigDecimal(100));
		t.setNumeroCuentaDestino("123");
		t.setNumeroCuentaOrigen("323");
		listaConsultada.add(t);
		
		
		return listaConsultada;
	}

	
	
}
