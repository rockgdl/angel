package com.fpiceno.portal.dao;

import java.util.List;

import org.hibernate.Session;
import org.springframework.transaction.annotation.Transactional;

import com.fpiceno.portal.entity.Producto;


public interface ProductoDao {
	
	
	public Integer Agrega(Producto producto);
	public Long countRegistros();
	public void Actualiza (Producto producto);
	public void Elimina(Producto producto);
	public List<Producto>obtenTodos();
	public Producto obtenById(Integer id);
	public Producto obtenByName(Producto producto);
	public Session getSession();
	public List<Producto> obtenPaginado(Producto producto,Integer elemntoInicial,Integer maxXPage);

}
