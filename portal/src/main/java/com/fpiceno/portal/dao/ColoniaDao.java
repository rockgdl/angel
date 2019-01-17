package com.fpiceno.portal.dao;

import java.util.List;

import com.fpiceno.portal.entity.Colonia;



/**
 * Interfaz que determina el comportamiento de un Dao responsable de objetos aplicacion
 * @author Fabian Piceno Roque 
 */
public interface ColoniaDao {

	  /**
     * Agrega una colonia al repositorio
     * @param colonia  a ser agregada
     * @return Numero de identificaci�n �nico de la nueva aplicaci�n
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeDuplicidad Excepciones de duplicidad de registro que puedan presentarse
     */
	public int Agrega(Colonia colonia);
	  /**
     * Actualiza una colonia al repositorio
     * @param aplicacion Colonia a ser actualizada
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeDuplicidad Excepciones de duplicidad de registro que puedan presentarse
     * @throws ExcepcionDeActualizacion Excepciones de actualizaci�n de datos que puedan presentarse
     */
	public void Actualiza(Colonia colonia);
	  /**
     * Elimina una colonia al repositorio
     * @param Colonia colonia a ser eliminada
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeValidacion Excepciones de validaci�n que puedan presentarse
     */
	public void Elimina(Colonia colonia);
	  /**
     * Busca las colonias que concuerden con los valores de la aplicacion enviada
     * @param Colonia colonia a ser examinada para crear la b�squeda
     * @return List de las colonias encontradas
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeConsulta Excepciones de consulta que puedan presentarse
     */
	public List<Colonia > obtener();
	  /**
     * Busca las colonias que concuerden con los valores de la aplicacion enviada
     * @param Inger id de la colonia  a ser examinada para crear la b�squeda
     * @return Objeto colonia encontradas
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeConsulta Excepciones de consulta que puedan presentarse
     */
	public Colonia obtenerById(Integer id);

}
