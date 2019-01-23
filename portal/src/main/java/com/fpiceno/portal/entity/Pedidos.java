package com.fpiceno.portal.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table (name="pedidos")
public class Pedidos  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8334077007269511707L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer numPedido;
	@Column (name="fechaalta")
	private Date fechaAlta;
	@Column (name="fechamodificacion")
	private Date fechaModificacion;
	@Column (name="activo")
	private Integer activo;
	@ManyToOne
	@JoinColumn(name="IdCliente")
	private List<Producto> productos;
	public Integer getNumPedido() {
		return numPedido;
	}
	public void setNumPedido(Integer numPedido) {
		this.numPedido = numPedido;
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
	public Integer getActivo() {
		return activo;
	}
	public void setActivo(Integer activo) {
		this.activo = activo;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	@Override
	public String toString() {
		return "Pedidos [numPedido=" + numPedido + ", fechaAlta=" + fechaAlta
				+ ", fechaModificacion=" + fechaModificacion + ", activo="
				+ activo + ", productos=" + productos + "]";
	}
	

}
