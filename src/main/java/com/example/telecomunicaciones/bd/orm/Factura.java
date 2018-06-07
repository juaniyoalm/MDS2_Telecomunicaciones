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
@Table(name="Factura")
public class Factura implements Serializable {
	public Factura() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_FACTURA_SERVICIO) {
			return ORM_servicio;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_FACTURA_CLIENTE) {
			this.cliente = (com.example.telecomunicaciones.bd.orm.Cliente) owner;
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
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="COM_EXAMPLE_TELECOMUNICACIONES_BD_ORM_FACTURA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_TELECOMUNICACIONES_BD_ORM_FACTURA_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=com.example.telecomunicaciones.bd.orm.Cliente.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ClienteIDCliente", referencedColumnName="IDCliente", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private com.example.telecomunicaciones.bd.orm.Cliente cliente;
	
	@Column(name="Attribute", nullable=false, length=10)	
	private int attribute;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Fecha", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fecha;
	
	@Column(name="NombreCliente", nullable=true, length=255)	
	private String nombreCliente;
	
	@Column(name="ApellidosCliente", nullable=true, length=255)	
	private String apellidosCliente;
	
	@Column(name="NifCliente", nullable=true, length=255)	
	private String nifCliente;
	
	@Column(name="DireccionCliente", nullable=true, length=255)	
	private String direccionCliente;
	
	@Column(name="TelefonoCliente", nullable=true, length=255)	
	private String telefonoCliente;
	
	@Column(name="PrecioTotal", nullable=false)	
	private double precioTotal;
	
	@ManyToMany(targetEntity=com.example.telecomunicaciones.bd.orm.Servicio.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Servicio_Factura", joinColumns={ @JoinColumn(name="FacturaID") }, inverseJoinColumns={ @JoinColumn(name="ServicioID") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_servicio = new java.util.HashSet();
	
	public void setAttribute(int value) {
		this.attribute = value;
	}
	
	public int getAttribute() {
		return attribute;
	}
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setFecha(java.util.Date value) {
		this.fecha = value;
	}
	
	public java.util.Date getFecha() {
		return fecha;
	}
	
	public void setNombreCliente(String value) {
		this.nombreCliente = value;
	}
	
	public String getNombreCliente() {
		return nombreCliente;
	}
	
	public void setApellidosCliente(String value) {
		this.apellidosCliente = value;
	}
	
	public String getApellidosCliente() {
		return apellidosCliente;
	}
	
	public void setNifCliente(String value) {
		this.nifCliente = value;
	}
	
	public String getNifCliente() {
		return nifCliente;
	}
	
	public void setDireccionCliente(String value) {
		this.direccionCliente = value;
	}
	
	public String getDireccionCliente() {
		return direccionCliente;
	}
	
	public void setTelefonoCliente(String value) {
		this.telefonoCliente = value;
	}
	
	public String getTelefonoCliente() {
		return telefonoCliente;
	}
	
	public void setPrecioTotal(double value) {
		this.precioTotal = value;
	}
	
	public double getPrecioTotal() {
		return precioTotal;
	}
	
	private void setORM_Servicio(java.util.Set value) {
		this.ORM_servicio = value;
	}
	
	private java.util.Set getORM_Servicio() {
		return ORM_servicio;
	}
	
	@Transient	
	public final com.example.telecomunicaciones.bd.orm.ServicioSetCollection servicio = new com.example.telecomunicaciones.bd.orm.ServicioSetCollection(this, _ormAdapter, ORMConstants.KEY_FACTURA_SERVICIO, ORMConstants.KEY_SERVICIO_FACTURA, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setCliente(com.example.telecomunicaciones.bd.orm.Cliente value) {
		if (cliente != null) {
			cliente.factura.remove(this);
		}
		if (value != null) {
			value.factura.add(this);
		}
	}
	
	public com.example.telecomunicaciones.bd.orm.Cliente getCliente() {
		return cliente;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Cliente(com.example.telecomunicaciones.bd.orm.Cliente value) {
		this.cliente = value;
	}
	
	private com.example.telecomunicaciones.bd.orm.Cliente getORM_Cliente() {
		return cliente;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
