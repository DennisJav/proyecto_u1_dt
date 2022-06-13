package com.example.mega.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.example.mega.modelo.Inventario;

public interface IInventarioRepo {

	void insertarInventario(Inventario inventario);
	Inventario buscarInventario(String codigo);
	List<Inventario> listaInventario(LocalDateTime fechaInventario);
	
	
}
