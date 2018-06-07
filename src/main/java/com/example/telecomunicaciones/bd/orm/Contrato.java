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
@Table(name="Contrato")
public class Contrato implements Serializable {
	public Contrato() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_CONTRATO_SERVICIO) {
			this.servicio = (com.example.telecomunicaciones.bd.orm.Servicio) owner;
		}
		
		else if (key == ORMConstants.KEY_CONTRATO_CLIENTE) {
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
	@GeneratedValue(generator="COM_EXAMPLE_TELECOMUNICACIONES_BD_ORM_CONTRATO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_TELECOMUNICACIONES_BD_ORM_CONTRATO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Attribute", nullable=false, length=10)	
	private int attribute;
	
	@Column(name="Fecha", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fecha;
	
	@ManyToOne(targetEntity=com.example.telecomunicaciones.bd.orm.Cliente.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ClienteIDCliente", referencedColumnName="IDCliente", nullable=false) })	
	private com.example.telecomunicaciones.bd.orm.Cliente cliente;
	
	@ManyToOne(targetEntity=com.example.telecomunicaciones.bd.orm.Servicio.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ServicioID", referencedColumnName="ID", nullable=false) })	
	private com.example.telecomunicaciones.bd.orm.Servicio servicio;
	
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
	
	public void setFecha(java.util.Date value) {
		this.fecha = value;
	}
	
	public java.util.Date getFecha() {
		return fecha;
	}
	
	public void setServicio(com.example.telecomunicaciones.bd.orm.Servicio value) {
		if (servicio != null) {
			servicio.contratos.remove(this);
		}
		if (value != null) {
			value.contratos.add(this);
		}
	}
	
	public com.example.telecomunicaciones.bd.orm.Servicio getServicio() {
		return servicio;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Servicio(com.example.telecomunicaciones.bd.orm.Servicio value) {
		this.servicio = value;
	}
	
	private com.example.telecomunicaciones.bd.orm.Servicio getORM_Servicio() {
		return servicio;
	}
	
	public void setCliente(com.example.telecomunicaciones.bd.orm.Cliente value) {
		if (cliente != null) {
			cliente.contratos.remove(this);
		}
		if (value != null) {
			value.contratos.add(this);
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
