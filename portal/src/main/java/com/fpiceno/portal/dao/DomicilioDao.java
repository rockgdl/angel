package com.fpiceno.portal.dao;

import java.util.List;

import com.fpiceno.portal.entity.Domicilio;


/**
 * Interfaz que determina el comportamiento de un Dao responsable de objetos domicilio
 * @author Fabian Piceno Roque 
 */
public interface DomicilioDao {
	 /**
     * Agrega una domicilio al repositorio
     * @param domicilio  a ser agregada
     * @return Numero de identificaci�n �nico de la nueva aplicaci�n
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeDuplicidad Excepciones de duplicidad de registro que puedan presentarse
     */
	public int Agrega(Domicilio domicilio);
	  /**
     * Actualiza una domicilio al repositorio
     * @param aplicacion domicilio a ser actualizada
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeDuplicidad Excepciones de duplicidad de registro que puedan presentarse
     * @throws ExcepcionDeActualizacion Excepciones de actualizaci�n de datos que puedan presentarse
     */
	public void Actualiza(Domicilio domicilio);
	  /**
     * Elimina una domicilio al repositorio
     * @param domicilio domicilio a ser eliminada
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeValidacion Excepciones de validaci�n que puedan presentarse
     */
	public void Elimina(Domicilio domicilio);
	  /**
     * Busca las domicilios que concuerden con los valores de la aplicacion enviada
     * @param domicilio domicilio a ser examinada para crear la b�squeda
     * @return List de las domicilios encontradas
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeConsulta Excepciones de consulta que puedan presentarse
     */
	public List<Domicilio  > obtener();
	  /**
     * Busca las domicilios que concuerden con los valores de la aplicacion enviada
     * @param Inger id de la domicilio  a ser examinada para crear la b�squeda
     * @return Objeto domicilio encontradas
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeConsulta Excepciones de consulta que puedan presentarse
     */
	public Domicilio  obtenerById(Integer id);
}
