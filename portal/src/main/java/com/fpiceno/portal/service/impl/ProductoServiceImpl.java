package com.fpiceno.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fpiceno.portal.dao.ProductoDao;
import com.fpiceno.portal.entity.Producto;
import com.fpiceno.portal.service.ProductoService;

public class ProductoServiceImpl implements ProductoService {
	@Autowired
	private ProductoDao productoDAO;
	
	
	@Override
	public List<Producto> getProducts() {
		return productoDAO.obtenTodos();
	}


	@Override
	public Integer agregarProducto(Producto producto) {
		return productoDAO.Agrega(producto);
	}


	@Override
	public void EliminarProducto(Producto producto) {
		productoDAO.Elimina(producto);
	}


	@Override
	public void ActualizaProducto(Producto producto) {
		productoDAO.Actualiza(producto);
		
	}


	@Override
	public List<Producto> getProductsPaginados(Producto producto,Integer elementoInicial,
			Integer limite) {
		return productoDAO.obtenPaginado(producto, elementoInicial, limite);
	}


	@Override
	public Long getCountProductos() {
		return productoDAO.countRegistros();
	}

}
