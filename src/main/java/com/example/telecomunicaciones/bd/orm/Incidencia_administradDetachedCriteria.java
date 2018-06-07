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

public class Incidencia_administradDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression comercialId;
	public final AssociationExpression comercial;
	public final IntegerExpression clienteId;
	public final AssociationExpression cliente;
	public final IntegerExpression attribute;
	public final DateExpression fecha;
	public final StringExpression correoCliente;
	public final StringExpression asunto;
	public final StringExpression descripcion;
	public final StringExpression observacion;
	public final StringExpression tipoIncidencia;
	public final StringExpression estado;
	public final IntegerExpression administradorId;
	public final AssociationExpression administrador;
	public final StringExpression correoComercial;
	
	public Incidencia_administradDetachedCriteria() {
		super(com.example.telecomunicaciones.bd.orm.Incidencia_administrad.class, com.example.telecomunicaciones.bd.orm.Incidencia_administradCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		comercialId = new IntegerExpression("comercial.IDComercial", this.getDetachedCriteria());
		comercial = new AssociationExpression("comercial", this.getDetachedCriteria());
		clienteId = new IntegerExpression("cliente.IDCliente", this.getDetachedCriteria());
		cliente = new AssociationExpression("cliente", this.getDetachedCriteria());
		attribute = new IntegerExpression("attribute", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		correoCliente = new StringExpression("correoCliente", this.getDetachedCriteria());
		asunto = new StringExpression("asunto", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		observacion = new StringExpression("observacion", this.getDetachedCriteria());
		tipoIncidencia = new StringExpression("tipoIncidencia", this.getDetachedCriteria());
		estado = new StringExpression("estado", this.getDetachedCriteria());
		administradorId = new IntegerExpression("administrador.IDAdmin", this.getDetachedCriteria());
		administrador = new AssociationExpression("administrador", this.getDetachedCriteria());
		correoComercial = new StringExpression("correoComercial", this.getDetachedCriteria());
	}
	
	public Incidencia_administradDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.example.telecomunicaciones.bd.orm.Incidencia_administradCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		comercialId = new IntegerExpression("comercial.IDComercial", this.getDetachedCriteria());
		comercial = new AssociationExpression("comercial", this.getDetachedCriteria());
		clienteId = new IntegerExpression("cliente.IDCliente", this.getDetachedCriteria());
		cliente = new AssociationExpression("cliente", this.getDetachedCriteria());
		attribute = new IntegerExpression("attribute", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		correoCliente = new StringExpression("correoCliente", this.getDetachedCriteria());
		asunto = new StringExpression("asunto", this.getDetachedCriteria());
		descripcion = new StringExpression("descripcion", this.getDetachedCriteria());
		observacion = new StringExpression("observacion", this.getDetachedCriteria());
		tipoIncidencia = new StringExpression("tipoIncidencia", this.getDetachedCriteria());
		estado = new StringExpression("estado", this.getDetachedCriteria());
		administradorId = new IntegerExpression("administrador.IDAdmin", this.getDetachedCriteria());
		administrador = new AssociationExpression("administrador", this.getDetachedCriteria());
		correoComercial = new StringExpression("correoComercial", this.getDetachedCriteria());
	}
	
	public AdministradorDetachedCriteria createAdministradorCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("administrador"));
	}
	
	public ComercialDetachedCriteria createComercialCriteria() {
		return new ComercialDetachedCriteria(createCriteria("comercial"));
	}
	
	public ClienteDetachedCriteria createClienteCriteria() {
		return new ClienteDetachedCriteria(createCriteria("cliente"));
	}
	
	public Incidencia_administrad uniqueIncidencia_administrad(PersistentSession session) {
		return (Incidencia_administrad) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Incidencia_administrad[] listIncidencia_administrad(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Incidencia_administrad[]) list.toArray(new Incidencia_administrad[list.size()]);
	}
}

