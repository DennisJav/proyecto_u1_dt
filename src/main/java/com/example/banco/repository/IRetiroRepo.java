package com.example.banco.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.example.banco.modelo.Retiro;
import com.example.banco.modelo.Transferencia;

public interface IRetiroRepo {
	
	void realizarRetiro(Retiro r);
	List<Retiro> consultarRetiro(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin);

}
