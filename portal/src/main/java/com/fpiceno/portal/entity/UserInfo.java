package com.fpiceno.portal.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="users")
public class UserInfo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4350880260781380682L;
	@Id
	@Column(name="username")
	private String username;
	@Column
	private String password;
	@Column
	private String role;
	@Column(name="full_name")
	private String fullName;
	@Column
	private String country;
	@Column
	private short enabled;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public short getEnabled() {
		return enabled;
	}
	public void setEnabled(short enabled) {
		this.enabled = enabled;
	}
	@Override
	public String toString() {
		return "UserInfo [username=" + username + ", password=" + password + ", role=" + role + ", fullName=" + fullName
				+ ", country=" + country + ", enabled=" + enabled + "]";
	}
	
}
