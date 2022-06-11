package com.example.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.example.banco.to.TransaccionTO;

public interface ITransaccionService {

	void transferencia(String origen, String Destino, BigDecimal monto);
	void deposito(String destino, BigDecimal monto);
	void retiro(String retiro, BigDecimal monto);
	List<TransaccionTO> consultarTransacciones(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);
}
