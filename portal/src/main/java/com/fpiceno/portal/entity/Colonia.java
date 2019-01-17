package com.contpaq.facturacion.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name="Colonia")
public class Colonia implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1991381091854732262L;
	@Id
	@GeneratedValue	(strategy=GenerationType.AUTO)
	private Integer idColonia;
	@Column(name="colonia", length=70)
	private String colonia;
	@Column(name="codigo")
	private String codigo;
	@Enumerated(EnumType.STRING)
	private Estatus estatus;
	
	
	
	
	
	public Integer getIdColonia() {
		return idColonia;
	}
	public void setIdColonia(Integer idColonia) {
		this.idColonia = idColonia;
	}
	public String getColonia() {
		return colonia;
	}
	public void setColonia(String colonia) {
		this.colonia = colonia;
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
		return "Colonia [idColonia=" + idColonia + ", colonia=" + colonia
				+ ", codigo=" + codigo + ", estatus=" + estatus + "]";
	}

	
	
}
