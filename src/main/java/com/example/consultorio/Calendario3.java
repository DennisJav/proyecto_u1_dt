package com.example.consultorio;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calendario3 {

	private Equipo equipo;
	private Jugador jugador;
	private LocalDateTime fechaPartido;

	
	
	
	public Calendario3(Equipo equipo, Jugador jugador) {
		this.equipo = equipo;
		this.jugador = jugador;

	}

	public String agendar(LocalDateTime fecha, String nombre, String apellido, String posicion, int edad,
			String nombreEquipo, String categoria, int puntos) {

		this.equipo.setNombreEquipo(nombreEquipo);
		this.equipo.setCategoria(categoria);
		this.equipo.setPuntos(puntos);
		
		this.jugador.setNombre(nombre);
		this.jugador.setApellido(apellido);
		this.jugador.setEdad(edad);
		this.jugador.setPosicion(posicion);
		
		this.fechaPartido =fecha;
		
		return "agendado 3";
	}
	
	
	public Equipo getEquipo() {
		return equipo;
	}
	
	@Autowired
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public Jugador getJugador() {
		return jugador;
	}
	@Autowired
	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}

	public LocalDateTime getFechaPartido() {
		return fechaPartido;
	}

	public void setFechaPartido(LocalDateTime fechaPartido) {
		this.fechaPartido = fechaPartido;
	}
	
	
	
	
	
	
}
