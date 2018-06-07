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

public class ComercialCriteria extends AbstractORMCriteria {
	public final IntegerExpression IDComercial;
	public final IntegerExpression administradorId;
	public final AssociationExpression administrador;
	public final StringExpression nombre;
	public final StringExpression apellido1;
	public final StringExpression apellido2;
	public final StringExpression email;
	public final StringExpression nif;
	public final StringExpression password;
	public final CollectionExpression cliente;
	public final CollectionExpression incidencia;
	
	public ComercialCriteria(Criteria criteria) {
		super(criteria);
		IDComercial = new IntegerExpression("IDComercial", this);
		administradorId = new IntegerExpression("administrador.IDAdmin", this);
		administrador = new AssociationExpression("administrador", this);
		nombre = new StringExpression("nombre", this);
		apellido1 = new StringExpression("apellido1", this);
		apellido2 = new StringExpression("apellido2", this);
		email = new StringExpression("email", this);
		nif = new StringExpression("nif", this);
		password = new StringExpression("password", this);
		cliente = new CollectionExpression("ORM_cliente", this);
		incidencia = new CollectionExpression("ORM_incidencia", this);
	}
	
	public ComercialCriteria(PersistentSession session) {
		this(session.createCriteria(Comercial.class));
	}
	
	public ComercialCriteria() throws PersistentException {
		this(MDS2diagramasPersistentManager.instance().getSession());
	}
	
	public AdministradorCriteria createAdministradorCriteria() {
		return new AdministradorCriteria(createCriteria("administrador"));
	}
	
	public ClienteCriteria createClienteCriteria() {
		return new ClienteCriteria(createCriteria("ORM_cliente"));
	}
	
	public IncidenciaCriteria createIncidenciaCriteria() {
		return new IncidenciaCriteria(createCriteria("ORM_incidencia"));
	}
	
	public Comercial uniqueComercial() {
		return (Comercial) super.uniqueResult();
	}
	
	public Comercial[] listComercial() {
		java.util.List list = super.list();
		return (Comercial[]) list.toArray(new Comercial[list.size()]);
	}
}

