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
@Table(name="Canal")
public class Canal implements Serializable {
	public Canal() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CANAL_PAQUETE_TV) {
			return ORM_paquete_TV;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="IDCanal", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="COM_EXAMPLE_TELECOMUNICACIONES_BD_ORM_CANAL_IDCANAL_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_TELECOMUNICACIONES_BD_ORM_CANAL_IDCANAL_GENERATOR", strategy="native")	
	private int IDCanal;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Caracteristicas", nullable=true, length=255)	
	private String caracteristicas;
	
	@Column(name="Precio", nullable=false)	
	private double precio;
	
	@Column(name="Visibilidad", nullable=false, length=1)	
	private boolean visibilidad;
	
	@ManyToMany(targetEntity=com.example.telecomunicaciones.bd.orm.Paquete_TV.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Paquete_TV_Canal", joinColumns={ @JoinColumn(name="CanalIDCanal") }, inverseJoinColumns={ @JoinColumn(name="Paquete_TVIDPaquete") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_paquete_TV = new java.util.HashSet();
	
	private void setIDCanal(int value) {
		this.IDCanal = value;
	}
	
	public int getIDCanal() {
		return IDCanal;
	}
	
	public int getORMID() {
		return getIDCanal();
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
	
	private void setORM_Paquete_TV(java.util.Set value) {
		this.ORM_paquete_TV = value;
	}
	
	private java.util.Set getORM_Paquete_TV() {
		return ORM_paquete_TV;
	}
	
	@Transient	
	public final com.example.telecomunicaciones.bd.orm.Paquete_TVSetCollection paquete_TV = new com.example.telecomunicaciones.bd.orm.Paquete_TVSetCollection(this, _ormAdapter, ORMConstants.KEY_CANAL_PAQUETE_TV, ORMConstants.KEY_PAQUETE_TV_CANAL, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIDCanal());
	}
	
}
