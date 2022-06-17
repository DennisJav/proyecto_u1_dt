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
	private DoctorGeneral doctorGeneral;
	@Autowired
	private DoctorGeneral doctorGeneral2;
	
	@Autowired
	private DoctorEspecialidad doctorEspecialidad;
	@Autowired
	private DoctorEspecialidad doctorEspecialidad1;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	System.out.println("SINGLETON");
	this.doctorGeneral.setNombre("DENNIS");
	this.doctorGeneral.setApellido("TAPIA");
	this.doctorGeneral.setConsultorioNumero("A1");
	System.out.println(this.doctorGeneral);
	System.out.println("SINGLETON 2");
	System.out.println(this.doctorGeneral2);
	
	System.out.println("---------------------------------------------");
	
	System.out.println("PROTOTYPE 1");
	this.doctorEspecialidad.setNombre("JAVIER");
	this.doctorEspecialidad.setApellido("ORTIZ");
	this.doctorEspecialidad.setEspecialidad("CARDIOLOGO");
	this.doctorEspecialidad.setConsultorioNumero("A2");
	System.out.println(this.doctorEspecialidad);
	
	System.out.println("PROTOTYPE 2");
	System.out.println(this.doctorEspecialidad1);
	System.out.println("PROTOTYPE 3");
	this.doctorEspecialidad1.setNombre("LUIS");
	this.doctorEspecialidad1.setApellido("JUAREZ");
	this.doctorEspecialidad1.setEspecialidad("OFTAMOLOGIA");
	this.doctorEspecialidad1.setConsultorioNumero("A3");
	System.out.println(this.doctorEspecialidad);
	
//	
	
		
	}

}
