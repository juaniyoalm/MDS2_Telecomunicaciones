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
@Table(name="Incidencia")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Discriminator", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("Incidencia")
public class Incidencia implements Serializable {
	public Incidencia() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_INCIDENCIA_COMERCIAL) {
			this.comercial = (com.example.telecomunicaciones.bd.orm.Comercial) owner;
		}
		
		else if (key == ORMConstants.KEY_INCIDENCIA_CLIENTE) {
			this.cliente = (com.example.telecomunicaciones.bd.orm.Cliente) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="COM_EXAMPLE_TELECOMUNICACIONES_BD_ORM_INCIDENCIA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_TELECOMUNICACIONES_BD_ORM_INCIDENCIA_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=com.example.telecomunicaciones.bd.orm.Comercial.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ComercialIDComercial", referencedColumnName="IDComercial") })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private com.example.telecomunicaciones.bd.orm.Comercial comercial;
	
	@ManyToOne(targetEntity=com.example.telecomunicaciones.bd.orm.Cliente.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ClienteIDCliente", referencedColumnName="IDCliente") })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private com.example.telecomunicaciones.bd.orm.Cliente cliente;
	
	@Column(name="Attribute", nullable=false, length=10)	
	private int attribute;
	
	@Column(name="Fecha", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fecha;
	
	@Column(name="CorreoCliente", nullable=true, length=255)	
	private String correoCliente;
	
	@Column(name="Asunto", nullable=true, length=255)	
	private String asunto;
	
	@Column(name="Descripcion", nullable=true, length=255)	
	private String descripcion;
	
	@Column(name="Observacion", nullable=true, length=255)	
	private String observacion;
	
	@Column(name="TipoIncidencia", nullable=true, length=255)	
	private String tipoIncidencia;
	
	@Column(name="Estado", nullable=true, length=255)	
	private String estado;
	
	public void setAttribute(int value) {
		this.attribute = value;
	}
	
	public int getAttribute() {
		return attribute;
	}
	
	public void setFecha(java.util.Date value) {
		this.fecha = value;
	}
	
	public java.util.Date getFecha() {
		return fecha;
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
	
	public void setCorreoCliente(String value) {
		this.correoCliente = value;
	}
	
	public String getCorreoCliente() {
		return correoCliente;
	}
	
	public void setAsunto(String value) {
		this.asunto = value;
	}
	
	public String getAsunto() {
		return asunto;
	}
	
	public void setDescripcion(String value) {
		this.descripcion = value;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setObservacion(String value) {
		this.observacion = value;
	}
	
	public String getObservacion() {
		return observacion;
	}
	
	public void setTipoIncidencia(String value) {
		this.tipoIncidencia = value;
	}
	
	public String getTipoIncidencia() {
		return tipoIncidencia;
	}
	
	public void setEstado(String value) {
		this.estado = value;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setComercial(com.example.telecomunicaciones.bd.orm.Comercial value) {
		if (comercial != null) {
			comercial.incidencia.remove(this);
		}
		if (value != null) {
			value.incidencia.add(this);
		}
	}
	
	public com.example.telecomunicaciones.bd.orm.Comercial getComercial() {
		return comercial;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Comercial(com.example.telecomunicaciones.bd.orm.Comercial value) {
		this.comercial = value;
	}
	
	private com.example.telecomunicaciones.bd.orm.Comercial getORM_Comercial() {
		return comercial;
	}
	
	public void setCliente(com.example.telecomunicaciones.bd.orm.Cliente value) {
		if (cliente != null) {
			cliente.incidencia.remove(this);
		}
		if (value != null) {
			value.incidencia.add(this);
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
