package com.fpiceno.portal.dao;

import java.util.List;
import com.fpiceno.portal.entity.Cliente;

public interface ClienteDao {

	
	public void Agrega(Cliente cliente);
	public void Actualiza (Cliente cliente);
	public void Elimina(Cliente cliente);
	public List<Cliente>obtenTodos();
	public Cliente obtenById(Integer id);
	public Cliente obtenByName(Cliente cliente);
}
