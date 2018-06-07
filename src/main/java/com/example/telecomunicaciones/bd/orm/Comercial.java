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
@Table(name="Comercial")
public class Comercial implements Serializable {
	public Comercial() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_COMERCIAL_CLIENTE) {
			return ORM_cliente;
		}
		else if (key == ORMConstants.KEY_COMERCIAL_INCIDENCIA) {
			return ORM_incidencia;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_COMERCIAL_ADMINISTRADOR) {
			this.administrador = (com.example.telecomunicaciones.bd.orm.Administrador) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="IDComercial", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="COM_EXAMPLE_TELECOMUNICACIONES_BD_ORM_COMERCIAL_IDCOMERCIAL_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_TELECOMUNICACIONES_BD_ORM_COMERCIAL_IDCOMERCIAL_GENERATOR", strategy="native")	
	private int IDComercial;
	
	@ManyToOne(targetEntity=com.example.telecomunicaciones.bd.orm.Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="AdministradorIDAdmin", referencedColumnName="IDAdmin", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private com.example.telecomunicaciones.bd.orm.Administrador administrador;
	
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
	
	@ManyToMany(targetEntity=com.example.telecomunicaciones.bd.orm.Cliente.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Cliente_Comercial", joinColumns={ @JoinColumn(name="ComercialIDComercial") }, inverseJoinColumns={ @JoinColumn(name="ClienteIDCliente") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_cliente = new java.util.HashSet();
	
	@OneToMany(mappedBy="comercial", targetEntity=com.example.telecomunicaciones.bd.orm.Incidencia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_incidencia = new java.util.HashSet();
	
	private void setIDComercial(int value) {
		this.IDComercial = value;
	}
	
	public int getIDComercial() {
		return IDComercial;
	}
	
	public int getORMID() {
		return getIDComercial();
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
	public final com.example.telecomunicaciones.bd.orm.ClienteSetCollection cliente = new com.example.telecomunicaciones.bd.orm.ClienteSetCollection(this, _ormAdapter, ORMConstants.KEY_COMERCIAL_CLIENTE, ORMConstants.KEY_CLIENTE_COMERCIAL, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setAdministrador(com.example.telecomunicaciones.bd.orm.Administrador value) {
		if (administrador != null) {
			administrador.comercial.remove(this);
		}
		if (value != null) {
			value.comercial.add(this);
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
	
	private void setORM_Incidencia(java.util.Set value) {
		this.ORM_incidencia = value;
	}
	
	private java.util.Set getORM_Incidencia() {
		return ORM_incidencia;
	}
	
	@Transient	
	public final com.example.telecomunicaciones.bd.orm.IncidenciaSetCollection incidencia = new com.example.telecomunicaciones.bd.orm.IncidenciaSetCollection(this, _ormAdapter, ORMConstants.KEY_COMERCIAL_INCIDENCIA, ORMConstants.KEY_INCIDENCIA_COMERCIAL, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIDComercial());
	}
	
}
