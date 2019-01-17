package com.fpiceno.portal.dao;

import java.util.List;

import com.contpaq.facturacion.dto.Estado;

/**
 * Interfaz que determina el comportamiento de un Dao responsable de objetos estado
 * @author Fabian Piceno Roque 
 */
public interface EstadoDao {
	 /**
     * Agrega una estado al repositorio
     * @param estado  a ser agregada
     * @return Numero de identificaci�n �nico de la nueva aplicaci�n
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeDuplicidad Excepciones de duplicidad de registro que puedan presentarse
     */
	public int Agrega(Estado estado);
	  /**
     * Actualiza una estado al repositorio
     * @param aplicacion estado a ser actualizada
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeDuplicidad Excepciones de duplicidad de registro que puedan presentarse
     * @throws ExcepcionDeActualizacion Excepciones de actualizaci�n de datos que puedan presentarse
     */
	public void Actualiza(Estado estado);
	  /**
     * Elimina una estado al repositorio
     * @param estado estado a ser eliminada
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeValidacion Excepciones de validaci�n que puedan presentarse
     */
	public void Elimina(Estado estado);
	  /**
     * Busca las estado que concuerden con los valores de la aplicacion enviada
     * @param estado estado a ser examinada para crear la b�squeda
     * @return List de las estado encontradas
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeConsulta Excepciones de consulta que puedan presentarse
     */
	public List<Estado  > obtener();
	  /**
     * Busca las estado que concuerden con los valores de la aplicacion enviada
     * @param Inger id de la estado  a ser examinada para crear la b�squeda
     * @return Objeto estado encontradas
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeConsulta Excepciones de consulta que puedan presentarse
     */
	public Estado  obtenerById(Integer id);
}
