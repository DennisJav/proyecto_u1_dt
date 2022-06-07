package com.example.service;

import com.example.modelo.Materia;

public interface IMateriaService {

	void insertarMateria(Materia materia);
	Materia buscarMateria(String nombre);
	void actualizarMateria(Materia materia);
	void eliminarMateria(String nombre);
}