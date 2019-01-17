package com.fpiceno.portal.dao.mysql;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.transaction.annotation.Transactional;

import com.fpiceno.portal.dao.EstadoDao;
import com.fpiceno.portal.entity.Estado;

/**
 * Interfaz que determina el comportamiento de un Dao responsable de objetos de estado
 * @author Fabian Piceno Roque 
 */
@Transactional
public class EstadoDaoSql implements EstadoDao {
	
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
     * Agrega una estado al repositorio
     * @param estado  a ser agregada
     * @return Numero de identificaci�n �nico de la nueva aplicaci�n
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeDuplicidad Excepciones de duplicidad de registro que puedan presentarse
     */
	@Override
	public int Agrega(Estado estado) {
		   Session session=getSession();
		   Transaction trans=session.beginTransaction();
		  Integer id=(Integer) session.save(estado);
		   trans.commit();
		return id;
	}
	  /**
     * Actualiza una estado al repositorio
     * @param aplicacion estado a ser actualizada
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeDuplicidad Excepciones de duplicidad de registro que puedan presentarse
     * @throws ExcepcionDeActualizacion Excepciones de actualizaci�n de datos que puedan presentarse
     */
	@Override
	public void Actualiza(Estado estado) {
		   Session session=getSession();
		   Transaction trans=session.beginTransaction();
		session.update(estado);
		trans.commit();
	}
	  /**
     * Elimina una estado al repositorio
     * @param estado estado a ser eliminada
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeValidacion Excepciones de validaci�n que puedan presentarse
     */
	@Override
	public void Elimina(Estado estado) {
		   Session session=getSession();
		   Transaction trans=session.beginTransaction();
		session.delete(estado);
		trans.commit();
	}
	  /**
     * Busca las estado que concuerden con los valores de la aplicacion enviada
     * @param estado estado a ser examinada para crear la b�squeda
     * @return List de las estado encontradas
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeConsulta Excepciones de consulta que puedan presentarse
     */
	@Override
	public List<Estado> obtener() {
//		LOG.debug("REGRESANDO LA LISTA DE Estado ");
		   Session session=getSession();
		   Transaction trans=session.beginTransaction();
		Query query=session.createQuery("from Estado");
		ArrayList<Estado> lista = (ArrayList<Estado>) query.list();
		trans.commit();
		return lista;
	}
	  /**
     * Busca las estado que concuerden con los valores de la aplicacion enviada
     * @param Inger id de la estado  a ser examinada para crear la b�squeda
     * @return Objeto estado encontradas
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeConsulta Excepciones de consulta que puedan presentarse
     */
	@Override
	public Estado obtenerById(Integer id) {
//		LOG.info("OBTENER ESTADO POR ID  ");
		   Session session=getSession();
		   Transaction trans=session.beginTransaction();
		Estado estado=new Estado();
		estado =  (Estado) session.get(Estado.class, id);
		trans.commit();
		return estado;
	}

}
