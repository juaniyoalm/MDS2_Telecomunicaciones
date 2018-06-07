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
@Table(name="Movil")
public class Movil implements Serializable {
	public Movil() {
	}
	
	@Column(name="IDMovil", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="COM_EXAMPLE_TELECOMUNICACIONES_BD_ORM_MOVIL_IDMOVIL_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_TELECOMUNICACIONES_BD_ORM_MOVIL_IDMOVIL_GENERATOR", strategy="native")	
	private int IDMovil;
	
	@Column(name="ConsumoActual", nullable=false)	
	private double consumoActual;
	
	@Column(name="ConsumoMaximo", nullable=false)	
	private double consumoMaximo;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Caracteristicas", nullable=true, length=255)	
	private String caracteristicas;
	
	@Column(name="Precio", nullable=false)	
	private double precio;
	
	@Column(name="Visibilidad", nullable=false, length=1)	
	private boolean visibilidad;
	
	@OneToOne(mappedBy="movil", targetEntity=com.example.telecomunicaciones.bd.orm.Servicio.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private com.example.telecomunicaciones.bd.orm.Servicio servicio;
	
	public void setConsumoActual(double value) {
		this.consumoActual = value;
	}
	
	public double getConsumoActual() {
		return consumoActual;
	}
	
	public void setConsumoMaximo(double value) {
		this.consumoMaximo = value;
	}
	
	public double getConsumoMaximo() {
		return consumoMaximo;
	}
	
	private void setIDMovil(int value) {
		this.IDMovil = value;
	}
	
	public int getIDMovil() {
		return IDMovil;
	}
	
	public int getORMID() {
		return getIDMovil();
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
	
	public void setServicio(com.example.telecomunicaciones.bd.orm.Servicio value) {
		if (this.servicio != value) {
			com.example.telecomunicaciones.bd.orm.Servicio lservicio = this.servicio;
			this.servicio = value;
			if (value != null) {
				servicio.setMovil(this);
			}
			if (lservicio != null && lservicio.getMovil() == this) {
				lservicio.setMovil(null);
			}
		}
	}
	
	public com.example.telecomunicaciones.bd.orm.Servicio getServicio() {
		return servicio;
	}
	
	public String toString() {
		return String.valueOf(getIDMovil());
	}
	
}
