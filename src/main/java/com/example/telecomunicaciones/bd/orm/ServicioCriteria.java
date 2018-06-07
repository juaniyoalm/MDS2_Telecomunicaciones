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

public class ServicioCriteria extends AbstractORMCriteria {
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
	
	public ServicioCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		paquete_TVId = new IntegerExpression("paquete_TV.IDPaquete", this);
		paquete_TV = new AssociationExpression("paquete_TV", this);
		movilId = new IntegerExpression("movil.IDMovil", this);
		movil = new AssociationExpression("movil", this);
		administradorId = new IntegerExpression("administrador.IDAdmin", this);
		administrador = new AssociationExpression("administrador", this);
		nombre = new StringExpression("nombre", this);
		caracteristicas = new StringExpression("caracteristicas", this);
		precio = new DoubleExpression("precio", this);
		visivilidad = new BooleanExpression("visivilidad", this);
		tipo = new StringExpression("tipo", this);
		fechaEliminacion = new DateExpression("fechaEliminacion", this);
		combinado = new CollectionExpression("ORM_combinado", this);
		factura = new CollectionExpression("ORM_factura", this);
		contratos = new CollectionExpression("ORM_contratos", this);
	}
	
	public ServicioCriteria(PersistentSession session) {
		this(session.createCriteria(Servicio.class));
	}
	
	public ServicioCriteria() throws PersistentException {
		this(MDS2diagramasPersistentManager.instance().getSession());
	}
	
	public Paquete_TVCriteria createPaquete_TVCriteria() {
		return new Paquete_TVCriteria(createCriteria("paquete_TV"));
	}
	
	public MovilCriteria createMovilCriteria() {
		return new MovilCriteria(createCriteria("movil"));
	}
	
	public AdministradorCriteria createAdministradorCriteria() {
		return new AdministradorCriteria(createCriteria("administrador"));
	}
	
	public CombinadoCriteria createCombinadoCriteria() {
		return new CombinadoCriteria(createCriteria("ORM_combinado"));
	}
	
	public FacturaCriteria createFacturaCriteria() {
		return new FacturaCriteria(createCriteria("ORM_factura"));
	}
	
	public ContratoCriteria createContratosCriteria() {
		return new ContratoCriteria(createCriteria("ORM_contratos"));
	}
	
	public Servicio uniqueServicio() {
		return (Servicio) super.uniqueResult();
	}
	
	public Servicio[] listServicio() {
		java.util.List list = super.list();
		return (Servicio[]) list.toArray(new Servicio[list.size()]);
	}
}

