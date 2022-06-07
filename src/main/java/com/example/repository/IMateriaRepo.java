package com.example.repository;

import com.example.modelo.Materia;


public interface IMateriaRepo {

	void insertarMateria(Materia materia);
	Materia buscarMateria(String nombre);
	void actualizarMateria(Materia materia);
	void eliminarMateria(String nombre);
	
	
}
