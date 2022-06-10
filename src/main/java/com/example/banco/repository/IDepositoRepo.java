package com.example.banco.repository;

import java.math.BigDecimal;

import com.example.banco.modelo.Deposito;

public interface IDepositoRepo {

	void crearDeposito(Deposito d);
	Deposito buscarDeposito(BigDecimal monto);
	void eliminarDeposito(BigDecimal monto);
	void actualizarDeposito(Deposito d);
}
