package com.example.service;

import com.example.modelo.Matricula;

public interface IMatriculaService {
	void insertarMatricula(Matricula matricula);
	Matricula buscarMatricula(String numero);
	void actualizarMatricula(Matricula matricula);
	void eliminarMatricula(String numero);
}
