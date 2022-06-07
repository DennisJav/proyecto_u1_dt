package com.example.repository;

import org.springframework.stereotype.Repository;

import com.example.modelo.Matricula;

@Repository
public class MatriculaRepoImpl implements IMatriculaRepo{

	@Override
	public void insertarMatricula(Matricula matricula) {
		// TODO Auto-generated method stub
		System.out.println("matriculado");
	}

	@Override
	public Matricula buscarMatricula(String numero) {
		// TODO Auto-generated method stub
		System.out.println("matricula buscada");
		return null;
	}

	@Override
	public void actualizarMatricula(Matricula matricula) {
		// TODO Auto-generated method stub
		System.out.println("actualizada");
		
	}

	@Override
	public void eliminarMatricula(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Eliminada");
	}
	

}
