package com.fpiceno.portal.service;

import java.util.List;

import com.fpiceno.portal.entity.Correo;

public interface CorreoService {
	
	
	List<Correo>  getMails();

	Integer  agregarCorreo(Correo correo);
	
	void EliminarCorreo(Correo correo);
	void ActualizaCorreo(Correo correo);

}
