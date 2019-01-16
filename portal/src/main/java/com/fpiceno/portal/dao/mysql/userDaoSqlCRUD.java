package com.fpiceno.portal.dao.mysql;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.fpiceno.portal.entity.UserInfo;
import com.fpiceno.portal.dao.UserDaoCRUD;;

@Transactional
public class userDaoSqlCRUD implements UserDaoCRUD{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override

	public void Agrega(UserInfo user) {
			System.out.println("entre al metodo*************: "+user);
		   Session session= sessionFactory.getCurrentSession();
//		   Session session=getSession();
		  //Integer id=(Integer) session.save(user);
		   session.save(user);
	}

	@Override
	public void Actualiza(UserInfo user) {
		   Session session= sessionFactory.getCurrentSession();
//		   Transaction tx=session.beginTransaction();
		   session.update(user);
//		   tx.commit();
	}

	@Override
	public void Elimina(UserInfo user) {
		   Session session= sessionFactory.getCurrentSession();
//		   Transaction trans=session.beginTransaction();
		   session.delete(user);
//		   trans.commit();
	}

	@Override
	public List<UserInfo> obtenTodos() {
		   Session session= sessionFactory.getCurrentSession();
//		   Transaction trans=session.beginTransaction();
		Query query=session.createQuery("from UserInfo");
		ArrayList<UserInfo> lista = (ArrayList<UserInfo>) query.list();
//		trans.commit();
		return lista;
	}

	@Override
	public UserInfo obtenById(Integer id) {
//		LOG.info("OBTENER COLONIA POR ID  ");
		   Session session= sessionFactory.getCurrentSession();
//		   Transaction trans=session.beginTransaction();
		   UserInfo user=new UserInfo();
		user =  (UserInfo) session.get(UserInfo.class, id);
//		trans.commit();
		return user;
	}

	@Override
	public UserInfo obtenByName(UserInfo user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Session getSession() {
//		 Transaction tx;
		 Session sesion = null;
		 SessionFactory sessionFactoryTest=null;
		 sessionFactoryTest= new Configuration().configure("com/fpiceno/portal/config/hibernateSql.cfg.xml").buildSessionFactory();
//			sessionFactory=new Configuration().configure(_archivo).buildSessionFactory();
//			LOG.info("TEST UNITARIOS SI DA ESTE ERROR HAY QUE CORREGIR EL OBJETO DEL DAO ");
		 sesion = sessionFactoryTest.getCurrentSession();
//		 tx = sesion.beginTransaction();
//		 tx.commit();
			return sesion;
	}
}
