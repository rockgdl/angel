package com.fpiceno.portal.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.fpiceno.portal.dao.UserDao;
import com.fpiceno.portal.entity.UserInfo;

public class UserService implements IUserService {
	@Autowired
	private UserDao userDAO;
	public UserInfo getDataByUserName(String userName) {
		return userDAO.getActiveUser(userName);
	}
}
