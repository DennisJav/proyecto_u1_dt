package com.example.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface IDepositoService {

	void realizarDeposito(String numeroCuenta, BigDecimal monto);
	
}
