package com.example.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.example.banco.modelo.Deposito;

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

	
	
	
}
