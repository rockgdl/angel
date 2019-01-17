package com.fpiceno.portal.dao;

import java.util.List;

import com.contpaq.facturacion.dto.Municipio;
/**
 * Interfaz que determina el comportamiento de un Dao responsable de objetos municipio
 * @author Fabian Piceno Roque 
 */
public interface MunicipioDao {
	 /**
     * Agrega una municipio al repositorio
     * @param municipio  a ser agregada
     * @return Numero de identificaci�n �nico de la nueva aplicaci�n
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeDuplicidad Excepciones de duplicidad de registro que puedan presentarse
     */
	public int Agrega(Municipio municipio);
	  /**
     * Actualiza una municipio al repositorio
     * @param aplicacion municipio a ser actualizada
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeDuplicidad Excepciones de duplicidad de registro que puedan presentarse
     * @throws ExcepcionDeActualizacion Excepciones de actualizaci�n de datos que puedan presentarse
     */
	public void Actualiza(Municipio municipio);
	  /**
     * Elimina una municipio al repositorio
     * @param municipio municipio a ser eliminada
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeValidacion Excepciones de validaci�n que puedan presentarse
     */
	public void Elimina(Municipio municipio);
	  /**
     * Busca las municipios que concuerden con los valores de la aplicacion enviada
     * @param municipio municipio a ser examinada para crear la b�squeda
     * @return List de las municipios encontradas
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeConsulta Excepciones de consulta que puedan presentarse
     */
	public List<Municipio  > obtener();
	  /**
     * Busca las municipios que concuerden con los valores de la aplicacion enviada
     * @param Inger id de la municipio  a ser examinada para crear la b�squeda
     * @return Objeto municipio encontradas
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeConsulta Excepciones de consulta que puedan presentarse
     */
	public Municipio   obtenerById(Integer id);
}
