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

public class CanalDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression IDCanal;
	public final StringExpression nombre;
	public final StringExpression caracteristicas;
	public final DoubleExpression precio;
	public final BooleanExpression visibilidad;
	public final CollectionExpression paquete_TV;
	
	public CanalDetachedCriteria() {
		super(com.example.telecomunicaciones.bd.orm.Canal.class, com.example.telecomunicaciones.bd.orm.CanalCriteria.class);
		IDCanal = new IntegerExpression("IDCanal", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		caracteristicas = new StringExpression("caracteristicas", this.getDetachedCriteria());
		precio = new DoubleExpression("precio", this.getDetachedCriteria());
		visibilidad = new BooleanExpression("visibilidad", this.getDetachedCriteria());
		paquete_TV = new CollectionExpression("ORM_paquete_TV", this.getDetachedCriteria());
	}
	
	public CanalDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.example.telecomunicaciones.bd.orm.CanalCriteria.class);
		IDCanal = new IntegerExpression("IDCanal", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		caracteristicas = new StringExpression("caracteristicas", this.getDetachedCriteria());
		precio = new DoubleExpression("precio", this.getDetachedCriteria());
		visibilidad = new BooleanExpression("visibilidad", this.getDetachedCriteria());
		paquete_TV = new CollectionExpression("ORM_paquete_TV", this.getDetachedCriteria());
	}
	
	public Paquete_TVDetachedCriteria createPaquete_TVCriteria() {
		return new Paquete_TVDetachedCriteria(createCriteria("ORM_paquete_TV"));
	}
	
	public Canal uniqueCanal(PersistentSession session) {
		return (Canal) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Canal[] listCanal(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Canal[]) list.toArray(new Canal[list.size()]);
	}
}

