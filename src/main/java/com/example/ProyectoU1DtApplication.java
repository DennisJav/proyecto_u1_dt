package com.example;



import java.math.BigDecimal;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.banco.modelo.Transferencia;
import com.example.banco.service.IDepositoService;
import com.example.banco.service.ITransferenciaService;
import com.example.modelo.Estudiante;
import com.example.modelo.Materia;
import com.example.modelo.Matricula;
import com.example.service.IEstudianteService;
import com.example.service.IMateriaService;
import com.example.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1DtApplication implements CommandLineRunner {
	
	@Autowired
	private ITransferenciaService transferenciaService;

	@Autowired
	private IDepositoService depositoService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		

		
		this.transferenciaService.realizarTransferencia("1", "2", new BigDecimal(200));
		this.depositoService.realizarDeposito("1", new BigDecimal(10));
		
		
		
	}

}
