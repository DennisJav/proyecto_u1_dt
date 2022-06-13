package com.example.mega.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.mega.modelo.Inventario;
import com.example.mega.modelo.Producto;

@Repository
public class InventarioRepoImpl implements IInventarioRepo{

	private List<Inventario> inve = new ArrayList<>();
	
	@Override
	public void insertarInventario(Inventario inventario) {
		// TODO Auto-generated method stub
		
		inve.add(inventario);
		System.out.println("Inventario y Producto Insertado: "+inventario.toString());
	}

	@Override
	public Inventario buscarInventario(String codigo) {
		// TODO Auto-generated method stub
		Inventario i = inve.get(inve.size()-1);
		System.out.println("Articulo encontrado: "+i);
		return i;
	}

	@Override
	public List<Inventario> listaInventario(LocalDateTime fechaInventario) {
		// TODO Auto-generated method stub
		System.out.println("Buscando por fecha");
		return inve;
	}

	
	
}
