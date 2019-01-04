package com.fpiceno.portal.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name="producto")
public class Producto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2430337304289234787L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	@Column (name="nombre")
	private String nombre;
	@Column (name="fechaAlta")
	private Date fechaAlta;
	@Column (name="fechaModificacion")
	private Date fechaModificacion;
	@Enumerated(EnumType.STRING)
	private TipoCalidad tipoCalidad;
	@Enumerated(EnumType.STRING)
	private UnidadMedida unidad;
	@Column (name="observaciones")
	private String observaciones;
	@Column (name="precio")
	private Double precio;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public TipoCalidad getTipoCalidad() {
		return tipoCalidad;
	}
	public void setTipoCalidad(TipoCalidad tipoCalidad) {
		this.tipoCalidad = tipoCalidad;
	}
	public UnidadMedida getUnidad() {
		return unidad;
	}
	public void setUnidad(UnidadMedida unidad) {
		this.unidad = unidad;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", fechaAlta="
				+ fechaAlta + ", fechaModificacion=" + fechaModificacion
				+ ", tipoCalidad=" + tipoCalidad + ", unidad=" + unidad
				+ ", observaciones=" + observaciones + ", precio=" + precio
				+ "]";
	}


}
