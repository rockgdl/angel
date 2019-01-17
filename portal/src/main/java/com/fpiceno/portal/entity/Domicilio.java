package com.contpaq.facturacion.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="Domicilio")

public class Domicilio {
	


	@Id
	@GeneratedValue	(strategy=GenerationType.AUTO)
	private Integer idDomicilio;
	
	
	@Column(name="calle")
	private String calle;
	
	@Column(name="numeroExterior")
	private String numeroExterior;
	
	@Column(name="numeroInterior")
	private String numeroInterior;
	
	@Column(name="redenciaCalles")
	private String refenciaCalles;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idColonia")
	private Colonia colonia;
	
	@Column(name="localidad")
	private String localidad;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idMunicipio")
	private Municipio municipio;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idEstado")
	private Estado estado;
	
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="idPais")
	private Pais pais;
	
	@Enumerated(EnumType.STRING)
	private Estatus estatus;
	
	

	public Integer getIdDomicilio() {
		return idDomicilio;
	}
	public void setIdDomicilio(Integer idDomicilio) {
		this.idDomicilio = idDomicilio;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getNumeroExterior() {
		return numeroExterior;
	}
	public void setNumeroExterior(String numeroExterior) {
		this.numeroExterior = numeroExterior;
	}
	public String getNumeroInterior() {
		return numeroInterior;
	}
	public void setNumeroInterior(String numeroInterior) {
		this.numeroInterior = numeroInterior;
	}
	public String getRefenciaCalles() {
		return refenciaCalles;
	}
	public void setRefenciaCalles(String refenciaCalles) {
		this.refenciaCalles = refenciaCalles;
	}
	public Colonia getColonia() {
		return colonia;
	}
	public void setColonia(Colonia colonia) {
		this.colonia = colonia;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public Municipio getMunicipio() {
		return municipio;
	}
	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Estatus getEstatus() {
		return estatus;
	}
	public void setEstatus(Estatus estatus) {
		this.estatus = estatus;
	}
	@Override
	public String toString() {
		return "Domicilio [idDomicilio=" + idDomicilio + ", calle=" + calle + ", numeroExterior="
				+ numeroExterior + ", numeroInterior=" + numeroInterior
				+ ", refenciaCalles=" + refenciaCalles + ", colonia=" + colonia
				+ ", localidad=" + localidad + ", municipio=" + municipio
				+ ", estado=" + estado + ", pais=" + pais + ", estatus="
				+ estatus + "]";
	}

	
	

}
