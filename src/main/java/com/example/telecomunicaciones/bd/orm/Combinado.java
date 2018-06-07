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
@Table(name="Combinado")
public class Combinado implements Serializable {
	public Combinado() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_COMBINADO_SERVICIO) {
			return ORM_servicio;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="IDCombinado", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="COM_EXAMPLE_TELECOMUNICACIONES_BD_ORM_COMBINADO_IDCOMBINADO_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_TELECOMUNICACIONES_BD_ORM_COMBINADO_IDCOMBINADO_GENERATOR", strategy="native")	
	private int IDCombinado;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Caracteristicas", nullable=true, length=255)	
	private String caracteristicas;
	
	@Column(name="Precio", nullable=false)	
	private double precio;
	
	@Column(name="Visibilidad", nullable=true, length=1)	
	private Boolean visibilidad;
	
	@ManyToMany(mappedBy="ORM_combinado", targetEntity=com.example.telecomunicaciones.bd.orm.Servicio.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_servicio = new java.util.HashSet();
	
	private void setIDCombinado(int value) {
		this.IDCombinado = value;
	}
	
	public int getIDCombinado() {
		return IDCombinado;
	}
	
	public int getORMID() {
		return getIDCombinado();
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
		setVisibilidad(new Boolean(value));
	}
	
	public void setVisibilidad(Boolean value) {
		this.visibilidad = value;
	}
	
	public Boolean getVisibilidad() {
		return visibilidad;
	}
	
	private void setORM_Servicio(java.util.Set value) {
		this.ORM_servicio = value;
	}
	
	private java.util.Set getORM_Servicio() {
		return ORM_servicio;
	}
	
	@Transient	
	public final com.example.telecomunicaciones.bd.orm.ServicioSetCollection servicio = new com.example.telecomunicaciones.bd.orm.ServicioSetCollection(this, _ormAdapter, ORMConstants.KEY_COMBINADO_SERVICIO, ORMConstants.KEY_SERVICIO_COMBINADO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public String toString() {
		return String.valueOf(getIDCombinado());
	}
	
}
