package com.fpiceno.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.fpiceno.portal.dao.UserDaoCRUD;
import com.fpiceno.portal.entity.UserInfo;
import com.fpiceno.portal.service.UserServiceCRUD;;

public class UserServiceImplCRUD implements UserServiceCRUD{
	@Autowired
	private UserDaoCRUD userDAO;
	
	
	@Override
	public List<UserInfo> getUsers() {
		return userDAO.obtenTodos();
	}


	@Override
	public Integer agregarUser(UserInfo user) {
		return userDAO.Agrega(user);
	}


	@Override
	public void EliminarUser(UserInfo user) {
		userDAO.Elimina(user);
	}


	@Override
	public void ActualizaUser(UserInfo user) {
		userDAO.Actualiza(user);
		
	}

}
