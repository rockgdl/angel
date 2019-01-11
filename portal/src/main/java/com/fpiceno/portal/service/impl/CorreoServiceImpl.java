package com.fpiceno.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fpiceno.portal.dao.CorreoDao;
import com.fpiceno.portal.entity.Correo;
import com.fpiceno.portal.service.CorreoService;

public class CorreoServiceImpl implements CorreoService {
	@Autowired
	private CorreoDao correoDAO;
	
	
	@Override
	public List<Correo> getMails() {
		return correoDAO.obtenTodos();
	}


	@Override
	public Integer agregarCorreo(Correo correo) {
		return correoDAO.Agrega(correo);
	}


	@Override
	public void EliminarCorreo(Correo correo) {
		correoDAO.Elimina(correo);
	}


	@Override
	public void ActualizaCorreo(Correo correo) {
		correoDAO.Actualiza(correo);
		
	}
}
