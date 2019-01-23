package com.fpiceno.portal.dao.mysql;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.fpiceno.portal.dao.PedidosDao;
import com.fpiceno.portal.entity.Cliente;
import com.fpiceno.portal.entity.Pedidos;
@Transactional
public class PedidosDaoSql implements PedidosDao {
	
	private SessionFactory sessionFactory;

	@Override
	public void Agrega(Pedidos pedidos) {
		System.out.println("entre al metodo*************: "+pedidos);
		   Session session= sessionFactory.getCurrentSession();
//		   Session session=getSession();
		  //Integer id=(Integer) session.save(user);
		   session.save(pedidos);
	}

	@Override
	public void Actualiza(Pedidos pedidos) {
		   Session session= sessionFactory.getCurrentSession();
//		   Transaction tx=session.beginTransaction();
		   session.update(pedidos);
	}

	@Override
	public void Elimina(Pedidos pedidos) {
		Session session= sessionFactory.getCurrentSession();
//		   Transaction trans=session.beginTransaction();
		   session.delete(pedidos);
	}

	@Override
	public List<Pedidos> obtenTodos() {

		   Session session= sessionFactory.getCurrentSession();
//		   Transaction trans=session.beginTransaction();
		Query query=session.createQuery("from Pedidos");
		ArrayList<Pedidos> lista = (ArrayList<Pedidos>) query.list();
//		trans.commit();
		return lista;	}

	@Override
	public Pedidos obtenById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pedidos obtenByName(Pedidos pedidos) {
		// TODO Auto-generated method stub
		return null;
	}

}
