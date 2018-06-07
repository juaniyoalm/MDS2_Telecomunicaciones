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
@Table(name="Administrador")
public class Administrador implements Serializable {
	public Administrador() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ADMINISTRADOR_CLIENTE) {
			return ORM_cliente;
		}
		else if (key == ORMConstants.KEY_ADMINISTRADOR_COMERCIAL) {
			return ORM_comercial;
		}
		else if (key == ORMConstants.KEY_ADMINISTRADOR_INCIDENCIA_ADMINISTRAD) {
			return ORM_incidencia_administrad;
		}
		else if (key == ORMConstants.KEY_ADMINISTRADOR_SERVICIODESTACADO) {
			return ORM_servicioDestacado;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="IDAdmin", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="COM_EXAMPLE_TELECOMUNICACIONES_BD_ORM_ADMINISTRADOR_IDADMIN_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_TELECOMUNICACIONES_BD_ORM_ADMINISTRADOR_IDADMIN_GENERATOR", strategy="native")	
	private int IDAdmin;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Apellido1", nullable=true, length=255)	
	private String apellido1;
	
	@Column(name="Apellido2", nullable=true, length=255)	
	private String apellido2;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="Nif", nullable=true, length=255)	
	private String nif;
	
	@Column(name="Password", nullable=true, length=255)	
	private String password;
	
	@OneToMany(mappedBy="administrador", targetEntity=com.example.telecomunicaciones.bd.orm.Cliente.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_cliente = new java.util.HashSet();
	
	@OneToMany(mappedBy="administrador", targetEntity=com.example.telecomunicaciones.bd.orm.Comercial.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_comercial = new java.util.HashSet();
	
	@OneToMany(mappedBy="administrador", targetEntity=com.example.telecomunicaciones.bd.orm.Incidencia_administrad.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_incidencia_administrad = new java.util.HashSet();
	
	@OneToMany(mappedBy="administrador", targetEntity=com.example.telecomunicaciones.bd.orm.Servicio.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_servicioDestacado = new java.util.HashSet();
	
	private void setIDAdmin(int value) {
		this.IDAdmin = value;
	}
	
	public int getIDAdmin() {
		return IDAdmin;
	}
	
	public int getORMID() {
		return getIDAdmin();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setApellido1(String value) {
		this.apellido1 = value;
	}
	
	public String getApellido1() {
		return apellido1;
	}
	
	public void setApellido2(String value) {
		this.apellido2 = value;
	}
	
	public String getApellido2() {
		return apellido2;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setNif(String value) {
		this.nif = value;
	}
	
	public String getNif() {
		return nif;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	private void setORM_Cliente(java.util.Set value) {
		this.ORM_cliente = value;
	}
	
	private java.util.Set getORM_Cliente() {
		return ORM_cliente;
	}
	
	@Transient	
	public final com.example.telecomunicaciones.bd.orm.ClienteSetCollection cliente = new com.example.telecomunicaciones.bd.orm.ClienteSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADOR_CLIENTE, ORMConstants.KEY_CLIENTE_ADMINISTRADOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Comercial(java.util.Set value) {
		this.ORM_comercial = value;
	}
	
	private java.util.Set getORM_Comercial() {
		return ORM_comercial;
	}
	
	@Transient	
	public final com.example.telecomunicaciones.bd.orm.ComercialSetCollection comercial = new com.example.telecomunicaciones.bd.orm.ComercialSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADOR_COMERCIAL, ORMConstants.KEY_COMERCIAL_ADMINISTRADOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Incidencia_administrad(java.util.Set value) {
		this.ORM_incidencia_administrad = value;
	}
	
	private java.util.Set getORM_Incidencia_administrad() {
		return ORM_incidencia_administrad;
	}
	
	@Transient	
	public final com.example.telecomunicaciones.bd.orm.Incidencia_administradSetCollection incidencia_administrad = new com.example.telecomunicaciones.bd.orm.Incidencia_administradSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADOR_INCIDENCIA_ADMINISTRAD, ORMConstants.KEY_INCIDENCIA_ADMINISTRAD_ADMINISTRADOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_ServicioDestacado(java.util.Set value) {
		this.ORM_servicioDestacado = value;
	}
	
	private java.util.Set getORM_ServicioDestacado() {
		return ORM_servicioDestacado;
	}
	
	@Transient	
	public final com.example.telecomunicaciones.bd.orm.ServicioSetCollection servicioDestacado = new com.example.telecomunicaciones.bd.orm.ServicioSetCollection(this, _ormAdapter, ORMConstants.KEY_ADMINISTRADOR_SERVICIODESTACADO, ORMConstants.KEY_SERVICIO_ADMINISTRADOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIDAdmin());
	}
	
}
