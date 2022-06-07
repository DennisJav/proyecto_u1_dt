package com.example;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calendario {

	@Autowired
	private Equipo equipo;
	@Autowired
	private Jugador jugador;

	private LocalDateTime fechaPartido;

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
		
		return "agendado 1";
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public Jugador getJugador() {
		return jugador;
	}

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
