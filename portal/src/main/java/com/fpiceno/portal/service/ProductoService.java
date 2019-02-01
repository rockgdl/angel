package com.fpiceno.portal.service;

import java.util.List;

import org.springframework.security.access.annotation.Secured;

import com.fpiceno.portal.entity.Producto;

public interface ProductoService {

	@Secured ({"ROLE_ADMIN"})
	List<Producto>  getProducts();
	List<Producto>  getProductsPaginados(Producto producto,Integer elementoInicial,Integer limite);

	Integer  agregarProducto(Producto producto);
	Long getCountProductos();
	
	void EliminarProducto(Producto producto);
	void ActualizaProducto(Producto producto);
	
	
	
	

}
