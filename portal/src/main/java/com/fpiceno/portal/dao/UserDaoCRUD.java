package com.fpiceno.portal.dao;

import java.util.List;

import org.hibernate.Session;

import com.fpiceno.portal.entity.UserInfo;;

public interface UserDaoCRUD {
	public Integer Agrega(UserInfo user);
	public void Actualiza (UserInfo user);
	public void Elimina(UserInfo user);
	public List<UserInfo>obtenTodos();
	public UserInfo obtenById(Integer id);
	public UserInfo obtenByName(UserInfo user);
	public Session getSession();
}
