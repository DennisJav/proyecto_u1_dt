package com.example;



import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.modelo.Estudiante;
import com.example.modelo.Materia;
import com.example.modelo.Matricula;
import com.example.service.IEstudianteService;
import com.example.service.IMateriaService;
import com.example.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1DtApplication implements CommandLineRunner {
	
	@Autowired
	IEstudianteService estudianteService;
	@Autowired
	IMateriaService materiaService;
	@Autowired
	IMatriculaService matriculaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Estudiante e1 = new Estudiante();
		e1.setNombre("Dennis");
		e1.setApellido("Tapia");
		e1.setCedula("12132320");
		
		this.estudianteService.insertarEstudiante(e1);
		
		
		Materia m1=new Materia();
		m1.setNombre("Fisica");
		m1.setSemestre(6);
		this.materiaService.insertarMateria(m1);
		m1.setNombre("Literatura");
		this.materiaService.actualizarMateria(m1);
		this.materiaService.eliminarMateria("Literatura");
		this.materiaService.buscarMateria("Literatura");
		
		
		
		Matricula matricula=new Matricula();
		matricula.setNumero("11");
		matricula.setEstudiante(e1);
		ArrayList<Estudiante> e2 = new ArrayList<>();
		e2.add(e1);
		this.matriculaService.insertarMatricula(matricula);
		//matricula.setMateria(null);
		matricula.setNumero("1");
		this.matriculaService.actualizarMatricula(matricula);
		this.matriculaService.buscarMatricula("1");
		this.matriculaService.eliminarMatricula("1");
		
		
	}

}
