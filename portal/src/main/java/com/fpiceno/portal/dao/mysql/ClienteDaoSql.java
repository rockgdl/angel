package com.fpiceno.portal.dao.mysql;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.fpiceno.portal.dao.ClienteDao;
import com.fpiceno.portal.entity.Cliente;
import com.fpiceno.portal.entity.UserInfo;
@Transactional
public class ClienteDaoSql implements ClienteDao {

	private SessionFactory sessionFactory;
	
	@Override
	public void Agrega(Cliente cliente) {
		System.out.println("entre al metodo*************: "+cliente);
		   Session session= sessionFactory.getCurrentSession();
//		   Session session=getSession();
		  //Integer id=(Integer) session.save(user);
		   session.save(cliente);
	}

	@Override
	public void Actualiza(Cliente cliente) {
		   Session session= sessionFactory.getCurrentSession();
//		   Transaction tx=session.beginTransaction();
		   session.update(cliente);
	}

	@Override
	public void Elimina(Cliente cliente) {
		   Session session= sessionFactory.getCurrentSession();
//		   Transaction trans=session.beginTransaction();
		   session.delete(cliente);
	}

	@Override
	public List<Cliente> obtenTodos() {
		   Session session= sessionFactory.getCurrentSession();
//		   Transaction trans=session.beginTransaction();
		Query query=session.createQuery("from Cliente");
		ArrayList<Cliente> lista = (ArrayList<Cliente>) query.list();
//		trans.commit();
		return lista;		
	}

	@Override
	public Cliente obtenById(Integer id) {
//		LOG.info("OBTENER COLONIA POR ID  ");
		   Session session= sessionFactory.getCurrentSession();
//		   Transaction trans=session.beginTransaction();
		   Cliente cliente=new Cliente();
		cliente =  (Cliente) session.get(Cliente.class, id);
//		trans.commit();
		return cliente;
	}

	@Override
	public Cliente obtenByName(Cliente cliente) {
		// TODO Auto-generated method stub
		return null;
	}

}
