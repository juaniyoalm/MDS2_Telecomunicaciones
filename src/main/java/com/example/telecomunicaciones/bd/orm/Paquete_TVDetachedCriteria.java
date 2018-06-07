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

public class Paquete_TVDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression IDPaquete;
	public final StringExpression nombre;
	public final StringExpression caracteristicas;
	public final DoubleExpression precio;
	public final BooleanExpression visibilidad;
	public final CollectionExpression canal;
	public final IntegerExpression servicioId;
	public final AssociationExpression servicio;
	
	public Paquete_TVDetachedCriteria() {
		super(com.example.telecomunicaciones.bd.orm.Paquete_TV.class, com.example.telecomunicaciones.bd.orm.Paquete_TVCriteria.class);
		IDPaquete = new IntegerExpression("IDPaquete", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		caracteristicas = new StringExpression("caracteristicas", this.getDetachedCriteria());
		precio = new DoubleExpression("precio", this.getDetachedCriteria());
		visibilidad = new BooleanExpression("visibilidad", this.getDetachedCriteria());
		canal = new CollectionExpression("ORM_canal", this.getDetachedCriteria());
		servicioId = new IntegerExpression("servicio.IDPaquete", this.getDetachedCriteria());
		servicio = new AssociationExpression("servicio", this.getDetachedCriteria());
	}
	
	public Paquete_TVDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.example.telecomunicaciones.bd.orm.Paquete_TVCriteria.class);
		IDPaquete = new IntegerExpression("IDPaquete", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		caracteristicas = new StringExpression("caracteristicas", this.getDetachedCriteria());
		precio = new DoubleExpression("precio", this.getDetachedCriteria());
		visibilidad = new BooleanExpression("visibilidad", this.getDetachedCriteria());
		canal = new CollectionExpression("ORM_canal", this.getDetachedCriteria());
		servicioId = new IntegerExpression("servicio.IDPaquete", this.getDetachedCriteria());
		servicio = new AssociationExpression("servicio", this.getDetachedCriteria());
	}
	
	public CanalDetachedCriteria createCanalCriteria() {
		return new CanalDetachedCriteria(createCriteria("ORM_canal"));
	}
	
	public ServicioDetachedCriteria createServicioCriteria() {
		return new ServicioDetachedCriteria(createCriteria("servicio"));
	}
	
	public Paquete_TV uniquePaquete_TV(PersistentSession session) {
		return (Paquete_TV) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Paquete_TV[] listPaquete_TV(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Paquete_TV[]) list.toArray(new Paquete_TV[list.size()]);
	}
}

