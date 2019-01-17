package com.fpiceno.portal.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.fpiceno.portal.entity.Pais;

/**
 * Interfaz que determina el comportamiento de un Dao responsable de objetos pais
 * @author Fabian Piceno Roque 
 */
@Component
@Service
public interface PaisDao {
	 /**
     * Agrega una pais al repositorio
     * @param pais  a ser agregada
     * @return Numero de identificaci�n �nico de la nueva aplicaci�n
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeDuplicidad Excepciones de duplicidad de registro que puedan presentarse
     */
	public int Agrega(Pais pais);
	  /**
     * Actualiza una pais al repositorio
     * @param aplicacion pais a ser actualizada
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeDuplicidad Excepciones de duplicidad de registro que puedan presentarse
     * @throws ExcepcionDeActualizacion Excepciones de actualizaci�n de datos que puedan presentarse
     */
	public void Actualiza(Pais pais);
	  /**
     * Elimina una pais al repositorio
     * @param pais pais a ser eliminada
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeValidacion Excepciones de validaci�n que puedan presentarse
     */
	public void Elimina(Pais pais);
	  /**
     * Busca las paiss que concuerden con los valores de la aplicacion enviada
     * @param pais pais a ser examinada para crear la b�squeda
     * @return List de las paiss encontradas
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeConsulta Excepciones de consulta que puedan presentarse
     */
	public List<Pais > obtener();
	  /**
     * Busca las paiss que concuerden con los valores de la aplicacion enviada
     * @param Inger id de la pais  a ser examinada para crear la b�squeda
     * @return Objeto pais encontradas
     * @throws ExcepcionDeConexion Excepciones de conexion a la base de datos que puedan presentarse
     * @throws ExcepcionDeConsulta Excepciones de consulta que puedan presentarse
     */
	public Pais  obtenerById(Integer id);

}
