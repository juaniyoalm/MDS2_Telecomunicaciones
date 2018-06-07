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

public class AdministradorDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public AdministradorDetachedCriteria() {
		super(com.example.telecomunicaciones.bd.orm.Administrador.class, com.example.telecomunicaciones.bd.orm.AdministradorCriteria.class);
		IDAdmin = new IntegerExpression("IDAdmin", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido1 = new StringExpression("apellido1", this.getDetachedCriteria());
		apellido2 = new StringExpression("apellido2", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		nif = new StringExpression("nif", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		cliente = new CollectionExpression("ORM_cliente", this.getDetachedCriteria());
		comercial = new CollectionExpression("ORM_comercial", this.getDetachedCriteria());
		incidencia_administrad = new CollectionExpression("ORM_incidencia_administrad", this.getDetachedCriteria());
		servicioDestacado = new CollectionExpression("ORM_servicioDestacado", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.example.telecomunicaciones.bd.orm.AdministradorCriteria.class);
		IDAdmin = new IntegerExpression("IDAdmin", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido1 = new StringExpression("apellido1", this.getDetachedCriteria());
		apellido2 = new StringExpression("apellido2", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		nif = new StringExpression("nif", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		cliente = new CollectionExpression("ORM_cliente", this.getDetachedCriteria());
		comercial = new CollectionExpression("ORM_comercial", this.getDetachedCriteria());
		incidencia_administrad = new CollectionExpression("ORM_incidencia_administrad", this.getDetachedCriteria());
		servicioDestacado = new CollectionExpression("ORM_servicioDestacado", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria createClienteCriteria() {
		return new ClienteDetachedCriteria(createCriteria("ORM_cliente"));
	}
	
	public ComercialDetachedCriteria createComercialCriteria() {
		return new ComercialDetachedCriteria(createCriteria("ORM_comercial"));
	}
	
	public Incidencia_administradDetachedCriteria createIncidencia_administradCriteria() {
		return new Incidencia_administradDetachedCriteria(createCriteria("ORM_incidencia_administrad"));
	}
	
	public ServicioDetachedCriteria createServicioDestacadoCriteria() {
		return new ServicioDetachedCriteria(createCriteria("ORM_servicioDestacado"));
	}
	
	public Administrador uniqueAdministrador(PersistentSession session) {
		return (Administrador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Administrador[] listAdministrador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Administrador[]) list.toArray(new Administrador[list.size()]);
	}
}

