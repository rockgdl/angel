package com.fpiceno.portal.dao.mysql;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.fpiceno.portal.dao.CorreoDao;
import com.fpiceno.portal.entity.Correo;


@Transactional
public class CorreroDaoMysql implements CorreoDao{
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Integer Agrega(Correo correo) {
			System.out.println("entre al metodo*************: "+correo);
		   Session session= sessionFactory.getCurrentSession();
//		   Session session=getSession();
		  Integer id=(Integer) session.save(correo);
		  
		  
		  return id;
	}

	@Override
	public void Actualiza(Correo correo) {
		   Session session= sessionFactory.getCurrentSession();
//		   Transaction tx=session.beginTransaction();
		   session.update(correo);
//		   tx.commit();
	}

	@Override
	public void Elimina(Correo correo) {
		   Session session= sessionFactory.getCurrentSession();
//		   Transaction trans=session.beginTransaction();
		   session.delete(correo);
//		   trans.commit();
	}

	@Override
	public List<Correo> obtenTodos() {
//		LOG.debug("REGRESANDO LA LISTA DE COLONIA ");
		   Session session= sessionFactory.getCurrentSession();
//		   Transaction trans=session.beginTransaction();
		Query query=session.createQuery("from Producto");
		ArrayList<Correo> lista = (ArrayList<Correo>) query.list();
//		trans.commit();
		return lista;
	}

	@Override
	public Correo obtenById(Integer id) {
//		LOG.info("OBTENER COLONIA POR ID  ");
		   Session session= sessionFactory.getCurrentSession();
//		   Transaction trans=session.beginTransaction();
		   Correo correo=new Correo();
		correo =  (Correo) session.get(Correo.class, id);
//		trans.commit();
		return correo;
	}

	@Override
	public Correo obtenByName(Correo correo) {
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
