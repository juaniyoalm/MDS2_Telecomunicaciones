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
@Table(name="Cliente")
public class Cliente implements Serializable {
	public Cliente() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CLIENTE_CONTRATOS) {
			return ORM_contratos;
		}
		else if (key == ORMConstants.KEY_CLIENTE_FACTURA) {
			return ORM_factura;
		}
		else if (key == ORMConstants.KEY_CLIENTE_INCIDENCIA) {
			return ORM_incidencia;
		}
		else if (key == ORMConstants.KEY_CLIENTE_COMERCIAL) {
			return ORM_comercial;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_CLIENTE_ADMINISTRADOR) {
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
	
	@Column(name="IDCliente", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="COM_EXAMPLE_TELECOMUNICACIONES_BD_ORM_CLIENTE_IDCLIENTE_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_TELECOMUNICACIONES_BD_ORM_CLIENTE_IDCLIENTE_GENERATOR", strategy="native")	
	private int IDCliente;
	
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
	
	@Column(name="Telefono", nullable=true, length=255)	
	private String telefono;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="Nif", nullable=true, length=255)	
	private String nif;
	
	@Column(name="Password", nullable=true, length=255)	
	private String password;
	
	@OneToMany(mappedBy="cliente", targetEntity=com.example.telecomunicaciones.bd.orm.Contrato.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contratos = new java.util.HashSet();
	
	@OneToMany(mappedBy="cliente", targetEntity=com.example.telecomunicaciones.bd.orm.Factura.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_factura = new java.util.HashSet();
	
	@OneToMany(mappedBy="cliente", targetEntity=com.example.telecomunicaciones.bd.orm.Incidencia.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_incidencia = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_cliente", targetEntity=com.example.telecomunicaciones.bd.orm.Comercial.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_comercial = new java.util.HashSet();
	
	private void setIDCliente(int value) {
		this.IDCliente = value;
	}
	
	public int getIDCliente() {
		return IDCliente;
	}
	
	public int getORMID() {
		return getIDCliente();
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
	
	public void setTelefono(String value) {
		this.telefono = value;
	}
	
	public String getTelefono() {
		return telefono;
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
	
	public com.example.telecomunicaciones.bd.orm.Servicio[] getServicios() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = contratos.getIterator();lIter.hasNext();) {
			lValues.add(((com.example.telecomunicaciones.bd.orm.Contrato)lIter.next()).getServicio());
		}
		return (com.example.telecomunicaciones.bd.orm.Servicio[])lValues.toArray(new com.example.telecomunicaciones.bd.orm.Servicio[lValues.size()]);
	}
	
	public void removeServicio(com.example.telecomunicaciones.bd.orm.Servicio aServicio) {
		com.example.telecomunicaciones.bd.orm.Contrato[] lContratos = contratos.toArray();
		for(int i = 0; i < lContratos.length; i++) {
			if(lContratos[i].getServicio().equals(aServicio)) {
				contratos.remove(lContratos[i]);
			}
		}
	}
	
	public void addServicio(com.example.telecomunicaciones.bd.orm.Contrato aContrato, com.example.telecomunicaciones.bd.orm.Servicio aServicio) {
		aContrato.setServicio(aServicio);
		contratos.add(aContrato);
	}
	
	public com.example.telecomunicaciones.bd.orm.Contrato getContratoByServicio(com.example.telecomunicaciones.bd.orm.Servicio aServicio) {
		com.example.telecomunicaciones.bd.orm.Contrato[] lContratos = contratos.toArray();
		for(int i = 0; i < lContratos.length; i++) {
			if(lContratos[i].getServicio().equals(aServicio)) {
				return lContratos[i];
			}
		}
		return null;
	}
	
	private void setORM_Contratos(java.util.Set value) {
		this.ORM_contratos = value;
	}
	
	private java.util.Set getORM_Contratos() {
		return ORM_contratos;
	}
	
	@Transient	
	public final com.example.telecomunicaciones.bd.orm.ContratoSetCollection contratos = new com.example.telecomunicaciones.bd.orm.ContratoSetCollection(this, _ormAdapter, ORMConstants.KEY_CLIENTE_CONTRATOS, ORMConstants.KEY_CONTRATO_CLIENTE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Factura(java.util.Set value) {
		this.ORM_factura = value;
	}
	
	private java.util.Set getORM_Factura() {
		return ORM_factura;
	}
	
	@Transient	
	public final com.example.telecomunicaciones.bd.orm.FacturaSetCollection factura = new com.example.telecomunicaciones.bd.orm.FacturaSetCollection(this, _ormAdapter, ORMConstants.KEY_CLIENTE_FACTURA, ORMConstants.KEY_FACTURA_CLIENTE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Incidencia(java.util.Set value) {
		this.ORM_incidencia = value;
	}
	
	private java.util.Set getORM_Incidencia() {
		return ORM_incidencia;
	}
	
	@Transient	
	public final com.example.telecomunicaciones.bd.orm.IncidenciaSetCollection incidencia = new com.example.telecomunicaciones.bd.orm.IncidenciaSetCollection(this, _ormAdapter, ORMConstants.KEY_CLIENTE_INCIDENCIA, ORMConstants.KEY_INCIDENCIA_CLIENTE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Comercial(java.util.Set value) {
		this.ORM_comercial = value;
	}
	
	private java.util.Set getORM_Comercial() {
		return ORM_comercial;
	}
	
	@Transient	
	public final com.example.telecomunicaciones.bd.orm.ComercialSetCollection comercial = new com.example.telecomunicaciones.bd.orm.ComercialSetCollection(this, _ormAdapter, ORMConstants.KEY_CLIENTE_COMERCIAL, ORMConstants.KEY_COMERCIAL_CLIENTE, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setAdministrador(com.example.telecomunicaciones.bd.orm.Administrador value) {
		if (administrador != null) {
			administrador.cliente.remove(this);
		}
		if (value != null) {
			value.cliente.add(this);
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
		return String.valueOf(getIDCliente());
	}
	
}
