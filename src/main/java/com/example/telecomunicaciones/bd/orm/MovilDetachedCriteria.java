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

public class MovilDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression IDMovil;
	public final DoubleExpression consumoActual;
	public final DoubleExpression consumoMaximo;
	public final StringExpression nombre;
	public final StringExpression caracteristicas;
	public final DoubleExpression precio;
	public final BooleanExpression visibilidad;
	public final IntegerExpression servicioId;
	public final AssociationExpression servicio;
	
	public MovilDetachedCriteria() {
		super(com.example.telecomunicaciones.bd.orm.Movil.class, com.example.telecomunicaciones.bd.orm.MovilCriteria.class);
		IDMovil = new IntegerExpression("IDMovil", this.getDetachedCriteria());
		consumoActual = new DoubleExpression("consumoActual", this.getDetachedCriteria());
		consumoMaximo = new DoubleExpression("consumoMaximo", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		caracteristicas = new StringExpression("caracteristicas", this.getDetachedCriteria());
		precio = new DoubleExpression("precio", this.getDetachedCriteria());
		visibilidad = new BooleanExpression("visibilidad", this.getDetachedCriteria());
		servicioId = new IntegerExpression("servicio.IDMovil", this.getDetachedCriteria());
		servicio = new AssociationExpression("servicio", this.getDetachedCriteria());
	}
	
	public MovilDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.example.telecomunicaciones.bd.orm.MovilCriteria.class);
		IDMovil = new IntegerExpression("IDMovil", this.getDetachedCriteria());
		consumoActual = new DoubleExpression("consumoActual", this.getDetachedCriteria());
		consumoMaximo = new DoubleExpression("consumoMaximo", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		caracteristicas = new StringExpression("caracteristicas", this.getDetachedCriteria());
		precio = new DoubleExpression("precio", this.getDetachedCriteria());
		visibilidad = new BooleanExpression("visibilidad", this.getDetachedCriteria());
		servicioId = new IntegerExpression("servicio.IDMovil", this.getDetachedCriteria());
		servicio = new AssociationExpression("servicio", this.getDetachedCriteria());
	}
	
	public ServicioDetachedCriteria createServicioCriteria() {
		return new ServicioDetachedCriteria(createCriteria("servicio"));
	}
	
	public Movil uniqueMovil(PersistentSession session) {
		return (Movil) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Movil[] listMovil(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Movil[]) list.toArray(new Movil[list.size()]);
	}
}

