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

public class ComercialDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public ComercialDetachedCriteria() {
		super(com.example.telecomunicaciones.bd.orm.Comercial.class, com.example.telecomunicaciones.bd.orm.ComercialCriteria.class);
		IDComercial = new IntegerExpression("IDComercial", this.getDetachedCriteria());
		administradorId = new IntegerExpression("administrador.IDAdmin", this.getDetachedCriteria());
		administrador = new AssociationExpression("administrador", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido1 = new StringExpression("apellido1", this.getDetachedCriteria());
		apellido2 = new StringExpression("apellido2", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		nif = new StringExpression("nif", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		cliente = new CollectionExpression("ORM_cliente", this.getDetachedCriteria());
		incidencia = new CollectionExpression("ORM_incidencia", this.getDetachedCriteria());
	}
	
	public ComercialDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.example.telecomunicaciones.bd.orm.ComercialCriteria.class);
		IDComercial = new IntegerExpression("IDComercial", this.getDetachedCriteria());
		administradorId = new IntegerExpression("administrador.IDAdmin", this.getDetachedCriteria());
		administrador = new AssociationExpression("administrador", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido1 = new StringExpression("apellido1", this.getDetachedCriteria());
		apellido2 = new StringExpression("apellido2", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		nif = new StringExpression("nif", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		cliente = new CollectionExpression("ORM_cliente", this.getDetachedCriteria());
		incidencia = new CollectionExpression("ORM_incidencia", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria createAdministradorCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("administrador"));
	}
	
	public ClienteDetachedCriteria createClienteCriteria() {
		return new ClienteDetachedCriteria(createCriteria("ORM_cliente"));
	}
	
	public IncidenciaDetachedCriteria createIncidenciaCriteria() {
		return new IncidenciaDetachedCriteria(createCriteria("ORM_incidencia"));
	}
	
	public Comercial uniqueComercial(PersistentSession session) {
		return (Comercial) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Comercial[] listComercial(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Comercial[]) list.toArray(new Comercial[list.size()]);
	}
}

