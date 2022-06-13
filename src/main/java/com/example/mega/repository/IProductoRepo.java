package com.example.mega.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.example.mega.modelo.Producto;

public interface IProductoRepo {

	void insertarProducto(Producto producto);
	Producto buscarProducto(String nombre);
	List<Producto> listaProductos(LocalDateTime fechaIngreso);
	
}
