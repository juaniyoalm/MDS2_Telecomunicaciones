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

public class Paquete_TVCriteria extends AbstractORMCriteria {
	public final IntegerExpression IDPaquete;
	public final StringExpression nombre;
	public final StringExpression caracteristicas;
	public final DoubleExpression precio;
	public final BooleanExpression visibilidad;
	public final CollectionExpression canal;
	public final IntegerExpression servicioId;
	public final AssociationExpression servicio;
	
	public Paquete_TVCriteria(Criteria criteria) {
		super(criteria);
		IDPaquete = new IntegerExpression("IDPaquete", this);
		nombre = new StringExpression("nombre", this);
		caracteristicas = new StringExpression("caracteristicas", this);
		precio = new DoubleExpression("precio", this);
		visibilidad = new BooleanExpression("visibilidad", this);
		canal = new CollectionExpression("ORM_canal", this);
		servicioId = new IntegerExpression("servicio.IDPaquete", this);
		servicio = new AssociationExpression("servicio", this);
	}
	
	public Paquete_TVCriteria(PersistentSession session) {
		this(session.createCriteria(Paquete_TV.class));
	}
	
	public Paquete_TVCriteria() throws PersistentException {
		this(MDS2diagramasPersistentManager.instance().getSession());
	}
	
	public CanalCriteria createCanalCriteria() {
		return new CanalCriteria(createCriteria("ORM_canal"));
	}
	
	public ServicioCriteria createServicioCriteria() {
		return new ServicioCriteria(createCriteria("servicio"));
	}
	
	public Paquete_TV uniquePaquete_TV() {
		return (Paquete_TV) super.uniqueResult();
	}
	
	public Paquete_TV[] listPaquete_TV() {
		java.util.List list = super.list();
		return (Paquete_TV[]) list.toArray(new Paquete_TV[list.size()]);
	}
}

