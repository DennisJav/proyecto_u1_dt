package com.example.repository;

import org.springframework.stereotype.Repository;

import com.example.modelo.Materia;


@Repository
public class MateriaRepoImpl implements IMateriaRepo{

	@Override
	public void insertarMateria(Materia materia) {
		// TODO Auto-generated method stub
		System.out.println("Materia insertada");
	}

	@Override
	public Materia buscarMateria(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Materia buscada");
		return null;
	}

	@Override
	public void actualizarMateria(Materia materia) {
		// TODO Auto-generated method stub
		System.out.println("MAteria actualizada");
	}

	@Override
	public void eliminarMateria(String nombre) {
		// TODO Auto-generated method stub
		System.out.println("Materia eliminada");
	}

}
