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

public class IncidenciaCriteria extends AbstractORMCriteria {
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
	
	public IncidenciaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		comercialId = new IntegerExpression("comercial.IDComercial", this);
		comercial = new AssociationExpression("comercial", this);
		clienteId = new IntegerExpression("cliente.IDCliente", this);
		cliente = new AssociationExpression("cliente", this);
		attribute = new IntegerExpression("attribute", this);
		fecha = new DateExpression("fecha", this);
		correoCliente = new StringExpression("correoCliente", this);
		asunto = new StringExpression("asunto", this);
		descripcion = new StringExpression("descripcion", this);
		observacion = new StringExpression("observacion", this);
		tipoIncidencia = new StringExpression("tipoIncidencia", this);
		estado = new StringExpression("estado", this);
	}
	
	public IncidenciaCriteria(PersistentSession session) {
		this(session.createCriteria(Incidencia.class));
	}
	
	public IncidenciaCriteria() throws PersistentException {
		this(MDS2diagramasPersistentManager.instance().getSession());
	}
	
	public ComercialCriteria createComercialCriteria() {
		return new ComercialCriteria(createCriteria("comercial"));
	}
	
	public ClienteCriteria createClienteCriteria() {
		return new ClienteCriteria(createCriteria("cliente"));
	}
	
	public Incidencia uniqueIncidencia() {
		return (Incidencia) super.uniqueResult();
	}
	
	public Incidencia[] listIncidencia() {
		java.util.List list = super.list();
		return (Incidencia[]) list.toArray(new Incidencia[list.size()]);
	}
}

