package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.modelo.Materia;
import com.example.modelo.Matricula;
import com.example.repository.IMateriaRepo;

@Service
public class MateriaServiceImpl implements IMateriaService{
	
	@Autowired
	private IMateriaRepo materiaRepo;

	@Override
	public void insertarMateria(Materia materia) {
		// TODO Auto-generated method stub
		this.materiaRepo.insertarMateria(materia);
	}

	@Override
	public Materia buscarMateria(String nombre) {
		// TODO Auto-generated method stub
		return this.materiaRepo.buscarMateria(nombre);
	}

	@Override
	public void actualizarMateria(Materia materia) {
		// TODO Auto-generated method stub
		this.materiaRepo.actualizarMateria(materia);
	}

	@Override
	public void eliminarMateria(String nombre) {
		// TODO Auto-generated method stub
		this.materiaRepo.eliminarMateria(nombre);
	}

}
