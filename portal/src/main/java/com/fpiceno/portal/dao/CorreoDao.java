package com.fpiceno.portal.dao;

import java.util.List;

import org.hibernate.Session;

import com.fpiceno.portal.entity.Correo;;

public interface CorreoDao {
	public Integer Agrega(Correo correo);
	public void Actualiza (Correo correo);
	public void Elimina(Correo correo);
	public List<Correo>obtenTodos();
	public Correo obtenById(Integer id);
	public Correo obtenByName(Correo correo);
	public Session getSession();

}
