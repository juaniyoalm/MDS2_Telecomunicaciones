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

public class CombinadoCriteria extends AbstractORMCriteria {
	public final IntegerExpression IDCombinado;
	public final StringExpression nombre;
	public final StringExpression caracteristicas;
	public final DoubleExpression precio;
	public final BooleanExpression visibilidad;
	public final CollectionExpression servicio;
	
	public CombinadoCriteria(Criteria criteria) {
		super(criteria);
		IDCombinado = new IntegerExpression("IDCombinado", this);
		nombre = new StringExpression("nombre", this);
		caracteristicas = new StringExpression("caracteristicas", this);
		precio = new DoubleExpression("precio", this);
		visibilidad = new BooleanExpression("visibilidad", this);
		servicio = new CollectionExpression("ORM_servicio", this);
	}
	
	public CombinadoCriteria(PersistentSession session) {
		this(session.createCriteria(Combinado.class));
	}
	
	public CombinadoCriteria() throws PersistentException {
		this(MDS2diagramasPersistentManager.instance().getSession());
	}
	
	public ServicioCriteria createServicioCriteria() {
		return new ServicioCriteria(createCriteria("ORM_servicio"));
	}
	
	public Combinado uniqueCombinado() {
		return (Combinado) super.uniqueResult();
	}
	
	public Combinado[] listCombinado() {
		java.util.List list = super.list();
		return (Combinado[]) list.toArray(new Combinado[list.size()]);
	}
}

