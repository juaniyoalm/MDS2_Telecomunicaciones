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

public class FacturaDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public FacturaDetachedCriteria() {
		super(com.example.telecomunicaciones.bd.orm.Factura.class, com.example.telecomunicaciones.bd.orm.FacturaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		clienteId = new IntegerExpression("cliente.IDCliente", this.getDetachedCriteria());
		cliente = new AssociationExpression("cliente", this.getDetachedCriteria());
		attribute = new IntegerExpression("attribute", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		nombreCliente = new StringExpression("nombreCliente", this.getDetachedCriteria());
		apellidosCliente = new StringExpression("apellidosCliente", this.getDetachedCriteria());
		nifCliente = new StringExpression("nifCliente", this.getDetachedCriteria());
		direccionCliente = new StringExpression("direccionCliente", this.getDetachedCriteria());
		telefonoCliente = new StringExpression("telefonoCliente", this.getDetachedCriteria());
		precioTotal = new DoubleExpression("precioTotal", this.getDetachedCriteria());
		servicio = new CollectionExpression("ORM_servicio", this.getDetachedCriteria());
	}
	
	public FacturaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.example.telecomunicaciones.bd.orm.FacturaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		clienteId = new IntegerExpression("cliente.IDCliente", this.getDetachedCriteria());
		cliente = new AssociationExpression("cliente", this.getDetachedCriteria());
		attribute = new IntegerExpression("attribute", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		fecha = new DateExpression("fecha", this.getDetachedCriteria());
		nombreCliente = new StringExpression("nombreCliente", this.getDetachedCriteria());
		apellidosCliente = new StringExpression("apellidosCliente", this.getDetachedCriteria());
		nifCliente = new StringExpression("nifCliente", this.getDetachedCriteria());
		direccionCliente = new StringExpression("direccionCliente", this.getDetachedCriteria());
		telefonoCliente = new StringExpression("telefonoCliente", this.getDetachedCriteria());
		precioTotal = new DoubleExpression("precioTotal", this.getDetachedCriteria());
		servicio = new CollectionExpression("ORM_servicio", this.getDetachedCriteria());
	}
	
	public ClienteDetachedCriteria createClienteCriteria() {
		return new ClienteDetachedCriteria(createCriteria("cliente"));
	}
	
	public ServicioDetachedCriteria createServicioCriteria() {
		return new ServicioDetachedCriteria(createCriteria("ORM_servicio"));
	}
	
	public Factura uniqueFactura(PersistentSession session) {
		return (Factura) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Factura[] listFactura(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Factura[]) list.toArray(new Factura[list.size()]);
	}
}

