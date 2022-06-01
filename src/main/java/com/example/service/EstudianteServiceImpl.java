package com.example.service;

import org.springframework.stereotype.Service;

import com.example.modelo.Estudiante;

@Service
public class EstudianteServiceImpl implements IEstudianteService{

	@Override
	public void insertarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		System.out.println("Insertado");
	}

	@Override
	public Estudiante buscarEstudiante(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Buscado");
		return null;
	}

	@Override
	public void actualizarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		System.out.println("Actualizado");
	}

	@Override
	public void eliminarEstudiante(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Eliminado");
	}


	
}
