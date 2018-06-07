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

public class ContratoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression attribute;
	public final DateExpression fecha;
	public final IntegerExpression clienteId;
	public final AssociationExpression cliente;
	public final IntegerExpression servicioId;
	public final AssociationExpression servicio;
	
	public ContratoDetachedCriteria() {
		super(com.example.telecomunicaciones.bd.orm.Contrato.class, com.example.telecomunicaciones.bd.orm.ContratoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		attribute = new IntegerExpression("attribute", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		clienteId = new IntegerExpression("ORM_Cliente.null", this.getDetachedCriteria());
		cliente = new AssociationExpression("ORM_Cliente", this.getDetachedCriteria());
		servicioId = new IntegerExpression("ORM_Servicio.null", this.getDetachedCriteria());
		servicio = new AssociationExpression("ORM_Servicio", this.getDetachedCriteria());
	}
	
	public ContratoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.example.telecomunicaciones.bd.orm.ContratoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		attribute = new IntegerExpression("attribute", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		clienteId = new IntegerExpression("ORM_Cliente.null", this.getDetachedCriteria());
		cliente = new AssociationExpression("ORM_Cliente", this.getDetachedCriteria());
		servicioId = new IntegerExpression("ORM_Servicio.null", this.getDetachedCriteria());
		servicio = new AssociationExpression("ORM_Servicio", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria createClienteCriteria() {
		return new ClienteDetachedCriteria(createCriteria("cliente"));
	}
	
	public ServicioDetachedCriteria createServicioCriteria() {
		return new ServicioDetachedCriteria(createCriteria("servicio"));
	}
	
	public Contrato uniqueContrato(PersistentSession session) {
		return (Contrato) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Contrato[] listContrato(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Contrato[]) list.toArray(new Contrato[list.size()]);
	}
}

