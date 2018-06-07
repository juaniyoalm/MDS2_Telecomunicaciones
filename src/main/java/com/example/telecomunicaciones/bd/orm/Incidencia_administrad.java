/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: juani(University of Almeria)
 * License Type: Academic
 */
package com.example.telecomunicaciones.bd.orm;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorValue("Incidencia_administrad")
public class Incidencia_administrad extends com.example.telecomunicaciones.bd.orm.Incidencia implements Serializable {
	public Incidencia_administrad() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_INCIDENCIA_ADMINISTRAD_ADMINISTRADOR) {
			this.administrador = (com.example.telecomunicaciones.bd.orm.Administrador) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@ManyToOne(targetEntity=com.example.telecomunicaciones.bd.orm.Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="AdministradorIDAdmin", referencedColumnName="IDAdmin", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private com.example.telecomunicaciones.bd.orm.Administrador administrador;
	
	@Column(name="CorreoComercial", nullable=true, length=255)	
	private String correoComercial;
	
	public void setCorreoComercial(String value) {
		this.correoComercial = value;
	}
	
	public String getCorreoComercial() {
		return correoComercial;
	}
	
	public void setAdministrador(com.example.telecomunicaciones.bd.orm.Administrador value) {
		if (administrador != null) {
			administrador.incidencia_administrad.remove(this);
		}
		if (value != null) {
			value.incidencia_administrad.add(this);
		}
	}
	
	public com.example.telecomunicaciones.bd.orm.Administrador getAdministrador() {
		return administrador;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Administrador(com.example.telecomunicaciones.bd.orm.Administrador value) {
		this.administrador = value;
	}
	
	private com.example.telecomunicaciones.bd.orm.Administrador getORM_Administrador() {
		return administrador;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
