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

public class CanalCriteria extends AbstractORMCriteria {
	public final IntegerExpression IDCanal;
	public final StringExpression nombre;
	public final StringExpression caracteristicas;
	public final DoubleExpression precio;
	public final BooleanExpression visibilidad;
	public final CollectionExpression paquete_TV;
	
	public CanalCriteria(Criteria criteria) {
		super(criteria);
		IDCanal = new IntegerExpression("IDCanal", this);
		nombre = new StringExpression("nombre", this);
		caracteristicas = new StringExpression("caracteristicas", this);
		precio = new DoubleExpression("precio", this);
		visibilidad = new BooleanExpression("visibilidad", this);
		paquete_TV = new CollectionExpression("ORM_paquete_TV", this);
	}
	
	public CanalCriteria(PersistentSession session) {
		this(session.createCriteria(Canal.class));
	}
	
	public CanalCriteria() throws PersistentException {
		this(MDS2diagramasPersistentManager.instance().getSession());
	}
	
	public Paquete_TVCriteria createPaquete_TVCriteria() {
		return new Paquete_TVCriteria(createCriteria("ORM_paquete_TV"));
	}
	
	public Canal uniqueCanal() {
		return (Canal) super.uniqueResult();
	}
	
	public Canal[] listCanal() {
		java.util.List list = super.list();
		return (Canal[]) list.toArray(new Canal[list.size()]);
	}
}

