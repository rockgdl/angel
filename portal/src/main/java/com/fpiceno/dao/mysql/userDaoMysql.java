//package com.fpiceno.dao.mysql;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.orm.hibernate5.HibernateTemplate;
//
//import com.fpiceno.portal.dao.UserDao;
//import com.fpiceno.portal.entity.UserInfo;
//
//public class userDaoMysql implements UserDao {
//
//	
//	@Autowired
//	private HibernateTemplate hibernateTemplate;
//	@Override
//	public UserInfo getActiveUser(String userName) {
//		UserInfo activeUserInfo = new UserInfo();
//		short enabled = 1;
//		List<?> list = hibernateTemplate.find("FROM UserInfo WHERE userName=? and enabled=?",
//				userName, enabled);
//		if(!list.isEmpty()) {
//			activeUserInfo = (UserInfo)list.get(0);
//		}
//		return activeUserInfo;
//	}
//
//}
