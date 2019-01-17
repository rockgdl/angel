package com.fpiceno.portal.dao.mysql;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;

import com.fpiceno.portal.dao.PaisDao;
import com.fpiceno.portal.entity.Pais;
/**
 * Interfaz que determina el comportamiento de un Dao responsable de objetos pais
 * @author Fabian Piceno Roque 
 */
public class PaisDaoSql implements PaisDao {
	@Autowired
	private SessionFactory sessionFactory;
	public Session getSession() {
//		 Transaction tx;
		 Session sesion = sessionFactory.getCurrentSession();

		 
			return sesion;
	}
	 /**
     * Agrega una pais al repositorio
     * @param pais  a ser agregada
     * @return Numero de identificaci�n �nico de la nueva aplicaci�n
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeDuplicidad Excepciones de duplicidad de registro que puedan presentarse
     */
	@Override
	public int Agrega(Pais pais) {
		   Session session=getSession();
		  Integer id=(Integer) session.save(pais);
		return id;
	}
	  /**
     * Actualiza una pais al repositorio
     * @param aplicacion pais a ser actualizada
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeDuplicidad Excepciones de duplicidad de registro que puedan presentarse
     * @throws ExcepcionDeActualizacion Excepciones de actualizaci�n de datos que puedan presentarse
     */
	@Override
	public void Actualiza(Pais pais) {
		   Session session=getSession();
		   Transaction trans=session.beginTransaction();
		session.update(pais);
		trans.commit();
	}
	  /**
     * Elimina una pais al repositorio
     * @param pais pais a ser eliminada
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeValidacion Excepciones de validaci�n que puedan presentarse
     */
	@Override
	public void Elimina(Pais pais) {
		   Session session=getSession();
		   Transaction trans=session.beginTransaction();
		session.delete(pais);
		trans.commit();
	}
	  /**
     * Busca las paiss que concuerden con los valores de la aplicacion enviada
     * @param pais pais a ser examinada para crear la b�squeda
     * @return List de las paiss encontradas
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeConsulta Excepciones de consulta que puedan presentarse
     */
	@Override
	public List<Pais> obtener() {
//		LOG.debug("REGRESANDO LA LISTA DE PAIS ");
		   Session session=getSession();
		   Transaction trans=session.beginTransaction();
		Query query=session.createQuery("from Pais");
		ArrayList<Pais> lista = (ArrayList<Pais>) query.list();
		trans.commit();
		return lista;
	}
	  /**
     * Busca las paiss que concuerden con los valores de la aplicacion enviada
     * @param Inger id de la pais  a ser examinada para crear la b�squeda
     * @return Objeto pais encontradas
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeConsulta Excepciones de consulta que puedan presentarse
     */
	@Override
	public Pais obtenerById(Integer id) {
//		LOG.info("OBTENER PAIS POR ID  ");
		   Session session=getSession();
		   Transaction trans=session.beginTransaction();
		Pais pais=new Pais();
		pais =  (Pais) session.get(Pais.class, id);
		trans.commit();
		return pais;
	}

}
