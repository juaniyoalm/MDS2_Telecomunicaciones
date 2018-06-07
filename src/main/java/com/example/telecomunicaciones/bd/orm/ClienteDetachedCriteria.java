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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ClienteDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression IDCliente;
	public final IntegerExpression administradorId;
	public final AssociationExpression administrador;
	public final StringExpression nombre;
	public final StringExpression apellido1;
	public final StringExpression apellido2;
	public final StringExpression telefono;
	public final StringExpression email;
	public final StringExpression nif;
	public final StringExpression password;
	public final CollectionExpression contratos;
	public final CollectionExpression factura;
	public final CollectionExpression incidencia;
	public final CollectionExpression comercial;
	
	public ClienteDetachedCriteria() {
		super(com.example.telecomunicaciones.bd.orm.Cliente.class, com.example.telecomunicaciones.bd.orm.ClienteCriteria.class);
		IDCliente = new IntegerExpression("IDCliente", this.getDetachedCriteria());
		administradorId = new IntegerExpression("administrador.IDAdmin", this.getDetachedCriteria());
		administrador = new AssociationExpression("administrador", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido1 = new StringExpression("apellido1", this.getDetachedCriteria());
		apellido2 = new StringExpression("apellido2", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		nif = new StringExpression("nif", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		contratos = new CollectionExpression("ORM_contratos", this.getDetachedCriteria());
		factura = new CollectionExpression("ORM_factura", this.getDetachedCriteria());
		incidencia = new CollectionExpression("ORM_incidencia", this.getDetachedCriteria());
		comercial = new CollectionExpression("ORM_comercial", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.example.telecomunicaciones.bd.orm.ClienteCriteria.class);
		IDCliente = new IntegerExpression("IDCliente", this.getDetachedCriteria());
		administradorId = new IntegerExpression("administrador.IDAdmin", this.getDetachedCriteria());
		administrador = new AssociationExpression("administrador", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido1 = new StringExpression("apellido1", this.getDetachedCriteria());
		apellido2 = new StringExpression("apellido2", this.getDetachedCriteria());
		telefono = new StringExpression("telefono", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		nif = new StringExpression("nif", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		contratos = new CollectionExpression("ORM_contratos", this.getDetachedCriteria());
		factura = new CollectionExpression("ORM_factura", this.getDetachedCriteria());
		incidencia = new CollectionExpression("ORM_incidencia", this.getDetachedCriteria());
		comercial = new CollectionExpression("ORM_comercial", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria createAdministradorCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("administrador"));
	}
	
	public ContratoDetachedCriteria createContratosCriteria() {
		return new ContratoDetachedCriteria(createCriteria("ORM_contratos"));
	}
	
	public FacturaDetachedCriteria createFacturaCriteria() {
		return new FacturaDetachedCriteria(createCriteria("ORM_factura"));
	}
	
	public IncidenciaDetachedCriteria createIncidenciaCriteria() {
		return new IncidenciaDetachedCriteria(createCriteria("ORM_incidencia"));
	}
	
	public ComercialDetachedCriteria createComercialCriteria() {
		return new ComercialDetachedCriteria(createCriteria("ORM_comercial"));
	}
	
	public Cliente uniqueCliente(PersistentSession session) {
		return (Cliente) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Cliente[] listCliente(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Cliente[]) list.toArray(new Cliente[list.size()]);
	}
}

