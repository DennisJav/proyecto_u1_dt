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
import com.example.mega.service.IGestorInventario;
import com.example.modelo.Estudiante;
import com.example.modelo.Materia;
import com.example.modelo.Matricula;
import com.example.service.IEstudianteService;
import com.example.service.IMateriaService;
import com.example.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1DtApplication implements CommandLineRunner {
	
//	@Autowired
//	private ITransferenciaService transferenciaService;
//
//	@Autowired
//	private IDepositoService depositoService;
//
//	@Autowired
//	private ICuentaBancariaService cuentaBancariaService;
//	
//	@Autowired
//	private IRetiroService retiroService;
	
//	@Autowired
//	private IGestorInventario gestorInventario;
//	

	@Autowired
	private IFachadaCuentaBancaria fachadaCuentaBancaria;
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	

		BigDecimal interes= this.fachadaCuentaBancaria.calcularInteres("121");
		System.out.println(interes);
		
	}

}
