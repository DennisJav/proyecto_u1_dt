package com.example;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.banco.modelo.CuentaBancaria;
import com.example.banco.modelo.Deposito;
import com.example.banco.modelo.Transferencia;
import com.example.banco.service.ICuentaBancariaService;
import com.example.banco.service.IDepositoService;
import com.example.banco.service.IFachadaCuentaBancaria;
import com.example.banco.service.IRetiroService;
import com.example.banco.service.ITransferenciaService;
import com.example.hospital.modelo.DoctorEspecialidad;
import com.example.hospital.modelo.DoctorGeneral;

import com.example.mega.service.IGestorInventario;
import com.example.modelo.Estudiante;
import com.example.modelo.Materia;
import com.example.modelo.Matricula;
import com.example.modelo.ProfesorGeneral;
import com.example.modelo.ProfesorMateria;
import com.example.service.IEstudianteService;
import com.example.service.IMateriaService;
import com.example.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1DtApplication implements CommandLineRunner {

	@Autowired
	private ProfesorGeneral profesorGeneral;
	@Autowired
	private ProfesorGeneral profesorGeneral1;

	@Autowired
	private ProfesorMateria materia;
	@Autowired
	private ProfesorMateria materia1;

	@Autowired
	private IMatriculaService matriculaService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		// 1
		System.out.println("SINGLETON");
		this.profesorGeneral.setNombre("DEnnis");
		this.profesorGeneral.setApellido("Tapia");
		System.out.println(this.profesorGeneral);
		//
		this.profesorGeneral1.setNombre("JAVIER");
		System.out.println(this.profesorGeneral);

		System.out.println("PROTOTYPE");
		this.materia.setNombre("Daniel");
		this.materia.setApellido("Cano");
		System.out.println(this.materia);
		System.out.println("------------");
		System.out.println(this.materia1);
		this.materia1.setNombre("Albert");
		System.out.println(this.materia1);
//		
		Matricula m=new Matricula();
		m.setEstudiante(new Estudiante());
		m.setMateria(new ArrayList<Materia>());
		m.setNumero("12");

		
		
		
		this.matriculaService.insertarMatricula(m);
		
	}

}
