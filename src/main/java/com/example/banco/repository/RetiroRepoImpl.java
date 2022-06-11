package com.example.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.banco.modelo.Deposito;
import com.example.banco.modelo.Retiro;

@Repository
public class RetiroRepoImpl implements IRetiroRepo {

	@Override
	public void realizarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Retiro Creado" + r);
	}

	@Override
	public List<Retiro> consultarRetiro(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Retiro> listaConsultadaReti = new ArrayList<>();

		Retiro r = new Retiro();
		r.setFechaRetiro(LocalDateTime.of(2021, 10, 15, 12, 30));
		r.setMontoRetiro(new BigDecimal(100));
		r.setNumCuenta("1121");
		r.setTitular("Dennis");
		listaConsultadaReti.add(r);
		
		
		Retiro r1 = new Retiro();
		r1.setFechaRetiro(LocalDateTime.of(2022, 06, 25, 12, 30));
		r1.setMontoRetiro(new BigDecimal(100));
		r1.setNumCuenta("1121");
		r1.setTitular("Dennis");
		listaConsultadaReti.add(r1);
		

		return listaConsultadaReti;
	}

}
