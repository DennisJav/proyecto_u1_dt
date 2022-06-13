package com.example.mega.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import com.example.mega.modelo.Inventario;
import com.example.mega.modelo.ReporteInventarioTO;


public interface IGestorInventario {

	void ingresoBodegaProducto(String nombre, LocalDate fechaCaducidad, BigDecimal precioCompra);
	void ingresoInventario(String codigo, int stock);
	List<ReporteInventarioTO> reporteInventario(LocalDateTime fechaIngreso);

	
}
