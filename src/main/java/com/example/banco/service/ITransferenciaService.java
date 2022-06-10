package com.example.banco.service;

import java.math.BigDecimal;

import com.example.banco.modelo.Transferencia;

public interface ITransferenciaService {

	void realizarTransferencia(String cuentaOrigen, String cuentaDestino, BigDecimal monto);
	Transferencia buscarTransferencia(BigDecimal monto);
	void elimnarTransferencia(BigDecimal monto);
	void actualizarTransferencia(Transferencia t);
}
