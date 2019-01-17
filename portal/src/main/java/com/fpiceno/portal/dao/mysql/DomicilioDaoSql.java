package com.fpiceno.portal.dao.mysql;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.transaction.annotation.Transactional;

import com.fpiceno.portal.dao.DomicilioDao;
import com.fpiceno.portal.entity.Domicilio;

/**
 * Manejador de base de datos para los objetos domiclio, usando como motor
 * el componente de persistencia y el framework hibernate
 * @author Fabian Piceno Roque 
 */
@Transactional
public class DomicilioDaoSql implements DomicilioDao {

	
	public Session getSession() {
//		 Transaction tx;
		 Session sesion = null;
		 SessionFactory sessionFactoryTest=null;
		 sessionFactoryTest= new Configuration().configure("com/contpaq/facturacion/configuracion/hibernateSql.cfg.xml").buildSessionFactory();
//			sessionFactory=new Configuration().configure(_archivo).buildSessionFactory();
//			LOG.info("TEST UNITARIOS SI DA ESTE ERROR HAY QUE CORREGIR EL OBJETO DEL DAO ");
		 sesion = sessionFactoryTest.getCurrentSession();
//		 tx = sesion.beginTransaction();
//		 tx.commit();
		
			
			return sesion;
		

	}
	
	 /**
     * Agrega una domicilio al repositorio
     * @param domicilio  a ser agregada
     * @return Numero de identificaci�n �nico de la nueva aplicaci�n
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeDuplicidad Excepciones de duplicidad de registro que puedan presentarse
     */
	@Override
	public int Agrega(Domicilio domicilio) {
		 Session session=getSession();
		   Transaction trans=session.beginTransaction();
		  Integer id=(Integer) session.save(domicilio);
		   trans.commit();
		return id;
	}
	  /**
     * Actualiza una domicilio al repositorio
     * @param aplicacion domicilio a ser actualizada
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeDuplicidad Excepciones de duplicidad de registro que puedan presentarse
     * @throws ExcepcionDeActualizacion Excepciones de actualizaci�n de datos que puedan presentarse
     */
	@Override
	public void Actualiza(Domicilio domicilio) {
		   Session session=getSession();
		   Transaction trans=session.beginTransaction();
		session.update(domicilio);
		trans.commit();
	}
	  /**
     * Elimina una domicilio al repositorio
     * @param domicilio domicilio a ser eliminada
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeValidacion Excepciones de validaci�n que puedan presentarse
     */
	@Override
	public void Elimina(Domicilio domicilio) {
		   Session session=getSession();
		   Transaction trans=session.beginTransaction();
		session.delete(domicilio);
		trans.commit();
	}
	  /**
     * Busca las domicilios que concuerden con los valores de la aplicacion enviada
     * @param domicilio domicilio a ser examinada para crear la b�squeda
     * @return List de las domicilios encontradas
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeConsulta Excepciones de consulta que puedan presentarse
     */
	@Override
	public List<Domicilio> obtener() {
//		LOG.debug("REGRESANDO LA LISTA DE domicilio ");
		   Session session=getSession();
		   Transaction trans=session.beginTransaction();
		Query query=session.createQuery("from Domicilio");
		ArrayList<Domicilio> lista = (ArrayList<Domicilio>) query.list();
		trans.commit();
		return lista;
	}
	  /**
     * Busca las domicilios que concuerden con los valores de la aplicacion enviada
     * @param Inger id de la domicilio  a ser examinada para crear la b�squeda
     * @return Objeto domicilio encontradas
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeConsulta Excepciones de consulta que puedan presentarse
     */
	@Override
	public Domicilio obtenerById(Integer id) {
//		LOG.info("OBTENER domicilio POR ID  ");
		   Session session=getSession();
		   Transaction trans=session.beginTransaction();
		Domicilio domicilio=new Domicilio();
		domicilio =  (Domicilio) session.get(Domicilio.class, id);
		trans.commit();
		return domicilio;
	}

}
