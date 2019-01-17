package com.fpiceno.portal.dao.mysql;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.transaction.annotation.Transactional;

import com.fpiceno.portal.dao.MunicipioDao;
import com.fpiceno.portal.entity.Municipio;
/**
 * Interfaz que determina el comportamiento de un Dao responsable de objetos municipio
 * @author Fabian Piceno Roque 
 */
@Transactional
public class MunicipioDaoSql implements MunicipioDao {
	
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
     * Agrega una municipio al repositorio
     * @param municipio  a ser agregada
     * @return Numero de identificaci�n �nico de la nueva aplicaci�n
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeDuplicidad Excepciones de duplicidad de registro que puedan presentarse
     */
	@Override
	public int Agrega(Municipio municipio) {
		   Session session=getSession();
		   Transaction trans=session.beginTransaction();
		  Integer id=(Integer) session.save(municipio);
		   trans.commit();
		return id;
	}
	  /**
     * Actualiza una municipio al repositorio
     * @param aplicacion municipio a ser actualizada
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeDuplicidad Excepciones de duplicidad de registro que puedan presentarse
     * @throws ExcepcionDeActualizacion Excepciones de actualizaci�n de datos que puedan presentarse
     */
	@Override
	public void Actualiza(Municipio municipio) {
		   Session session=getSession();
		   Transaction trans=session.beginTransaction();
		session.update(municipio);
		trans.commit();
	}
	  /**
     * Elimina una municipio al repositorio
     * @param municipio municipio a ser eliminada
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeValidacion Excepciones de validaci�n que puedan presentarse
     */
	@Override
	public void Elimina(Municipio municipio) {
		   Session session=getSession();
		   Transaction trans=session.beginTransaction();
		session.delete(municipio);
		trans.commit();
	}
	  /**
     * Busca las municipios que concuerden con los valores de la aplicacion enviada
     * @param municipio municipio a ser examinada para crear la b�squeda
     * @return List de las municipios encontradas
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeConsulta Excepciones de consulta que puedan presentarse
     */
	@Override
	public List<Municipio> obtener() {
//		LOG.debug("REGRESANDO LA LISTA DE MUNICIPIO ");
		   Session session=getSession();
		   Transaction trans=session.beginTransaction();
		Query query=session.createQuery("from Municipio");
		ArrayList<Municipio> lista = (ArrayList<Municipio>) query.list();
		trans.commit();
		return lista;
	}
	  /**
     * Busca las municipios que concuerden con los valores de la aplicacion enviada
     * @param Inger id de la municipio  a ser examinada para crear la b�squeda
     * @return Objeto municipio encontradas
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeConsulta Excepciones de consulta que puedan presentarse
     */
	@Override
	public Municipio obtenerById(Integer id) {
//		LOG.info("OBTENER MUNICIPIO POR ID  ");
		   Session session=getSession();
		   Transaction trans=session.beginTransaction();
		Municipio municipio=new Municipio();
		municipio =  (Municipio) session.get(Municipio.class, id);
		trans.commit();
		return municipio;
	}

}
