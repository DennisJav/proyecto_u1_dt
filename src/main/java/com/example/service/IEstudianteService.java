package com.example.service;

import com.example.modelo.Estudiante;

public interface IEstudianteService {


	public void insertarEstudiante(Estudiante estudiante);
	public Estudiante buscarEstudiante(String cedula);
	public void actualizarEstudiante(Estudiante estudiante);
	public void eliminarEstudiante(String cedula);
	
}
