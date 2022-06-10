package com.example.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.example.banco.modelo.Deposito;

public interface IDepositoService {

	void realizarDeposito(String numeroCuenta, BigDecimal monto);
	Deposito buscarDeposito(BigDecimal monto);
	void eliminarDeposito(BigDecimal monto);
	void actualizarDeposito(Deposito d);
}
