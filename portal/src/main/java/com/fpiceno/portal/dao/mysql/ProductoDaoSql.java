package com.fpiceno.portal.dao.mysql;

import java.util.ArrayList;
import java.util.List;







import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.fpiceno.portal.dao.ProductoDao;
import com.fpiceno.portal.entity.Producto;

@Transactional
public class ProductoDaoSql implements ProductoDao {
	

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Integer Agrega(Producto producto) {
			System.out.println("entre al metodo*************: "+producto);
		   Session session= sessionFactory.getCurrentSession();
//		   Session session=getSession();
		  Integer id=(Integer) session.save(producto);
		  
		  
		  return id;
	}

	@Override
	public void Actualiza(Producto producto) {
			System.out.println("producto actualizado "+producto);
		   Session session= sessionFactory.getCurrentSession();
//		   Transaction tx=session.beginTransaction();
		   session.update(producto);
//		   tx.commit();
	}

	@Override
	public void Elimina(Producto producto) {
		   Session session= sessionFactory.getCurrentSession();
//		   Transaction trans=session.beginTransaction();
		   session.delete(producto);
//		   trans.commit();
	}

	@Override
	public List<Producto> obtenTodos() {
//		LOG.debug("REGRESANDO LA LISTA DE COLONIA ");
//		   Session session= sessionFactory.getCurrentSession();
////		   Transaction trans=session.beginTransaction();
//		Query query=session.createQuery("from Producto");
//		ArrayList<Producto> lista = (ArrayList<Producto>) query.list();
////		trans.commit();
//		return lista;
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Producto.class);

	    criteria.setFetchMode("users", FetchMode.EAGER);
	    //Other restrictions here as required.

	    return criteria.list();
	}

	@Override
	public Producto obtenById(Integer id) {
//		LOG.info("OBTENER COLONIA POR ID  ");
		   Session session= sessionFactory.getCurrentSession();
//		   Transaction trans=session.beginTransaction();
		   Producto producto=new Producto();
		producto =  (Producto) session.get(Producto.class, id);
//		trans.commit();
		return producto;
	}

	@Override
	public Producto obtenByName(Producto producto) {
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
