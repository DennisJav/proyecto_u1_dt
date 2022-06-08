package com.example.banco.repository;

import org.springframework.stereotype.Repository;

import com.example.banco.modelo.Transferencia;

@Repository
public class TransferenciaBancaraRepo implements ITransferenciaRepo{

	@Override
	public void crearTransferencia(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se inserta la transferencia en BD"+t);
		
	
	}

	
	
}
