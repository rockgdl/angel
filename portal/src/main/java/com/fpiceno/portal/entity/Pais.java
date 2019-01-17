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
@Table (name="Pais")
public class Pais implements Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5343140082635186491L;
	
	@Id
	@GeneratedValue (strategy=GenerationType.AUTO)
	private Integer idPais;
	
	@Column (name="pais")
	private String pais;
	
	@Column (name="codigo")
	private String codigo;
	
	@Column (name="codigoPais")
	private String codigoPais;
	
	@Enumerated(EnumType.STRING)
	private Estatus estatus;
	
	
	
	public Integer getIdPais() {
		return idPais;
	}
	public void setIdPais(Integer idPais) {
		this.idPais = idPais;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
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
	public String getCodigoPais() {
		return codigoPais;
	}
	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}
	
	@Override
	public String toString() {
		return "Pais [idPais=" + idPais + ", pais=" + pais + ", codigo="
				+ codigo + ", codigoPais=" + codigoPais + ", estatus="
				+ estatus + "]";
	}

	

	
	
}
