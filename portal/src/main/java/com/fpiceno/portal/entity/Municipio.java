package com.fpiceno.portal.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Municipio")

public class Municipio implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1692280637521557182L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idMunicipio;
	
	@Column (name="municipio")
	private String municipio;
	
	@Column (name="codigo")
	private String codigo;
	
	@Enumerated(EnumType.STRING)
	private Estatus estatus;

	
	

	public Integer getIdMunicipio() {
		return idMunicipio;
	}
	public void setIdMunicipio(Integer idMunicipio) {
		this.idMunicipio = idMunicipio;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Estatus getEstatus() {
		return estatus;
	}
	public void setEstatus(Estatus estatus) {
		this.estatus = estatus;
	}
	@Override
	public String toString() {
		return "Municipio [idMunicipio=" + idMunicipio + ", municipio=" + municipio + ", codigo="
				+ codigo + ", estatus=" + estatus + "]";
	}
	

	
	
}
