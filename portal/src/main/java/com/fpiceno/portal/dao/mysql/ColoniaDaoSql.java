package com.fpiceno.portal.dao.mysql;

import java.util.ArrayList;
import java.util.List;

//import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.fpiceno.portal.dao.ColoniaDao;
import com.fpiceno.portal.entity.Colonia;

/**
 * Manejador de base de datos para los objetos colonias, usando como motor
 * el componente de persistencia y el framework hibernate
 * @author Fabian Piceno Roque 
 */
public class ColoniaDaoSql implements ColoniaDao {
//	private final static Logger LOG = Logger.getLogger(EquipoDaoHibernate.class);

	
	private SessionFactory sessionFactory;
	
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
     * Agrega una colonia al repositorio
     * @param colonia  a ser agregada
     * @return Numero de identificaci�n �nico de la nueva aplicaci�n
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeDuplicidad Excepciones de duplicidad de registro que puedan presentarse
     */
	@Override
	public int Agrega(Colonia colonia) {
		   Session session=getSession();
		   Transaction trans=session.beginTransaction();
		  Integer id=(Integer) session.save(colonia);
		   trans.commit();
		return id;
	}
	  /**
     * Actualiza una colonia al repositorio
     * @param aplicacion Colonia a ser actualizada
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeDuplicidad Excepciones de duplicidad de registro que puedan presentarse
     * @throws ExcepcionDeActualizacion Excepciones de actualizaci�n de datos que puedan presentarse
     */
	@Override
	public void Actualiza(Colonia colonia) {
		   Session session=getSession();
		   Transaction trans=session.beginTransaction();
		session.update(colonia);
		trans.commit();
	}
	  /**
     * Elimina una colonia al repositorio
     * @param Colonia colonia a ser eliminada
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeValidacion Excepciones de validaci�n que puedan presentarse
     */
	@Override
	public void Elimina(Colonia colonia) {
		   Session session=getSession();
		   Transaction trans=session.beginTransaction();
		session.delete(colonia);
		trans.commit();

	}
	 /**
     * Busca las colonias que concuerden con los valores de la aplicacion enviada
     * @param Colonia colonia a ser examinada para crear la b�squeda
     * @return List de las colonias encontradas
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeConsulta Excepciones de consulta que puedan presentarse
     */
	@Override
	public List<Colonia> obtener() {
//		LOG.debug("REGRESANDO LA LISTA DE COLONIA ");
		   Session session=getSession();
		   Transaction trans=session.beginTransaction();
		Query query=session.createQuery("from Colonia");
		ArrayList<Colonia> lista = (ArrayList<Colonia>) query.list();
		trans.commit();
		return lista;
	}
	  /**
     * Busca las colonias que concuerden con los valores de la aplicacion enviada
     * @param Inger id de la colonia  a ser examinada para crear la b�squeda
     * @return Objeto colonia encontradas
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeConsulta Excepciones de consulta que puedan presentarse
     */
	@Override
	public Colonia obtenerById(Integer id) {
//		LOG.info("OBTENER COLONIA POR ID  ");
		   Session session=getSession();
		   Transaction trans=session.beginTransaction();
		Colonia colonia=new Colonia();
		colonia =  (Colonia) session.get(Colonia.class, id);
		trans.commit();
		return colonia;
	}

}
