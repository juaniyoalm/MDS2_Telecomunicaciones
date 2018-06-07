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

public class IncidenciaDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public IncidenciaDetachedCriteria() {
		super(com.example.telecomunicaciones.bd.orm.Incidencia.class, com.example.telecomunicaciones.bd.orm.IncidenciaCriteria.class);
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
	}
	
	public IncidenciaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.example.telecomunicaciones.bd.orm.IncidenciaCriteria.class);
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
	}
	
	public ComercialDetachedCriteria createComercialCriteria() {
		return new ComercialDetachedCriteria(createCriteria("comercial"));
	}
	
	public ClienteDetachedCriteria createClienteCriteria() {
		return new ClienteDetachedCriteria(createCriteria("cliente"));
	}
	
	public Incidencia uniqueIncidencia(PersistentSession session) {
		return (Incidencia) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Incidencia[] listIncidencia(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Incidencia[]) list.toArray(new Incidencia[list.size()]);
	}
}

