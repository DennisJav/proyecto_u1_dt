package com.example.banco.service;

import java.math.BigDecimal;

public interface ITransferenciaService {

	void realizarTransferencia(String cuentaOrigen, String cuentaDestino, BigDecimal monto);
	
}
