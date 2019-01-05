package com.fpiceno.portal.service;

import java.util.List;

import org.springframework.security.access.annotation.Secured;

import com.fpiceno.portal.entity.Producto;

public interface ProductoService {

	@Secured ({"ROLE_ADMIN"})
	List<Producto>  getProducts();
	@Secured ({"permitAll"})
	Integer  agregarProducto(Producto producto);
	
	
	
	

}
