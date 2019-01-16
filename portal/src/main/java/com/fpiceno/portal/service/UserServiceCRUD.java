package com.fpiceno.portal.service;

import java.util.List;

import com.fpiceno.portal.entity.UserInfo;;

public interface UserServiceCRUD {
	
	List<UserInfo>  getUsers();
	void  agregarUser(UserInfo user);
	
//	Integer  agregarUser(UserInfo user);

	void EliminarUser(UserInfo user);
	void ActualizaUser(UserInfo user);
}
