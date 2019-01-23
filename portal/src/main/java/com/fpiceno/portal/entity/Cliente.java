package com.fpiceno.portal.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;
@Entity
@Table (name="cliente")
public class Cliente implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3580833925615558343L;
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Integer id;
	@Column (name="nombrecomercial")
	private String nombreComercial;
	@Column (name="domicilio")
	private String Domicilio;
	@Column (name="telefono")
	private String telefono;
	@Column (name="correo")
	private String correo;
	@OneToMany(cascade= CascadeType.ALL)
	@JoinColumn(name="IdCliente")
	@IndexColumn(name="idx")
	private List<Pedidos> pedidos;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombreComercial() {
		return nombreComercial;
	}
	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}
	public String getDomicilio() {
		return Domicilio;
	}
	public void setDomicilio(String domicilio) {
		Domicilio = domicilio;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public List<Pedidos> getPedidos() {
		return pedidos;
	}
	public void setPedidos(List<Pedidos> pedidos) {
		this.pedidos = pedidos;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombreComercial=" + nombreComercial
				+ ", Domicilio=" + Domicilio + ", telefono=" + telefono
				+ ", correo=" + correo + ", pedidos=" + pedidos + "]";
	}
	
	
	

}
