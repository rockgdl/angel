package com.fpiceno.portal.dao;

import java.util.List;

import com.fpiceno.portal.entity.Pedidos;


public interface PedidosDao {
	
	
	public void Agrega(Pedidos pedidos);
	public void Actualiza (Pedidos pedidos);
	public void Elimina(Pedidos pedidos);
	public List<Pedidos>obtenTodos();
	public Pedidos obtenById(Integer id);
	public Pedidos obtenByName(Pedidos pedidos);

}
