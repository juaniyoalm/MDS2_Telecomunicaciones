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

public class MovilCriteria extends AbstractORMCriteria {
	public final IntegerExpression IDMovil;
	public final DoubleExpression consumoActual;
	public final DoubleExpression consumoMaximo;
	public final StringExpression nombre;
	public final StringExpression caracteristicas;
	public final DoubleExpression precio;
	public final BooleanExpression visibilidad;
	public final IntegerExpression servicioId;
	public final AssociationExpression servicio;
	
	public MovilCriteria(Criteria criteria) {
		super(criteria);
		IDMovil = new IntegerExpression("IDMovil", this);
		consumoActual = new DoubleExpression("consumoActual", this);
		consumoMaximo = new DoubleExpression("consumoMaximo", this);
		nombre = new StringExpression("nombre", this);
		caracteristicas = new StringExpression("caracteristicas", this);
		precio = new DoubleExpression("precio", this);
		visibilidad = new BooleanExpression("visibilidad", this);
		servicioId = new IntegerExpression("servicio.IDMovil", this);
		servicio = new AssociationExpression("servicio", this);
	}
	
	public MovilCriteria(PersistentSession session) {
		this(session.createCriteria(Movil.class));
	}
	
	public MovilCriteria() throws PersistentException {
		this(MDS2diagramasPersistentManager.instance().getSession());
	}
	
	public ServicioCriteria createServicioCriteria() {
		return new ServicioCriteria(createCriteria("servicio"));
	}
	
	public Movil uniqueMovil() {
		return (Movil) super.uniqueResult();
	}
	
	public Movil[] listMovil() {
		java.util.List list = super.list();
		return (Movil[]) list.toArray(new Movil[list.size()]);
	}
}

