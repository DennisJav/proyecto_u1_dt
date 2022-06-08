package com.example.banco.repository;

import org.springframework.stereotype.Repository;

import com.example.banco.modelo.Deposito;

@Repository
public class DepositoRepoImpl implements IDepositoRepo{

	
	
	@Override
	public void crearDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Deposito creado "+d);
	}

	
	
	
}
