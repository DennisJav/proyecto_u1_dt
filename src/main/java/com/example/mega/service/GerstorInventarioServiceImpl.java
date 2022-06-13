package com.example.mega.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mega.modelo.Inventario;
import com.example.mega.modelo.Producto;
import com.example.mega.modelo.ReporteInventarioTO;

@Service
public class GerstorInventarioServiceImpl implements IGestorInventario{

	@Autowired
	private IProductoService productoService;
	@Autowired
	private IInventarioService inventarioService;
	
	private List<Producto> listaP=new ArrayList<>();
	private List<Inventario> listaI=new ArrayList<>();
	
	@Override
	public void ingresoBodegaProducto(String nombre, LocalDate fechaCaducidad, BigDecimal precioCompra) {
		// TODO Auto-generated method stub
		Producto p=new Producto();
		p.setNombre(nombre);
		p.setFechaCaducidad(fechaCaducidad);
		p.setPrecioCompra(precioCompra);
		
		//CALCULO PRECIO 
		Double pC = precioCompra.doubleValue();
		Double precioVenta = pC + (pC * 0.12) + (pC*0.10);
		
		p.setPrecioVenta(new BigDecimal(precioVenta).setScale(2,RoundingMode.UP));
		
		listaP.add(p);
		this.productoService.insertarProducto(p);
		
	}

	@Override
	public void ingresoInventario(String codigo, int stock) {
		// TODO Auto-generated method stub
		
		Inventario inv=new Inventario();
		inv.setCodigo(codigo);
		inv.setFechaIngreso(LocalDateTime.now());
		inv.setStock(stock);
		inv.setProducto(listaP.get(listaP.size()-1));
		listaI.add(inv);
		this.inventarioService.insertarInventario(inv);
		
		
	}

	
	
	@Override
	public List<ReporteInventarioTO> reporteInventario(LocalDateTime fechaIngreso) {
		// TODO Auto-generated method stub
		
		this.inventarioService.listaInventario(fechaIngreso);
		
		List<ReporteInventarioTO> listaReporte = listaI.stream().map(in -> {
			ReporteInventarioTO r=new ReporteInventarioTO();
			r.setFechaIngreso(in.getFechaIngreso());
			r.setStock(in.getStock());
			r.setNombre(in.getProducto().getNombre());
			r.setPrevioVenta(in.getProducto().getPrecioVenta());
			return r;
		}).collect(Collectors.toList());
		
		
		return listaReporte;
	}


}
