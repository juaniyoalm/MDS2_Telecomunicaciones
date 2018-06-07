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

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class ServicioDAO {
	public static Servicio loadServicioByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadServicioByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio getServicioByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return getServicioByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio loadServicioByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadServicioByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio getServicioByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return getServicioByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio loadServicioByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Servicio) session.load(com.example.telecomunicaciones.bd.orm.Servicio.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio getServicioByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Servicio) session.get(com.example.telecomunicaciones.bd.orm.Servicio.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio loadServicioByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Servicio) session.load(com.example.telecomunicaciones.bd.orm.Servicio.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio getServicioByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Servicio) session.get(com.example.telecomunicaciones.bd.orm.Servicio.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryServicio(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return queryServicio(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryServicio(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return queryServicio(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio[] listServicioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return listServicioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio[] listServicioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return listServicioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryServicio(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Servicio as Servicio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryServicio(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Servicio as Servicio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Servicio", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio[] listServicioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryServicio(session, condition, orderBy);
			return (Servicio[]) list.toArray(new Servicio[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio[] listServicioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryServicio(session, condition, orderBy, lockMode);
			return (Servicio[]) list.toArray(new Servicio[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio loadServicioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadServicioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio loadServicioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return loadServicioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio loadServicioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Servicio[] servicios = listServicioByQuery(session, condition, orderBy);
		if (servicios != null && servicios.length > 0)
			return servicios[0];
		else
			return null;
	}
	
	public static Servicio loadServicioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Servicio[] servicios = listServicioByQuery(session, condition, orderBy, lockMode);
		if (servicios != null && servicios.length > 0)
			return servicios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateServicioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return iterateServicioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateServicioByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = MDS2diagramasPersistentManager.instance().getSession();
			return iterateServicioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateServicioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Servicio as Servicio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateServicioByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.example.telecomunicaciones.bd.orm.Servicio as Servicio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Servicio", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio createServicio() {
		return new com.example.telecomunicaciones.bd.orm.Servicio();
	}
	
	public static boolean save(com.example.telecomunicaciones.bd.orm.Servicio servicio) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().saveObject(servicio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.example.telecomunicaciones.bd.orm.Servicio servicio) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().deleteObject(servicio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.example.telecomunicaciones.bd.orm.Servicio servicio)throws PersistentException {
		try {
			if (servicio.getPaquete_TV() != null) {
				servicio.getPaquete_TV().setServicio(null);
			}
			
			if (servicio.getMovil() != null) {
				servicio.getMovil().setServicio(null);
			}
			
			if (servicio.getAdministrador() != null) {
				servicio.getAdministrador().servicioDestacado.remove(servicio);
			}
			
			com.example.telecomunicaciones.bd.orm.Combinado[] lCombinados = servicio.combinado.toArray();
			for(int i = 0; i < lCombinados.length; i++) {
				lCombinados[i].servicio.remove(servicio);
			}
			com.example.telecomunicaciones.bd.orm.Factura[] lFacturas = servicio.factura.toArray();
			for(int i = 0; i < lFacturas.length; i++) {
				lFacturas[i].servicio.remove(servicio);
			}
			com.example.telecomunicaciones.bd.orm.Contrato[] lContratoss = servicio.contratos.toArray();
			for(int i = 0; i < lContratoss.length; i++) {
				lContratoss[i].setServicio(null);
			}
			return delete(servicio);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.example.telecomunicaciones.bd.orm.Servicio servicio, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (servicio.getPaquete_TV() != null) {
				servicio.getPaquete_TV().setServicio(null);
			}
			
			if (servicio.getMovil() != null) {
				servicio.getMovil().setServicio(null);
			}
			
			if (servicio.getAdministrador() != null) {
				servicio.getAdministrador().servicioDestacado.remove(servicio);
			}
			
			com.example.telecomunicaciones.bd.orm.Combinado[] lCombinados = servicio.combinado.toArray();
			for(int i = 0; i < lCombinados.length; i++) {
				lCombinados[i].servicio.remove(servicio);
			}
			com.example.telecomunicaciones.bd.orm.Factura[] lFacturas = servicio.factura.toArray();
			for(int i = 0; i < lFacturas.length; i++) {
				lFacturas[i].servicio.remove(servicio);
			}
			com.example.telecomunicaciones.bd.orm.Contrato[] lContratoss = servicio.contratos.toArray();
			for(int i = 0; i < lContratoss.length; i++) {
				lContratoss[i].setServicio(null);
			}
			try {
				session.delete(servicio);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(com.example.telecomunicaciones.bd.orm.Servicio servicio) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().getSession().refresh(servicio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.example.telecomunicaciones.bd.orm.Servicio servicio) throws PersistentException {
		try {
			MDS2diagramasPersistentManager.instance().getSession().evict(servicio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Servicio loadServicioByCriteria(ServicioCriteria servicioCriteria) {
		Servicio[] servicios = listServicioByCriteria(servicioCriteria);
		if(servicios == null || servicios.length == 0) {
			return null;
		}
		return servicios[0];
	}
	
	public static Servicio[] listServicioByCriteria(ServicioCriteria servicioCriteria) {
		return servicioCriteria.listServicio();
	}
}
