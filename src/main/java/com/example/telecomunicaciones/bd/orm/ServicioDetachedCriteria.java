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

public class ServicioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression paquete_TVId;
	public final AssociationExpression paquete_TV;
	public final IntegerExpression movilId;
	public final AssociationExpression movil;
	public final IntegerExpression administradorId;
	public final AssociationExpression administrador;
	public final StringExpression nombre;
	public final StringExpression caracteristicas;
	public final DoubleExpression precio;
	public final BooleanExpression visivilidad;
	public final StringExpression tipo;
	public final DateExpression fechaEliminacion;
	public final CollectionExpression combinado;
	public final CollectionExpression factura;
	public final CollectionExpression contratos;
	
	public ServicioDetachedCriteria() {
		super(com.example.telecomunicaciones.bd.orm.Servicio.class, com.example.telecomunicaciones.bd.orm.ServicioCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		paquete_TVId = new IntegerExpression("paquete_TV.IDPaquete", this.getDetachedCriteria());
		paquete_TV = new AssociationExpression("paquete_TV", this.getDetachedCriteria());
		movilId = new IntegerExpression("movil.IDMovil", this.getDetachedCriteria());
		movil = new AssociationExpression("movil", this.getDetachedCriteria());
		administradorId = new IntegerExpression("administrador.IDAdmin", this.getDetachedCriteria());
		administrador = new AssociationExpression("administrador", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		caracteristicas = new StringExpression("caracteristicas", this.getDetachedCriteria());
		precio = new DoubleExpression("precio", this.getDetachedCriteria());
		visivilidad = new BooleanExpression("visivilidad", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
		fechaEliminacion = new DateExpression("fechaEliminacion", this.getDetachedCriteria());
		combinado = new CollectionExpression("ORM_combinado", this.getDetachedCriteria());
		factura = new CollectionExpression("ORM_factura", this.getDetachedCriteria());
		contratos = new CollectionExpression("ORM_contratos", this.getDetachedCriteria());
	}
	
	public ServicioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.example.telecomunicaciones.bd.orm.ServicioCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		paquete_TVId = new IntegerExpression("paquete_TV.IDPaquete", this.getDetachedCriteria());
		paquete_TV = new AssociationExpression("paquete_TV", this.getDetachedCriteria());
		movilId = new IntegerExpression("movil.IDMovil", this.getDetachedCriteria());
		movil = new AssociationExpression("movil", this.getDetachedCriteria());
		administradorId = new IntegerExpression("administrador.IDAdmin", this.getDetachedCriteria());
		administrador = new AssociationExpression("administrador", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		caracteristicas = new StringExpression("caracteristicas", this.getDetachedCriteria());
		precio = new DoubleExpression("precio", this.getDetachedCriteria());
		visivilidad = new BooleanExpression("visivilidad", this.getDetachedCriteria());
		tipo = new StringExpression("tipo", this.getDetachedCriteria());
		fechaEliminacion = new DateExpression("fechaEliminacion", this.getDetachedCriteria());
		combinado = new CollectionExpression("ORM_combinado", this.getDetachedCriteria());
		factura = new CollectionExpression("ORM_factura", this.getDetachedCriteria());
		contratos = new CollectionExpression("ORM_contratos", this.getDetachedCriteria());
	}
	
	public Paquete_TVDetachedCriteria createPaquete_TVCriteria() {
		return new Paquete_TVDetachedCriteria(createCriteria("paquete_TV"));
	}
	
	public MovilDetachedCriteria createMovilCriteria() {
		return new MovilDetachedCriteria(createCriteria("movil"));
	}
	
	public AdministradorDetachedCriteria createAdministradorCriteria() {
		return new AdministradorDetachedCriteria(createCriteria("administrador"));
	}
	
	public CombinadoDetachedCriteria createCombinadoCriteria() {
		return new CombinadoDetachedCriteria(createCriteria("ORM_combinado"));
	}
	
	public FacturaDetachedCriteria createFacturaCriteria() {
		return new FacturaDetachedCriteria(createCriteria("ORM_factura"));
	}
	
	public ContratoDetachedCriteria createContratosCriteria() {
		return new ContratoDetachedCriteria(createCriteria("ORM_contratos"));
	}
	
	public Servicio uniqueServicio(PersistentSession session) {
		return (Servicio) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Servicio[] listServicio(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Servicio[]) list.toArray(new Servicio[list.size()]);
	}
}

