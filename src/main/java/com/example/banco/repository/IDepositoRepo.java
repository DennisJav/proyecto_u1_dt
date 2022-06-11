package com.example.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import com.example.banco.modelo.Deposito;
import com.example.banco.modelo.Transferencia;

public interface IDepositoRepo {

	void crearDeposito(Deposito d);
	Deposito buscarDeposito(BigDecimal monto);
	void eliminarDeposito(BigDecimal monto);
	void actualizarDeposito(Deposito d);
	List<Deposito> consultarDeposito(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);

}
