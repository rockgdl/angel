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
@Table (name="Estado")
public class Estado implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5451840631906467573L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idEstado;
	
	@Column(name="estado")
	private String estado;
	
	@Column(name="codigo")
	private String codigo;
	
	@Enumerated(EnumType.STRING)
	private Estatus estatus;
	
	

	public Integer getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
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
		return "Estado [idEstado=" + idEstado + ", estado=" + estado + ", codigo=" + codigo
				+ ", estatus=" + estatus + "]";
	}
	
	

}
