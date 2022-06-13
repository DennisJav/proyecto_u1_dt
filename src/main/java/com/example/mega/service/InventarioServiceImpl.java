package com.example.mega.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mega.modelo.Inventario;
import com.example.mega.repository.IInventarioRepo;

@Service
public class InventarioServiceImpl implements IInventarioService{

	@Autowired
	private IInventarioRepo inventarioRepo;
	
	@Override
	public void insertarInventario(Inventario inventario) {
		// TODO Auto-generated method stub
		this.inventarioRepo.insertarInventario(inventario);
	}

	@Override
	public Inventario buscarInventario(String codigo) {
		// TODO Auto-generated method stub
		return this.inventarioRepo.buscarInventario(codigo);
	}

	@Override
	public List<Inventario> listaInventario(LocalDateTime fechaInventario) {
		// TODO Auto-generated method stub
		return this.inventarioRepo.listaInventario(fechaInventario);
	}

}
