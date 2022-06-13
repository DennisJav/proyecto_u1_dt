package com.example.mega.service;

import java.time.LocalDateTime;
import java.util.List;

import com.example.mega.modelo.Producto;

public interface IProductoService {

	void insertarProducto(Producto producto);
	Producto buscarProducto(String nombre);
	List<Producto> listaProductos(LocalDateTime fechaIngreso);
}
