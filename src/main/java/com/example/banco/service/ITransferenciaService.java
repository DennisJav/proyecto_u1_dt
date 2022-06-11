package com.example.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.example.banco.modelo.Transferencia;

public interface ITransferenciaService {

	void realizarTransferencia(String cuentaOrigen, String cuentaDestino, BigDecimal monto);
	Transferencia buscarTransferencia(BigDecimal monto);
	void elimnarTransferencia(BigDecimal monto);
	void actualizarTransferencia(Transferencia t);
	List<Transferencia> consultarTransferencias(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);

}
