package com.example.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.banco.modelo.Deposito;
import com.example.banco.modelo.Transferencia;

@Repository
public class DepositoRepoImpl implements IDepositoRepo{

	
	
	@Override
	public void crearDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Deposito creado "+d);
	}

	@Override
	public Deposito buscarDeposito(BigDecimal monto) {
		// TODO Auto-generated method stub
		Deposito d=new Deposito();
		d.setFecha(LocalDateTime.now());
		d.setMonto(monto);
		d.setNumeroCuenta("1");
		System.out.println("Cuenta Buscada:  "+d);
		return d;
	}

	@Override
	public void eliminarDeposito(BigDecimal monto) {
		// TODO Auto-generated method stub
		System.out.println("Deposito Eliminado");
	}

	@Override
	public void actualizarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Deposito Actualizado");
	}

	@Override
	public List<Deposito> consultarDeposito(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		
		List<Deposito> listaConsultadaDepo = new ArrayList<>();
		
		Deposito d=new Deposito();
		d.setFecha(LocalDateTime.of(2022, 02, 20, 12, 30));
		d.setMonto(new BigDecimal(100));
		d.setNumeroCuenta("1121");
		listaConsultadaDepo.add(d);
		
		Deposito d2=new Deposito();
		d2.setFecha(LocalDateTime.of(2021, 12, 20, 12, 30));
		d2.setMonto(new BigDecimal(10));
		d2.setNumeroCuenta("1121");
		listaConsultadaDepo.add(d2);
		
		
		return listaConsultadaDepo;
	}

	
	
	
}
