package com.example.banco.repository;

import java.math.BigDecimal;

import com.example.banco.modelo.Transferencia;

public interface ITransferenciaRepo {

	void crearTransferencia(Transferencia t);
	Transferencia buscarTransferencia(BigDecimal monto);
	void elimnarTransferencia(BigDecimal monto);
	void actualizarTransferencia(Transferencia t);
	
}
