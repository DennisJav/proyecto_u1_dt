package com.example.repository;

import org.springframework.stereotype.Repository;

import com.example.modelo.Estudiante;

@Repository
public class EstudianteRepoImpl implements IEstudianteRepo{

	@Override
	public void insertarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado estudiante");
	}

	@Override
	public Estudiante buscarEstudiante(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("se ha buscado");
		return null;
	}

	@Override
	public void actualizarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo");
	}

	@Override
	public void eliminarEstudiante(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha borrado");
	}

}
