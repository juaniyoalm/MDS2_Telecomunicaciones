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

public class FacturaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression clienteId;
	public final AssociationExpression cliente;
	public final IntegerExpression attribute;
	public final StringExpression nombre;
	public final DateExpression fecha;
	public final StringExpression nombreCliente;
	public final StringExpression apellidosCliente;
	public final StringExpression nifCliente;
	public final StringExpression direccionCliente;
	public final StringExpression telefonoCliente;
	public final DoubleExpression precioTotal;
	public final CollectionExpression servicio;
	
	public FacturaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		clienteId = new IntegerExpression("cliente.IDCliente", this);
		cliente = new AssociationExpression("cliente", this);
		attribute = new IntegerExpression("attribute", this);
		nombre = new StringExpression("nombre", this);
		fecha = new DateExpression("fecha", this);
		nombreCliente = new StringExpression("nombreCliente", this);
		apellidosCliente = new StringExpression("apellidosCliente", this);
		nifCliente = new StringExpression("nifCliente", this);
		direccionCliente = new StringExpression("direccionCliente", this);
		telefonoCliente = new StringExpression("telefonoCliente", this);
		precioTotal = new DoubleExpression("precioTotal", this);
		servicio = new CollectionExpression("ORM_servicio", this);
	}
	
	public FacturaCriteria(PersistentSession session) {
		this(session.createCriteria(Factura.class));
	}
	
	public FacturaCriteria() throws PersistentException {
		this(MDS2diagramasPersistentManager.instance().getSession());
	}
	
	public ClienteCriteria createClienteCriteria() {
		return new ClienteCriteria(createCriteria("cliente"));
	}
	
	public ServicioCriteria createServicioCriteria() {
		return new ServicioCriteria(createCriteria("ORM_servicio"));
	}
	
	public Factura uniqueFactura() {
		return (Factura) super.uniqueResult();
	}
	
	public Factura[] listFactura() {
		java.util.List list = super.list();
		return (Factura[]) list.toArray(new Factura[list.size()]);
	}
}

