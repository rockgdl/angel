package com.fpiceno.portal.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.fpiceno.portal.entity.UserInfo;

@Transactional
public class UserDao {


	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
	public UserInfo getActiveUser(String userName) {
		UserInfo activeUserInfo = new UserInfo();
		short enabled = 1;
		
		 Session session = sessionFactory.getCurrentSession();
		 hibernateTemplate.setSessionFactory(session.getSessionFactory());
		 
		List<UserInfo> list =  session.createQuery("FROM UserInfo where username='"+userName+"' and enabled=1 ").list();
		if(!list.isEmpty()) {
			activeUserInfo = (UserInfo)list.get(0);
		}
		return activeUserInfo;
	}
//	  public UserInfo getActiveUser(String userName);
}
