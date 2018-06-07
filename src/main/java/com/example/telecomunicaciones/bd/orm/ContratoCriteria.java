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

public class ContratoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression attribute;
	public final DateExpression fecha;
	public final IntegerExpression clienteId;
	public final AssociationExpression cliente;
	public final IntegerExpression servicioId;
	public final AssociationExpression servicio;
	
	public ContratoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		attribute = new IntegerExpression("attribute", this);
		fecha = new DateExpression("fecha", this);
		clienteId = new IntegerExpression("ORM_Cliente.null", this);
		cliente = new AssociationExpression("ORM_Cliente", this);
		servicioId = new IntegerExpression("ORM_Servicio.null", this);
		servicio = new AssociationExpression("ORM_Servicio", this);
	}
	
	public ContratoCriteria(PersistentSession session) {
		this(session.createCriteria(Contrato.class));
	}
	
	public ContratoCriteria() throws PersistentException {
		this(MDS2diagramasPersistentManager.instance().getSession());
	}
	
	public ClienteCriteria createClienteCriteria() {
		return new ClienteCriteria(createCriteria("ORM_Cliente"));
	}
	
	public ServicioCriteria createServicioCriteria() {
		return new ServicioCriteria(createCriteria("ORM_Servicio"));
	}
	
	public Contrato uniqueContrato() {
		return (Contrato) super.uniqueResult();
	}
	
	public Contrato[] listContrato() {
		java.util.List list = super.list();
		return (Contrato[]) list.toArray(new Contrato[list.size()]);
	}
}

