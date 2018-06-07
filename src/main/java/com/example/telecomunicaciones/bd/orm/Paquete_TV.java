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
@Table(name="Paquete_TV")
public class Paquete_TV implements Serializable {
	public Paquete_TV() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_PAQUETE_TV_CANAL) {
			return ORM_canal;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PAQUETE_TV_SERVICIO) {
			this.servicio = (com.example.telecomunicaciones.bd.orm.Servicio) owner;
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
	
	@Column(name="IDPaquete", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="COM_EXAMPLE_TELECOMUNICACIONES_BD_ORM_PAQUETE_TV_IDPAQUETE_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_TELECOMUNICACIONES_BD_ORM_PAQUETE_TV_IDPAQUETE_GENERATOR", strategy="native")	
	private int IDPaquete;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Caracteristicas", nullable=true, length=255)	
	private String caracteristicas;
	
	@Column(name="Precio", nullable=false)	
	private double precio;
	
	@Column(name="Visibilidad", nullable=false, length=1)	
	private boolean visibilidad;
	
	@ManyToMany(mappedBy="ORM_paquete_TV", targetEntity=com.example.telecomunicaciones.bd.orm.Canal.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_canal = new java.util.HashSet();
	
	@OneToOne(mappedBy="paquete_TV", targetEntity=com.example.telecomunicaciones.bd.orm.Servicio.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private com.example.telecomunicaciones.bd.orm.Servicio servicio;
	
	private void setIDPaquete(int value) {
		this.IDPaquete = value;
	}
	
	public int getIDPaquete() {
		return IDPaquete;
	}
	
	public int getORMID() {
		return getIDPaquete();
	}
	
	public void setNombre(String value) {
		this.nombre = value;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setCaracteristicas(String value) {
		this.caracteristicas = value;
	}
	
	public String getCaracteristicas() {
		return caracteristicas;
	}
	
	public void setPrecio(double value) {
		this.precio = value;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setVisibilidad(boolean value) {
		this.visibilidad = value;
	}
	
	public boolean getVisibilidad() {
		return visibilidad;
	}
	
	private void setORM_Canal(java.util.Set value) {
		this.ORM_canal = value;
	}
	
	private java.util.Set getORM_Canal() {
		return ORM_canal;
	}
	
	@Transient	
	public final com.example.telecomunicaciones.bd.orm.CanalSetCollection canal = new com.example.telecomunicaciones.bd.orm.CanalSetCollection(this, _ormAdapter, ORMConstants.KEY_PAQUETE_TV_CANAL, ORMConstants.KEY_CANAL_PAQUETE_TV, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setServicio(com.example.telecomunicaciones.bd.orm.Servicio value) {
		if (this.servicio != value) {
			com.example.telecomunicaciones.bd.orm.Servicio lservicio = this.servicio;
			this.servicio = value;
			if (value != null) {
				servicio.setPaquete_TV(this);
			}
			if (lservicio != null && lservicio.getPaquete_TV() == this) {
				lservicio.setPaquete_TV(null);
			}
		}
	}
	
	public com.example.telecomunicaciones.bd.orm.Servicio getServicio() {
		return servicio;
	}
	
	public String toString() {
		return String.valueOf(getIDPaquete());
	}
	
}
