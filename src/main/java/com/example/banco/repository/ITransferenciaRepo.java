package com.example.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.example.banco.modelo.Transferencia;

public interface ITransferenciaRepo {

	void crearTransferencia(Transferencia t);

	Transferencia buscarTransferencia(BigDecimal monto);

	void elimnarTransferencia(BigDecimal monto);

	void actualizarTransferencia(Transferencia t);

	List<Transferencia> consultarTransferencias(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);
}
