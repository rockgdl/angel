package com.fpiceno.portal.dao.mysql;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.fpiceno.portal.dao.PedidosDao;
import com.fpiceno.portal.entity.Cliente;
import com.fpiceno.portal.entity.Pedidos;
import com.fpiceno.portal.entity.UserInfo;
@Transactional
public class PedidosDaoSql implements PedidosDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Integer Agrega(Pedidos pedidos) {
//		System.out.println("entre al metodo*************: "+pedidos);
		   Session session= sessionFactory.getCurrentSession();
//		   Session session=getSession();
		  //Integer id=(Integer) session.save(user);
		   return (Integer) session.save(pedidos);
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

		   Session session= sessionFactory.getCurrentSession();
//		   Transaction trans=session.beginTransaction();
		   Pedidos pedidos=new Pedidos();
		pedidos =  (Pedidos) session.get(Pedidos.class, id);
		return pedidos;
	}

	@Override
	public Pedidos obtenByName(Pedidos pedidos) {
		// TODO Auto-generated method stub
		return null;
	}

}
