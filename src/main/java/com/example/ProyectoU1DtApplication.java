package com.example;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.modelo.Estudiante;
import com.example.service.IEstudianteService;

@SpringBootApplication
public class ProyectoU1DtApplication implements CommandLineRunner {
	
	@Autowired
	IEstudianteService estudianteService;

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
		
		
		
		
		
	}

}
