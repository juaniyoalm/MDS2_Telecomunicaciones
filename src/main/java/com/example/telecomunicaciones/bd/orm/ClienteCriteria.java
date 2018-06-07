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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ClienteCriteria extends AbstractORMCriteria {
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
	
	public ClienteCriteria(Criteria criteria) {
		super(criteria);
		IDCliente = new IntegerExpression("IDCliente", this);
		administradorId = new IntegerExpression("administrador.IDAdmin", this);
		administrador = new AssociationExpression("administrador", this);
		nombre = new StringExpression("nombre", this);
		apellido1 = new StringExpression("apellido1", this);
		apellido2 = new StringExpression("apellido2", this);
		telefono = new StringExpression("telefono", this);
		email = new StringExpression("email", this);
		nif = new StringExpression("nif", this);
		password = new StringExpression("password", this);
		contratos = new CollectionExpression("ORM_contratos", this);
		factura = new CollectionExpression("ORM_factura", this);
		incidencia = new CollectionExpression("ORM_incidencia", this);
		comercial = new CollectionExpression("ORM_comercial", this);
	}
	
	public ClienteCriteria(PersistentSession session) {
		this(session.createCriteria(Cliente.class));
	}
	
	public ClienteCriteria() throws PersistentException {
		this(MDS2diagramasPersistentManager.instance().getSession());
	}
	
	public AdministradorCriteria createAdministradorCriteria() {
		return new AdministradorCriteria(createCriteria("administrador"));
	}
	
	public ContratoCriteria createContratosCriteria() {
		return new ContratoCriteria(createCriteria("ORM_contratos"));
	}
	
	public FacturaCriteria createFacturaCriteria() {
		return new FacturaCriteria(createCriteria("ORM_factura"));
	}
	
	public IncidenciaCriteria createIncidenciaCriteria() {
		return new IncidenciaCriteria(createCriteria("ORM_incidencia"));
	}
	
	public ComercialCriteria createComercialCriteria() {
		return new ComercialCriteria(createCriteria("ORM_comercial"));
	}
	
	public Cliente uniqueCliente() {
		return (Cliente) super.uniqueResult();
	}
	
	public Cliente[] listCliente() {
		java.util.List list = super.list();
		return (Cliente[]) list.toArray(new Cliente[list.size()]);
	}
}

