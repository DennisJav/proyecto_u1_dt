package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.modelo.Matricula;
import com.example.repository.IMatriculaRepo;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepo matriculaRepo;

	@Override
	public void insertarMatricula(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepo.insertarMatricula(matricula);
	}

	@Override
	public Matricula buscarMatricula(String numero) {
		// TODO Auto-generated method stub
		return this.matriculaRepo.buscarMatricula(numero);
	}

	@Override
	public void actualizarMatricula(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepo.actualizarMatricula(matricula);
	}

	@Override
	public void eliminarMatricula(String numero) {
		// TODO Auto-generated method stub
		this.matriculaRepo.eliminarMatricula(numero);
	}

}
