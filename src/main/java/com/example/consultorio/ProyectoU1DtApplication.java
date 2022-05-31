package com.example.consultorio;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoU1DtApplication implements CommandLineRunner {

	@Autowired
	private CitaMedica cita;

	@Autowired
	private CitaMedica2 cita2;

	@Autowired
	private Calendario calendario;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1DtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		System.out.println("Mi primer proyecto con sts");

		// CitaMedica cita=new CitaMedica();

		// System.out.println(this.cita.agendar(LocalDateTime.now(), "Dennis", "Tapia",
		// 23, "Quito", "Javier", 0));

		System.out.println(this.cita2.agendar(LocalDateTime.now(), "Dennis", "Tapia", 23, "Quito", "Javier", 0));

		System.out.println("Primera: ");

		System.out.println(
				this.calendario.agendar(LocalDateTime.now(), "Denn", "Tapia", "Central", 26, "Ballenita", "A", 25));
		
		System.out.println("Segunda: ");

		System.out.println(
				this.calendario.agendar(LocalDateTime.now(), "Denn", "Tapia", "Central", 26, "Ballenita", "A", 25));
		
		System.out.println("Tercera: ");

		System.out.println(
				this.calendario.agendar(LocalDateTime.now(), "Denn", "Tapia", "Central", 26, "Ballenita", "A", 25));

	}

}
