package com.example.repository;


import com.example.modelo.Matricula;

public interface IMatriculaRepo {
	void insertarMatricula(Matricula matricula);
	Matricula buscarMatricula(String numero);
	void actualizarMatricula(Matricula matricula);
	void eliminarMatricula(String numero);
}
