package com.example.mega.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.mega.modelo.Producto;

@Repository
public class ProductoRepoImpl implements IProductoRepo{
	
	private List<Producto> listaPro = new ArrayList<>();
	
	
	@Override
	public void insertarProducto(Producto producto) {
		// TODO Auto-generated method stub
		
		listaPro.add(producto);
		System.out.println("Articulo Insertado");
	}

	@Override
	public Producto buscarProducto(String nombre) {
		// TODO Auto-generated method stub
		Producto p= listaPro.get(listaPro.size()-1);
	
		return p;
	}

	@Override
	public List<Producto> listaProductos(LocalDateTime fechaIngreso) {
		// TODO Auto-generated method stub
		System.out.println("Buscando por fecha ");
		return listaPro;
	}

	
	
}
