package com.fpiceno.portal.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
	@Column (name="fechaalta", updatable=false)
	private Date fechaAlta;
	@Column (name="fechamodificacion")
	private Date fechaModificacion;
	@Column (name="activo")
	private Integer activo;
//	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
//	private List<Producto>productos;
	@ManyToMany( fetch=FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE },targetEntity=Producto.class)
	@JoinTable( name = "pedidos_productos",joinColumns = @JoinColumn(name = "productos_id"),inverseJoinColumns = @JoinColumn(name = "pedidos_id"))
	private Set<Producto> productos = new HashSet<Producto>();
	
	
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
	public Set<Producto> getProductos() {
		return productos;
	}
	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}
	@Override
	public String toString() {
		return "Pedidos [numPedido=" + numPedido + ", fechaAlta=" + fechaAlta
				+ ", fechaModificacion=" + fechaModificacion + ", activo="
				+ activo + ", productos=" + productos + "]";
	}
	

}
