package com.example.banco.service;

import java.math.BigDecimal;

public interface IRetiroService {

	
	void realizarRetiro(String numCuenta, BigDecimal monto, String titular);
}
