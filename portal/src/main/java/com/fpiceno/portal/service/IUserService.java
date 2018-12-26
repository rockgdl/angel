package com.fpiceno.portal.service;

import org.springframework.security.access.annotation.Secured;

import com.fpiceno.portal.entity.UserInfo;


public interface IUserService {
	@Secured ({"ROLE_ADMIN"})
	UserInfo getDataByUserName(String userName);
}
 