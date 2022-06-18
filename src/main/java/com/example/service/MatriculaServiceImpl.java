package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Service;

import com.example.modelo.Matricula;
import com.example.modelo.ProfesorGeneral;
import com.example.modelo.ProfesorMateria;
import com.example.repository.IMatriculaRepo;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

	@Autowired
	private IMatriculaRepo matriculaRepo;
	@Autowired
	private ProfesorGeneral profesorGeneral;
	@Autowired
	private ProfesorMateria profesorMateria;
	
	//@Lookup
	public ProfesorGeneral obtenerProfesorG() {
		System.out.println("Entro al metodo GENERAL");
		return null;
	}
	
	
	
	//@Lookup
	//Descarta todo lo que esta dentro del metodo y toma lo que esta en el espacio de memoria
	public ProfesorMateria obtenerProfesorM() {
		System.out.println("Entro al metodo MATERIA");
		ProfesorMateria profeM=new ProfesorMateria();
		profeM.setApellido("TAPIA");
		profeM.setNombre("JOSE");
		return profeM;
	}
	
	
	@Override
	public void insertarMatricula(Matricula matricula) {
		// TODO Auto-generated method stub
		
		System.out.println("DI desde Service SINGLETON"+this.profesorGeneral);
		System.out.println("DI desde Service PROTOTYPE"+this.profesorMateria);
		System.out.println("VA AL METODO");
		System.out.println("DI un metodo:"+this.obtenerProfesorG());
		System.out.println("DI un metodo:"+this.obtenerProfesorM());

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
