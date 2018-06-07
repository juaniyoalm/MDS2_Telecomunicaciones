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

public class CombinadoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression IDCombinado;
	public final StringExpression nombre;
	public final StringExpression caracteristicas;
	public final DoubleExpression precio;
	public final BooleanExpression visibilidad;
	public final CollectionExpression servicio;
	
	public CombinadoDetachedCriteria() {
		super(com.example.telecomunicaciones.bd.orm.Combinado.class, com.example.telecomunicaciones.bd.orm.CombinadoCriteria.class);
		IDCombinado = new IntegerExpression("IDCombinado", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		caracteristicas = new StringExpression("caracteristicas", this.getDetachedCriteria());
		precio = new DoubleExpression("precio", this.getDetachedCriteria());
		visibilidad = new BooleanExpression("visibilidad", this.getDetachedCriteria());
		servicio = new CollectionExpression("ORM_servicio", this.getDetachedCriteria());
	}
	
	public CombinadoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.example.telecomunicaciones.bd.orm.CombinadoCriteria.class);
		IDCombinado = new IntegerExpression("IDCombinado", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		caracteristicas = new StringExpression("caracteristicas", this.getDetachedCriteria());
		precio = new DoubleExpression("precio", this.getDetachedCriteria());
		visibilidad = new BooleanExpression("visibilidad", this.getDetachedCriteria());
		servicio = new CollectionExpression("ORM_servicio", this.getDetachedCriteria());
	}
	
	public ServicioDetachedCriteria createServicioCriteria() {
		return new ServicioDetachedCriteria(createCriteria("ORM_servicio"));
	}
	
	public Combinado uniqueCombinado(PersistentSession session) {
		return (Combinado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Combinado[] listCombinado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Combinado[]) list.toArray(new Combinado[list.size()]);
	}
}

