package com.example.banco.repository;

import org.springframework.stereotype.Repository;

import com.example.banco.modelo.Retiro;

@Repository
public class RetiroRepoImpl implements IRetiroRepo{

	@Override
	public void realizarRetiro(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Retiro Creado"+r);
	}
	

}
