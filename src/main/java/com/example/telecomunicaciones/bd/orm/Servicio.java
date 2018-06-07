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
@Table(name="Servicio")
public class Servicio implements Serializable {
	public Servicio() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_SERVICIO_COMBINADO) {
			return ORM_combinado;
		}
		else if (key == ORMConstants.KEY_SERVICIO_FACTURA) {
			return ORM_factura;
		}
		else if (key == ORMConstants.KEY_SERVICIO_CONTRATOS) {
			return ORM_contratos;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_SERVICIO_ADMINISTRADOR) {
			this.administrador = (com.example.telecomunicaciones.bd.orm.Administrador) owner;
		}
		
		else if (key == ORMConstants.KEY_SERVICIO_MOVIL) {
			this.movil = (com.example.telecomunicaciones.bd.orm.Movil) owner;
		}
		
		else if (key == ORMConstants.KEY_SERVICIO_PAQUETE_TV) {
			this.paquete_TV = (com.example.telecomunicaciones.bd.orm.Paquete_TV) owner;
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
	@GeneratedValue(generator="COM_EXAMPLE_TELECOMUNICACIONES_BD_ORM_SERVICIO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_EXAMPLE_TELECOMUNICACIONES_BD_ORM_SERVICIO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@OneToOne(targetEntity=com.example.telecomunicaciones.bd.orm.Paquete_TV.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Paquete_TVIDPaquete", referencedColumnName="IDPaquete", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private com.example.telecomunicaciones.bd.orm.Paquete_TV paquete_TV;
	
	@OneToOne(targetEntity=com.example.telecomunicaciones.bd.orm.Movil.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="MovilIDMovil", referencedColumnName="IDMovil", nullable=false) })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private com.example.telecomunicaciones.bd.orm.Movil movil;
	
	@ManyToOne(targetEntity=com.example.telecomunicaciones.bd.orm.Administrador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="AdministradorIDAdmin", referencedColumnName="IDAdmin") })	
	@org.hibernate.annotations.LazyToOne(value=org.hibernate.annotations.LazyToOneOption.NO_PROXY)	
	private com.example.telecomunicaciones.bd.orm.Administrador administrador;
	
	@Column(name="Nombre", nullable=true, length=255)	
	private String nombre;
	
	@Column(name="Caracteristicas", nullable=true, length=255)	
	private String caracteristicas;
	
	@Column(name="Precio", nullable=false)	
	private double precio;
	
	@Column(name="Visivilidad", nullable=false, length=1)	
	private boolean visivilidad;
	
	@Column(name="Tipo", nullable=true, length=255)	
	private String tipo;
	
	@Column(name="FechaEliminacion", nullable=true)	
	@Temporal(TemporalType.DATE)	
	private java.util.Date fechaEliminacion;
	
	@ManyToMany(targetEntity=com.example.telecomunicaciones.bd.orm.Combinado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Combinado_Servicio", joinColumns={ @JoinColumn(name="ServicioID") }, inverseJoinColumns={ @JoinColumn(name="CombinadoIDCombinado") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_combinado = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_servicio", targetEntity=com.example.telecomunicaciones.bd.orm.Factura.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_factura = new java.util.HashSet();
	
	@OneToMany(mappedBy="servicio", targetEntity=com.example.telecomunicaciones.bd.orm.Contrato.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_contratos = new java.util.HashSet();
	
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
	
	public void setVisivilidad(boolean value) {
		this.visivilidad = value;
	}
	
	public boolean getVisivilidad() {
		return visivilidad;
	}
	
	public void setTipo(String value) {
		this.tipo = value;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setFechaEliminacion(java.util.Date value) {
		this.fechaEliminacion = value;
	}
	
	public java.util.Date getFechaEliminacion() {
		return fechaEliminacion;
	}
	
	private void setORM_Combinado(java.util.Set value) {
		this.ORM_combinado = value;
	}
	
	private java.util.Set getORM_Combinado() {
		return ORM_combinado;
	}
	
	@Transient	
	public final com.example.telecomunicaciones.bd.orm.CombinadoSetCollection combinado = new com.example.telecomunicaciones.bd.orm.CombinadoSetCollection(this, _ormAdapter, ORMConstants.KEY_SERVICIO_COMBINADO, ORMConstants.KEY_COMBINADO_SERVICIO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setAdministrador(com.example.telecomunicaciones.bd.orm.Administrador value) {
		if (administrador != null) {
			administrador.servicioDestacado.remove(this);
		}
		if (value != null) {
			value.servicioDestacado.add(this);
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
	
	public void setMovil(com.example.telecomunicaciones.bd.orm.Movil value) {
		if (this.movil != value) {
			com.example.telecomunicaciones.bd.orm.Movil lmovil = this.movil;
			this.movil = value;
			if (value != null) {
				movil.setServicio(this);
			}
			if (lmovil != null && lmovil.getServicio() == this) {
				lmovil.setServicio(null);
			}
		}
	}
	
	public com.example.telecomunicaciones.bd.orm.Movil getMovil() {
		return movil;
	}
	
	public void setPaquete_TV(com.example.telecomunicaciones.bd.orm.Paquete_TV value) {
		if (this.paquete_TV != value) {
			com.example.telecomunicaciones.bd.orm.Paquete_TV lpaquete_TV = this.paquete_TV;
			this.paquete_TV = value;
			if (value != null) {
				paquete_TV.setServicio(this);
			}
			if (lpaquete_TV != null && lpaquete_TV.getServicio() == this) {
				lpaquete_TV.setServicio(null);
			}
		}
	}
	
	public com.example.telecomunicaciones.bd.orm.Paquete_TV getPaquete_TV() {
		return paquete_TV;
	}
	
	private void setORM_Factura(java.util.Set value) {
		this.ORM_factura = value;
	}
	
	private java.util.Set getORM_Factura() {
		return ORM_factura;
	}
	
	@Transient	
	public final com.example.telecomunicaciones.bd.orm.FacturaSetCollection factura = new com.example.telecomunicaciones.bd.orm.FacturaSetCollection(this, _ormAdapter, ORMConstants.KEY_SERVICIO_FACTURA, ORMConstants.KEY_FACTURA_SERVICIO, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public com.example.telecomunicaciones.bd.orm.Cliente[] getClientes() {
		java.util.ArrayList lValues = new java.util.ArrayList(5);
		for(java.util.Iterator lIter = contratos.getIterator();lIter.hasNext();) {
			lValues.add(((com.example.telecomunicaciones.bd.orm.Contrato)lIter.next()).getCliente());
		}
		return (com.example.telecomunicaciones.bd.orm.Cliente[])lValues.toArray(new com.example.telecomunicaciones.bd.orm.Cliente[lValues.size()]);
	}
	
	public void removeCliente(com.example.telecomunicaciones.bd.orm.Cliente aCliente) {
		com.example.telecomunicaciones.bd.orm.Contrato[] lContratos = contratos.toArray();
		for(int i = 0; i < lContratos.length; i++) {
			if(lContratos[i].getCliente().equals(aCliente)) {
				contratos.remove(lContratos[i]);
			}
		}
	}
	
	public void addCliente(com.example.telecomunicaciones.bd.orm.Contrato aContrato, com.example.telecomunicaciones.bd.orm.Cliente aCliente) {
		aContrato.setCliente(aCliente);
		contratos.add(aContrato);
	}
	
	public com.example.telecomunicaciones.bd.orm.Contrato getContratoByCliente(com.example.telecomunicaciones.bd.orm.Cliente aCliente) {
		com.example.telecomunicaciones.bd.orm.Contrato[] lContratos = contratos.toArray();
		for(int i = 0; i < lContratos.length; i++) {
			if(lContratos[i].getCliente().equals(aCliente)) {
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
	public final com.example.telecomunicaciones.bd.orm.ContratoSetCollection contratos = new com.example.telecomunicaciones.bd.orm.ContratoSetCollection(this, _ormAdapter, ORMConstants.KEY_SERVICIO_CONTRATOS, ORMConstants.KEY_CONTRATO_SERVICIO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
