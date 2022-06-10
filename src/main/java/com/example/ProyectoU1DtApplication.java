package com.example;



import java.math.BigDecimal;
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
import com.example.banco.service.IRetiroService;
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

	@Autowired
	private ICuentaBancariaService cuentaBancariaService;
	
	@Autowired
	private IRetiroService retiroService;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		

		//CRUD CUENTA
		CuentaBancaria c=new CuentaBancaria();
		c.setNumero("1");
		c.setSaldo(new BigDecimal(200));
		this.cuentaBancariaService.crear(c);
		this.cuentaBancariaService.buscar("1");
		this.cuentaBancariaService.eliminar("1");
		this.cuentaBancariaService.actualizar(c);
		
		
		//CRUD TRANSFERENCIA
		
		this.transferenciaService.realizarTransferencia("1", "2", new BigDecimal(5));
		this.transferenciaService.buscarTransferencia(new BigDecimal(200));
		this.transferenciaService.elimnarTransferencia(new BigDecimal(200));
		Transferencia t=new Transferencia();
		t.setFechaTransferencia(LocalDateTime.now());
		t.setMontoTransferir(new BigDecimal(200));
		t.setNumeroCuentaDestino("1");
		t.setNumeroCuentaOrigen("2");
		
		this.transferenciaService.actualizarTransferencia(t);
		
		//CRUD DEPOSITO
		
		this.depositoService.realizarDeposito("1", new BigDecimal(10));
		this.depositoService.buscarDeposito(new BigDecimal(100));
		this.depositoService.eliminarDeposito(new BigDecimal(20));
		
		Deposito d=new Deposito();
		d.setFecha(LocalDateTime.now());
		d.setMonto(new BigDecimal(12));
		d.setNumeroCuenta("2");
		this.depositoService.actualizarDeposito(null);
		
		
		//RETIRO
		this.retiroService.realizarRetiro("1", new BigDecimal(10), "Dennis");
		
		
	}

}
