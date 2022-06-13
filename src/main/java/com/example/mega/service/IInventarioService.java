package com.example.mega.service;

import java.time.LocalDateTime;
import java.util.List;

import com.example.mega.modelo.Inventario;

public interface IInventarioService {

	
	void insertarInventario(Inventario inventario);
	Inventario buscarInventario(String codigo);
	List<Inventario> listaInventario(LocalDateTime fechaInventario);
}
