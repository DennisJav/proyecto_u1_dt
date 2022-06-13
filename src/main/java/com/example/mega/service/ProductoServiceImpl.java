package com.example.mega.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mega.modelo.Producto;
import com.example.mega.repository.IProductoRepo;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	private IProductoRepo productoRepo;
	
	@Override
	public void insertarProducto(Producto producto) {
		// TODO Auto-generated method stub
		this.productoRepo.insertarProducto(producto);
	}

	@Override
	public Producto buscarProducto(String nombre) {
		// TODO Auto-generated method stub
		return this.productoRepo.buscarProducto(nombre);
	}

	@Override
	public List<Producto> listaProductos(LocalDateTime fechaIngreso) {
		// TODO Auto-generated method stub
		return this.productoRepo.listaProductos(fechaIngreso);
	}

}
