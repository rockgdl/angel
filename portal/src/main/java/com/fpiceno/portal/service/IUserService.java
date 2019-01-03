package com.fpiceno.portal.service;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Component;

import com.fpiceno.portal.entity.UserInfo;


public interface IUserService {
	@Secured ({"ROLE_ADMIN"})
	UserInfo getDataByUserName(String userName);
}
 