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

public class AdministradorCriteria extends AbstractORMCriteria {
	public final IntegerExpression IDAdmin;
	public final StringExpression nombre;
	public final StringExpression apellido1;
	public final StringExpression apellido2;
	public final StringExpression email;
	public final StringExpression nif;
	public final StringExpression password;
	public final CollectionExpression cliente;
	public final CollectionExpression comercial;
	public final CollectionExpression incidencia_administrad;
	public final CollectionExpression servicioDestacado;
	
	public AdministradorCriteria(Criteria criteria) {
		super(criteria);
		IDAdmin = new IntegerExpression("IDAdmin", this);
		nombre = new StringExpression("nombre", this);
		apellido1 = new StringExpression("apellido1", this);
		apellido2 = new StringExpression("apellido2", this);
		email = new StringExpression("email", this);
		nif = new StringExpression("nif", this);
		password = new StringExpression("password", this);
		cliente = new CollectionExpression("ORM_cliente", this);
		comercial = new CollectionExpression("ORM_comercial", this);
		incidencia_administrad = new CollectionExpression("ORM_incidencia_administrad", this);
		servicioDestacado = new CollectionExpression("ORM_servicioDestacado", this);
	}
	
	public AdministradorCriteria(PersistentSession session) {
		this(session.createCriteria(Administrador.class));
	}
	
	public AdministradorCriteria() throws PersistentException {
		this(MDS2diagramasPersistentManager.instance().getSession());
	}
	
	public ClienteCriteria createClienteCriteria() {
		return new ClienteCriteria(createCriteria("ORM_cliente"));
	}
	
	public ComercialCriteria createComercialCriteria() {
		return new ComercialCriteria(createCriteria("ORM_comercial"));
	}
	
	public Incidencia_administradCriteria createIncidencia_administradCriteria() {
		return new Incidencia_administradCriteria(createCriteria("ORM_incidencia_administrad"));
	}
	
	public ServicioCriteria createServicioDestacadoCriteria() {
		return new ServicioCriteria(createCriteria("ORM_servicioDestacado"));
	}
	
	public Administrador uniqueAdministrador() {
		return (Administrador) super.uniqueResult();
	}
	
	public Administrador[] listAdministrador() {
		java.util.List list = super.list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

