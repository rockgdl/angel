package com.fpiceno.portal.service;

import java.util.List;

import com.fpiceno.portal.entity.UserInfo;;

public interface UserServiceCRUD {
	
	List<UserInfo>  getUsers();
<<<<<<< HEAD

	void  agregarUser(UserInfo user);
	
=======
	Integer  agregarUser(UserInfo user);
>>>>>>> master
	void EliminarUser(UserInfo user);
	void ActualizaUser(UserInfo user);
}
